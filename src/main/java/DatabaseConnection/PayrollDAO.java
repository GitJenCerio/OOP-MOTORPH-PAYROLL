package DatabaseConnection;

import entities.Attendance;
import entities.Overtime;
import entities.LeaveRecord;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PayrollDAO {

    // Fetch attendance records within the specified date range
    public List<Attendance> fetchAttendanceRecords(int employeeId, LocalDate startDate, LocalDate endDate) throws SQLException {
        List<Attendance> attendanceRecords = new ArrayList<>();
        String sql = "SELECT EmployeeID, AttendanceDate, HoursWorked FROM attendance WHERE EmployeeID = ? AND AttendanceDate BETWEEN ? AND ?";

        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, employeeId);
            stmt.setDate(2, java.sql.Date.valueOf(startDate));
            stmt.setDate(3, java.sql.Date.valueOf(endDate));

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int empId = rs.getInt("EmployeeID");
                LocalDate date = rs.getDate("AttendanceDate").toLocalDate();
                double hoursWorked = rs.getDouble("HoursWorked");

                attendanceRecords.add(new Attendance(empId, date, hoursWorked));
            }
        } catch (SQLException e) {
            throw new SQLException("Failed to fetch attendance records", e);
        }
        return attendanceRecords;
    }

    // Fetch approved overtime records within the specified date range
    public List<Overtime> fetchApprovedOvertimeRecords(int employeeId, LocalDate startDate, LocalDate endDate) throws SQLException {
        List<Overtime> overtimeRecords = new ArrayList<>();
        String sql = "SELECT EmployeeID, OvertimeDate, HoursWorked FROM overtimerequest WHERE EmployeeID = ? AND OvertimeDate BETWEEN ? AND ? AND ApprovalStatus = 'Approved'";

        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, employeeId);
            stmt.setDate(2, java.sql.Date.valueOf(startDate));
            stmt.setDate(3, java.sql.Date.valueOf(endDate));

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int empId = rs.getInt("EmployeeID");
                LocalDate date = rs.getDate("OvertimeDate").toLocalDate();
                double hoursWorked = rs.getDouble("HoursWorked");

                overtimeRecords.add(new Overtime(empId, date, hoursWorked));
            }
        } catch (SQLException e) {
            throw new SQLException("Failed to fetch approved overtime records", e);
        }
        return overtimeRecords;
    }

    // Fetch approved leave records within the specified date range
    public List<LeaveRecord> fetchApprovedLeaveRecords(int employeeId, LocalDate startDate, LocalDate endDate) throws SQLException {
        List<LeaveRecord> leaveRecords = new ArrayList<>();
        String sql = "SELECT LeaveID, EmployeeID, StartDate, EndDate, LeaveType, LeaveStatus FROM leaverequest WHERE EmployeeID = ? AND StartDate BETWEEN ? AND ? AND LeaveStatus = 'Approved'";

        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, employeeId);
            stmt.setDate(2, java.sql.Date.valueOf(startDate));
            stmt.setDate(3, java.sql.Date.valueOf(endDate));

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int leaveID = rs.getInt("LeaveID");
                int empId = rs.getInt("EmployeeID");
                LocalDate leaveStartDate = rs.getDate("StartDate").toLocalDate();
                LocalDate leaveEndDate = rs.getDate("EndDate").toLocalDate();
                String leaveType = rs.getString("LeaveType");
                String leaveStatus = rs.getString("LeaveStatus");

                leaveRecords.add(new LeaveRecord(leaveID, empId, leaveType, leaveStartDate, leaveEndDate, leaveStatus));
            }
        } catch (SQLException e) {
            throw new SQLException("Failed to fetch approved leave records", e);
        }
        return leaveRecords;
    }

    // Save payroll record to the database
    public int savePayroll(LocalDate startDate, LocalDate endDate, String generatedBy) throws SQLException {
        String sql = "INSERT INTO Payroll (PeriodStartDate, PeriodEndDate, GenerationDate, GeneratedBy) VALUES (?, ?, ?, ?)";
        
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {

            stmt.setDate(1, java.sql.Date.valueOf(startDate));
            stmt.setDate(2, java.sql.Date.valueOf(endDate));
            stmt.setTimestamp(3, java.sql.Timestamp.valueOf(LocalDateTime.now()));
            stmt.setString(4, generatedBy);

            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        return generatedKeys.getInt(1);
                    }
                }
            }
        } catch (SQLException e) {
            throw new SQLException("Failed to save payroll record", e);
        }
        return -1;
    }

    // Save payslip record to the database
    public void savePayslip(String payslipNo, int payrollId, int employeeId, LocalDate startDate, LocalDate endDate, double grossPay, double hoursWorked, double totalBenefits, double totalDeductions, double withholdingTax, double netPay) throws SQLException {
        String sql = "INSERT INTO Payslip (PayslipNo, PayrollID, EmployeeID, PeriodStartDate, PeriodEndDate, GrossPay, HoursWorked, TotalBenefits, TotalDeductions, WithholdingTax, NetPay) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, payslipNo);
            stmt.setInt(2, payrollId);
            stmt.setInt(3, employeeId);
            stmt.setDate(4, java.sql.Date.valueOf(startDate));
            stmt.setDate(5, java.sql.Date.valueOf(endDate));
            stmt.setDouble(6, grossPay);
            stmt.setDouble(7, hoursWorked);
            stmt.setDouble(8, totalBenefits);
            stmt.setDouble(9, totalDeductions);
            stmt.setDouble(10, withholdingTax);
            stmt.setDouble(11, netPay);

            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new SQLException("Failed to save payslip record", e);
        }
    }
}
