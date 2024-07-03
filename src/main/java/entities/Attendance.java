package entities;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Attendance {
    private int employeeID;
    private LocalDate date;
    private double hoursWorked;

    public Attendance(int employeeID, LocalDate date, double hoursWorked) {
        this.employeeID = employeeID;
        this.date = date;
        this.hoursWorked = hoursWorked;
    }

    // Getters and setters
    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "employeeID=" + employeeID +
                ", date=" + date +
                ", hoursWorked=" + hoursWorked +
                '}';
    }
}
