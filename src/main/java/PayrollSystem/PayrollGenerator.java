package PayrollSystem;

import DatabaseConnection.DatabaseEmployeeDAO;
import DatabaseConnection.DeductionsDAO;
import DatabaseConnection.PayrollDAO;
import entities.DeductionRates.PhilHealthRate;
import entities.DeductionRates.SSSRate;
import entities.DeductionRates.TaxRate;
import entities.Employee;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class PayrollGenerator {

    private PayrollDAO payrollDAO;
    private DatabaseEmployeeDAO employeeDAO;
    private DeductionsDAO deductionsDAO;
    private PayrollCalculator payrollCalculator;
    private CalculateBenefits calculateBenefits;
    private DeductionsCalculator deductionsCalculator;

    public PayrollGenerator() {
        // Initialize DAOs and calculators
        this.payrollDAO = new PayrollDAO();
        this.employeeDAO = new DatabaseEmployeeDAO();
        this.deductionsDAO = new DeductionsDAO();

        // Fetch deduction rates
        List<SSSRate> sssRates = deductionsDAO.fetchSSSRates();
        List<PhilHealthRate> philHealthRates = deductionsDAO.fetchPhilHealthRates();
        List<TaxRate> taxRates = deductionsDAO.fetchTaxRates();

        // Initialize calculators
        this.deductionsCalculator = new DeductionsCalculator(sssRates, philHealthRates, taxRates);
        this.calculateBenefits = new CalculateBenefits();
        this.payrollCalculator = new PayrollCalculator();
    }

    public void generatePayrollForAllEmployees(LocalDate startDate, LocalDate endDate, String generatedBy) {
        try {
            // Fetch all employee details
            List<Employee> employees = employeeDAO.getAllEmployees();

            if (employees != null && !employees.isEmpty()) {
                // Save payroll record and get PayrollID
                int payrollId = payrollDAO.savePayroll(startDate, endDate, generatedBy);

                if (payrollId > 0) {
                    // Iterate over each employee to generate payroll
                    for (Employee employee : employees) {
                        generatePayrollForEmployee(employee, startDate, endDate, payrollId);
                    }

                    System.out.println("Payroll generated successfully for all employees.");

                } else {
                    System.out.println("Failed to generate payroll record.");
                }

            } else {
                System.out.println("No employees found.");
            }

        } catch (SQLException e) {
            // Log and handle SQL errors
            System.err.println("Error executing payroll calculations: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void generatePayrollForEmployee(Employee employee, LocalDate startDate, LocalDate endDate, int payrollId) throws SQLException {
        int employeeId = employee.getEmployeeId();
        double basicSalary = employee.getBasicSalary();
        double hourlyRate = employee.getHourlyRate();

        // Calculate gross pay
        double grossPay = payrollCalculator.calculateGrossPay(employeeId, startDate, endDate, hourlyRate);

        // Calculate benefits and deductions
        double totalBenefits = calculateBenefits.getTotalBenefits(employeeId);
        double halfBenefits = totalBenefits / 2;

        double sssRate = deductionsCalculator.calculateSSS(basicSalary) / 2;
        double philHealthRate = deductionsCalculator.calculatePhilHealth(basicSalary) / 2;
        double pagIBIGDeduction = deductionsCalculator.calculatePagIBIGDeduction() / 2;
        double totalDeductions = deductionsCalculator.calculateTotalDeductions(basicSalary) / 2;

        double taxableIncome = deductionsCalculator.calculateTaxableIncome(grossPay, totalDeductions);
        double withholdingTax = deductionsCalculator.calculateWithholdingTax(taxableIncome);

        // Calculate net pay
        double netPay = grossPay - totalDeductions - withholdingTax;

        // Save payslip data
        String payslipNo = generatePayslipNo(employeeId, endDate);
        double hoursWorked = payrollCalculator.calculateTotalHoursWorked(employeeId, startDate, endDate);
        payrollDAO.savePayslip(payslipNo, payrollId, employeeId, grossPay, hoursWorked, halfBenefits, totalDeductions, withholdingTax, netPay);
    }

    private String generatePayslipNo(int employeeId, LocalDate endDate) {
        return employeeId + "-" + endDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
}
