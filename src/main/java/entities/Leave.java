
package entities;


import java.util.Date;

public class Leave {
    private int leaveID;
    private int employeeID;
    private Date startDate;
    private Date endDate;
    private LeaveType leaveType;
    private LeaveStatus status;
    private String remarks;

    public Leave(int leaveID, int employeeID, Date startDate, Date endDate, LeaveType leaveType, LeaveStatus status, String remarks) {
        this.leaveID = leaveID;
        this.employeeID = employeeID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.leaveType = leaveType;
        this.status = status;
        this.remarks = remarks;
    }

    // Getters and setters
    public int getLeaveID() {
        return leaveID;
    }

    public void setLeaveID(int leaveID) {
        this.leaveID = leaveID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public LeaveType getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(LeaveType leaveType) {
        this.leaveType = leaveType;
    }

    public LeaveStatus getStatus() {
        return status;
    }

    public void setStatus(LeaveStatus status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Leave{" +
                "leaveID=" + leaveID +
                ", employeeID=" + employeeID +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", leaveType=" + leaveType +
                ", status=" + status +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
