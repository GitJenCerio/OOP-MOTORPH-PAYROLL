package PayrollSystem;

import DatabaseConnection.*;
import entities.Attendance;
import entities.Employee;
import entities.LeaveRecord;
import entities.Overtime;
import entities.DeductionRates.*;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class PayrollCalculator {

    private PayrollDAO payrollDAO;
    private DatabaseEmployeeDAO databaseEmployeeDAO;
    DeductionsCalculator deductionsCalculator;
    CalculateBenefits calculateBenefits;
    private DeductionsDAO deductionsDAO; // Add DeductionsDAO instance

    public PayrollCalculator() {
        this.payrollDAO = new PayrollDAO();
        this.deductionsDAO = new DeductionsDAO(); // Initialize DeductionsDAO

        // Fetch SSS rates, PhilHealth rates, and Tax rates from DeductionsDAO
        List<SSSRate> sssRates = deductionsDAO.fetchSSSRates();
        List<PhilHealthRate> philHealthRates = deductionsDAO.fetchPhilHealthRates();
        List<TaxRate> taxRates = deductionsDAO.fetchTaxRates();

        // Initialize DeductionsCalculator with fetched rates
        this.deductionsCalculator = new DeductionsCalculator(sssRates, philHealthRates, taxRates);

        // Initialize CalculateBenefits (assuming no constructor arguments needed)
        this.calculateBenefits = new CalculateBenefits();
    }
    
    public double calculateTotalHoursWorked(int employeeId, LocalDate startDate, LocalDate endDate) throws SQLException {
        double totalHoursWorked = 0.0;

        List<Attendance> attendanceRecords = payrollDAO.fetchAttendanceRecords(employeeId, startDate, endDate);
        List<Overtime> approvedOvertimeRecords = payrollDAO.fetchApprovedOvertimeRecords(employeeId, startDate, endDate);
        List<LeaveRecord> approvedLeaveRecords = payrollDAO.fetchApprovedLeaveRecords(employeeId, startDate, endDate);

        // Calculate total hours worked from attendance records
        for (Attendance record : attendanceRecords) {
            totalHoursWorked += record.getHoursWorked();
        }

        // Add approved overtime hours to total hours worked
        for (Overtime overtimeRecord : approvedOvertimeRecords) {
            totalHoursWorked += overtimeRecord.getApprovedHours();
        }

        // Subtract approved leave hours from total hours worked
        for (LeaveRecord leaveRecord : approvedLeaveRecords) {
            double leaveHours = calculateLeaveDays(employeeId, startDate, endDate) * 8.0;
            totalHoursWorked -= leaveHours;
        }

        // Round the result to two decimal places
        totalHoursWorked = roundToTwoDecimals(totalHoursWorked);

        return totalHoursWorked;
    }

    // Method to calculate overtime hours specifically
    public double calculateOvertimeHours(int employeeId, LocalDate startDate, LocalDate endDate) throws SQLException {
        double overtimeHours = 0.0;

        // Fetch approved overtime records
        List<Overtime> approvedOvertimeRecords = payrollDAO.fetchApprovedOvertimeRecords(employeeId, startDate, endDate);

        // Sum up approved overtime hours
        for (Overtime overtimeRecord : approvedOvertimeRecords) {
            overtimeHours += overtimeRecord.getApprovedHours();
        }

        // Round the result to two decimal places
        overtimeHours = roundToTwoDecimals(overtimeHours);

        return overtimeHours;
    }

    // Method to calculate gross pay based on total hours worked and hourly rate
     public double calculateGrossPay(int employeeId, LocalDate startDate, LocalDate endDate, double hourlyRate) throws SQLException {
        // Calculate total hours worked
        double totalHoursWorked = calculateTotalHoursWorked(employeeId, startDate, endDate);

        // Calculate gross pay
        double grossPay = totalHoursWorked * hourlyRate;

        // Round the result to two decimal places
        grossPay = roundToTwoDecimals(grossPay);

        return grossPay;
    }

            // Method to calculate net pay based on gross pay, total benefits, and total deductions
   public double calculateNetPay(int employeeId, LocalDate startDate, LocalDate endDate, double hourlyRate) throws SQLException {
    DatabaseEmployeeDAO employeeDAO = new DatabaseEmployeeDAO();
    Employee employee = employeeDAO.getEmployeeById(employeeId);
    if (employee == null) {
        throw new SQLException("Employee not found with ID: " + employeeId);
    }
    

    // Calculate gross pay
    double grossPay = calculateGrossPay(employeeId, startDate, endDate, hourlyRate);

    // Calculate total benefits
    double totalBenefits = calculateBenefits.getTotalBenefits(employeeId) / 2;
    
    

    // Assume basicSalary is derived from employee information

    // Calculate total deductions
    double basicSalary = employee.getBasicSalary();

    // Calculate total deductions
    double totalDeductions = deductionsCalculator.calculateTotalDeductions(basicSalary)/2;
    double taxableIncome = deductionsCalculator.calculateTaxableIncome(grossPay, totalDeductions);
    

    // Calculate withholding tax using gross pay and total deductions
    double withholdingTax = deductionsCalculator.calculateWithholdingTax(taxableIncome);

    // Calculate net pay
    double netPay = grossPay + totalBenefits - totalDeductions - withholdingTax;

    // Round the result to two decimal places
    netPay = roundToTwoDecimals(netPay);
    
    System.out.println("Gross Pay: " + grossPay);
    System.out.println("Total Benefits: " + totalBenefits);
    System.out.println("Total Deductions: " + totalDeductions);
    System.out.println("Withholding Tax: " + withholdingTax);

    return netPay;
}


    // Helper method to round a double value to two decimal places
    private double roundToTwoDecimals(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

    // Helper method to calculate the total leave days between startDate and endDate inclusive
    long calculateLeaveDays(int employeeId, LocalDate startDate, LocalDate endDate) throws SQLException {
        // Fetch approved leave records for the employee within the specified date range
        List<LeaveRecord> leaveRecords = payrollDAO.fetchApprovedLeaveRecords(employeeId, startDate, endDate);

        // Calculate total leave days based on the leave records
        long totalLeaveDays = 0;
        for (LeaveRecord leaveRecord : leaveRecords) {
            LocalDate leaveStartDate = leaveRecord.getStartDate();
            LocalDate leaveEndDate = leaveRecord.getEndDate();

            // Adjust leave start and end dates to be within the specified range
            LocalDate adjustedStartDate = leaveStartDate.isBefore(startDate) ? startDate : leaveStartDate;
            LocalDate adjustedEndDate = leaveEndDate.isAfter(endDate) ? endDate : leaveEndDate;

            // Calculate leave days between adjusted start and end dates
            long leaveDays = adjustedStartDate.datesUntil(adjustedEndDate.plusDays(1)).count();

            totalLeaveDays += leaveDays;
        }

        return totalLeaveDays;
    }
}
