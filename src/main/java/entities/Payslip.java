
package entities;

/**
 *
 * @author admin
 */
public class Payslip {
    private String payslipNo;
    private int payrollId;
    private int employeeId;
    private double grossPay;
    private double hoursWorked;
    private double totalBenefits;
    private double totalDeductions;
    private double withholdingTax;
    private double netPay;

    // Constructor
    public Payslip(String payslipNo, int payrollId, int employeeId, double grossPay, double hoursWorked, 
                   double totalBenefits, double totalDeductions, double withholdingTax, double netPay) {
        this.payslipNo = payslipNo;
        this.payrollId = payrollId;
        this.employeeId = employeeId;
        this.grossPay = grossPay;
        this.hoursWorked = hoursWorked;
        this.totalBenefits = totalBenefits;
        this.totalDeductions = totalDeductions;
        this.withholdingTax = withholdingTax;
        this.netPay = netPay;
    }

    // Getters and Setters
    public String getPayslipNo() {
        return payslipNo;
    }

    public void setPayslipNo(String payslipNo) {
        this.payslipNo = payslipNo;
    }

    public int getPayrollId() {
        return payrollId;
    }

    public void setPayrollId(int payrollId) {
        this.payrollId = payrollId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public void setGrossPay(double grossPay) {
        this.grossPay = grossPay;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getTotalBenefits() {
        return totalBenefits;
    }

    public void setTotalBenefits(double totalBenefits) {
        this.totalBenefits = totalBenefits;
    }

    public double getTotalDeductions() {
        return totalDeductions;
    }

    public void setTotalDeductions(double totalDeductions) {
        this.totalDeductions = totalDeductions;
    }

    public double getWithholdingTax() {
        return withholdingTax;
    }

    public void setWithholdingTax(double withholdingTax) {
        this.withholdingTax = withholdingTax;
    }

    public double getNetPay() {
        return netPay;
    }

    public void setNetPay(double netPay) {
        this.netPay = netPay;
    }
}
