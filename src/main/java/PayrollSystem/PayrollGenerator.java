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

    public void generatePayroll(int employeeId, LocalDate startDate, LocalDate endDate, double hourlyRate, String generatedBy) {
        try {
            // Fetch employee details from database
            DatabaseEmployeeDAO employeeDAO = new DatabaseEmployeeDAO();
            Employee employee = employeeDAO.getEmployeeById(employeeId);

            if (employee != null) {
                // Fetch deduction rates from database
                DeductionsDAO deductionsDAO = new DeductionsDAO();
                List<SSSRate> sssRates = deductionsDAO.fetchSSSRates();
                List<PhilHealthRate> philHealthRates = deductionsDAO.fetchPhilHealthRates();
                List<TaxRate> taxRates = deductionsDAO.fetchTaxRates();
                double basicSalary = employee.getBasicSalary();

                PayrollCalculator payrollCalculator = new PayrollCalculator();
                double grossPay = payrollCalculator.calculateGrossPay(employeeId, startDate, endDate, hourlyRate);

                // Initialize benefits calculator
                CalculateBenefits calculateBenefits = new CalculateBenefits();
                double totalBenefits = calculateBenefits.getTotalBenefits(employeeId);
                double halfBenefits = totalBenefits / 2;

                // Calculate total deductions
                DeductionsCalculator deductionsCalculator = new DeductionsCalculator(sssRates, philHealthRates, taxRates);

                double sssRate = deductionsCalculator.calculateSSS(basicSalary) / 2;
                double philHealthRate = deductionsCalculator.calculatePhilHealth(basicSalary) / 2;
                double pagIBIGDeduction = deductionsCalculator.calculatePagIBIGDeduction() / 2;
                double totalDeductions = deductionsCalculator.calculateTotalDeductions(basicSalary) / 2;

                double taxableIncome = deductionsCalculator.calculateTaxableIncome(grossPay, totalDeductions);
                double withholdingTax = deductionsCalculator.calculateWithholdingTax(taxableIncome);

                // Calculate net pay
                double netPay = grossPay - totalDeductions - withholdingTax;

                // Save payroll data to the database
                PayrollDAO payrollDAO = new PayrollDAO();
                int payrollId = payrollDAO.savePayroll(startDate, endDate, generatedBy);

                // Save payslip data to the database
                String payslipNo = generatePayslipNo(employeeId, endDate);
                double hoursWorked = payrollCalculator.calculateTotalHoursWorked(employeeId, startDate, endDate);
                payrollDAO.savePayslip(payslipNo, payrollId, employeeId, startDate, endDate, grossPay, hoursWorked, halfBenefits, totalDeductions, withholdingTax, netPay);

            } else {
                throw new IllegalArgumentException("Employee not found.");
            }

        } catch (SQLException e) {
            // Log the error or handle it accordingly
            throw new RuntimeException("Error executing payroll calculations: " + e.getMessage(), e);
        }
    }

    private String generatePayslipNo(int employeeId, LocalDate endDate) {
        return employeeId + "-" + endDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
}
