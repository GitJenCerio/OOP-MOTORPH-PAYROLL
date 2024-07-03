package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OvertimeRecord {
    private int overtimeID;
    private int employeeID;
    private LocalDate overtimeDate;
    private double hoursWorked;
    private int approverName;
    private LocalDateTime approvalDateTime;

    // Constructors
    public OvertimeRecord() {
    }

    public OvertimeRecord(int overtimeID, int employeeID, LocalDate overtimeDate, double hoursWorked, int approverName, LocalDateTime approvalDateTime) {
        this.overtimeID = overtimeID;
        this.employeeID = employeeID;
        this.overtimeDate = overtimeDate;
        this.hoursWorked = hoursWorked;
        this.approverName = approverName;
        this.approvalDateTime = approvalDateTime;
    }

    // Getters and setters
    public int getOvertimeID() {
        return overtimeID;
    }

    public void setOvertimeID(int overtimeID) {
        this.overtimeID = overtimeID;
    }

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

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getApproverName() {
        return approverName;
    }

    public void setApproverName(int approverName) {
        this.approverName = approverName;
    }

    public LocalDateTime getApprovalDateTime() {
        return approvalDateTime;
    }

    public void setApprovalDateTime(LocalDateTime approvalDateTime) {
        this.approvalDateTime = approvalDateTime;
    }

    @Override
    public String toString() {
        return "OvertimeRecord{" +
                "overtimeID=" + overtimeID +
                ", employeeID=" + employeeID +
                ", overtimeDate=" + overtimeDate +
                ", hoursWorked=" + hoursWorked +
                ", approverName=" + approverName +
                ", approvalDateTime=" + approvalDateTime +
                '}';
    }
}
