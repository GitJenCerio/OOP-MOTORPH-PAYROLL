
package PayrollSystem;

import DatabaseConnection.DatabaseEmployeeDAO;
import DatabaseConnection.DeductionsDAO;
import DatabaseConnection.PayrollDAO;
import entities.DeductionRates.PhilHealthRate;
import entities.DeductionRates.SSSRate;
import entities.DeductionRates.TaxRate;
import entities.Employee;
import java.util.List;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PayrollGenerator {

    public void generatePayroll(int employeeId, LocalDate startDate, LocalDate endDate, double hourlyRate, String generatedBy) {
        try {
            // Fetch employee details from database
            DatabaseEmployeeDAO employeeDAO = new DatabaseEmployeeDAO();
            Employee employee = employeeDAO.getEmployeeById(employeeId);

            if (employee != null) {
                // Display basic employee information
                System.out.println("Employee ID: " + employee.getEmployeeId());
                System.out.println("Employee Name: " + employee.getFirstName() + " " + employee.getLastName());
                System.out.println("Position: " + employee.getPosition());
                System.out.println("Basic Salary: $" + employee.getBasicSalary());

                // Fetch deduction rates from database
                DeductionsDAO deductionsDAO = new DeductionsDAO();
                List<SSSRate> sssRates = deductionsDAO.fetchSSSRates();
                List<PhilHealthRate> philHealthRates = deductionsDAO.fetchPhilHealthRates();
                List<TaxRate> taxRates = deductionsDAO.fetchTaxRates();
                double basicSalary = employee.getBasicSalary();

                PayrollCalculator payrollCalculator = new PayrollCalculator();
                double grossPay = payrollCalculator.calculateGrossPay(employeeId, startDate, endDate, hourlyRate);
                System.out.println("Gross pay: $" + grossPay);

                // Initialize deductions calculator with rates
                CalculateBenefits calculateBenefits = new CalculateBenefits();
                double totalBenefits = calculateBenefits.getTotalBenefits(employeeId);
                System.out.println("Total benefits: $" + totalBenefits / 2);

                // Calculate total deductions
                DeductionsCalculator deductionsCalculator = new DeductionsCalculator(sssRates, philHealthRates, taxRates);
                
                double sssRate = deductionsCalculator.calculateSSS(basicSalary);
                System.out.println("SSS Rate: " + sssRate / 2);

                double philHealthRate = deductionsCalculator.calculatePhilHealth(basicSalary);
                System.out.println("PhilHealth Rate: $" + philHealthRate / 2);

                double pagIBIGDeduction = deductionsCalculator.calculatePagIBIGDeduction();
                System.out.println("PagIBIG Deduction: $" + pagIBIGDeduction / 2);

                double totalDeductions = deductionsCalculator.calculateTotalDeductions(basicSalary) / 2;
                System.out.println("Total Deductions: $" + totalDeductions);

                double taxableIncome = deductionsCalculator.calculateTaxableIncome(grossPay, totalDeductions);
                double withholdingTax = deductionsCalculator.calculateWithholdingTax(taxableIncome);
                System.out.println("Withholding tax: $" + withholdingTax);

                // Calculate net pay
                double netPay = grossPay - totalDeductions - withholdingTax;
                System.out.println("Net pay: $" + netPay);

                // Save payroll data to the database
                PayrollDAO payrollDAO = new PayrollDAO();
                int payrollId = payrollDAO.savePayroll(startDate, endDate, generatedBy);

                // Save payslip data to the database
                String payslipNo = employeeId + "-" + endDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                double hoursWorked = payrollCalculator.calculateTotalHoursWorked(employeeId, startDate, endDate);
                payrollDAO.savePayslip(payslipNo, payrollId, employeeId, startDate, endDate, grossPay, hoursWorked, totalBenefits / 2, totalDeductions, withholdingTax, netPay);
            } else {
                System.out.println("Employee not found.");
            }

        } catch (SQLException e) {
            System.err.println("Error executing payroll calculations: " + e.getMessage());
        }
    }
}
