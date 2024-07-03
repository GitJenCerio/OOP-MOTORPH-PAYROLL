
package entities;


import java.time.LocalDate;

public class Overtime {
    private int employeeID;
    private LocalDate overtimeDate;
    private double approvedHours;

    // Constructors
    public Overtime(int employeeID, LocalDate overtimeDate, java.lang.Double approvedHours) {
        this.employeeID = employeeID;
        this.overtimeDate = overtimeDate;
        this.approvedHours = approvedHours;
    }

    // Getters and setters (optional, depending on usage)

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public LocalDate getOvertimeDate() {
        return overtimeDate;
    }

    public void setOvertimeDate(LocalDate overtimeDate) {
        this.overtimeDate = overtimeDate;
    }

    public double getApprovedHours() {
        return approvedHours;
    }

    public void setApprovedHours(double approvedHours) {
        this.approvedHours = approvedHours;
    }

    @Override
    public String toString() {
        return "Overtime{" +
                "employeeID=" + employeeID +
                ", overtimeDate=" + overtimeDate +
                ", approvedHours=" + approvedHours +
                '}';
    }
}
