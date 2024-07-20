package DatabaseConnection;

import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseUtility {

    public static DefaultTableModel fetchDataAndCreateTableModel(String tableName, String[] columnNames, boolean maskPassword) {
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        String query = buildQuery(tableName, columnNames);

        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            System.out.println("Executing query: " + query);

            while (rs.next()) {
                Object[] rowData = new Object[columnNames.length];
                for (int i = 0; i < columnNames.length; i++) {
                    if (maskPassword && columnNames[i].equalsIgnoreCase("UserPassword")) {
                        rowData[i] = "********"; // Mask the password for usersTable
                    } else {
                        rowData[i] = rs.getObject(columnNames[i]);
                    }
                }
                tableModel.addRow(rowData);
            }
            System.out.println("Fetched " + tableModel.getRowCount() + " rows from the database.");
        } catch (SQLException ex) {
            System.err.println("Error occurred while fetching data from database: " + ex.getMessage());
            throw new RuntimeException("Error occurred while fetching data from database", ex);
        }

        return tableModel;
    }

    public static String[] fetchDropdownItems(String tableName, String columnName) {
        String query = "SELECT " + columnName + " FROM " + tableName;
        List<String> itemList = new ArrayList<>();

        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                itemList.add(rs.getString(columnName));
            }

            return itemList.toArray(new String[0]);
        } catch (SQLException e) {
            e.printStackTrace();
            return new String[0];
        }
    }

    public static int fetchNextUserId() {
        int nextUserId = -1;
        String sql = "SHOW TABLE STATUS LIKE 'users'";
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                nextUserId = rs.getInt("Auto_increment"); // For MySQL
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return nextUserId;
    }

    public static int fetchRoleId(String roleType) throws DatabaseException {
        String query = "SELECT RoleID FROM roles WHERE RoleType = ?";
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, roleType);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("RoleID");
                } else {
                    throw new DatabaseException("Role type not found: " + roleType);
                }
            }
        } catch (SQLException ex) {
            throw new DatabaseException("Error occurred while fetching RoleID: " + ex.getMessage(), ex);
        }
    }

    public static String fetchRoleType(int roleId) throws DatabaseException {
        String query = "SELECT RoleType FROM roles WHERE RoleID = ?";
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, roleId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getString("RoleType");
                } else {
                    throw new DatabaseException("Role ID not found: " + roleId);
                }
            }
        } catch (SQLException ex) {
            throw new DatabaseException("Error occurred while fetching RoleType: " + ex.getMessage(), ex);
        }
    }

    public static int fetchDepartmentID(String departmentName) throws DatabaseException {
        String query = "SELECT DepartmentID FROM department WHERE DepartmentName = ?";
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, departmentName);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("DepartmentID");
                } else {
                    throw new DatabaseException("Department not found: " + departmentName);
                }
            }
        } catch (SQLException ex) {
            throw new DatabaseException("Error occurred while fetching DepartmentID: " + ex.getMessage(), ex);
        }
    }

    public static int fetchSupervisorID(String supervisorName) throws DatabaseException {
        String query = "SELECT SupervisorID FROM supervisors WHERE SupervisorName = ?";
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, supervisorName);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("SupervisorID");
                } else {
                    throw new DatabaseException("Supervisor not found: " + supervisorName);
                }
            }
        } catch (SQLException ex) {
            throw new DatabaseException("Error occurred while fetching SupervisorID: " + ex.getMessage(), ex);
        }
    }
     public static DefaultTableModel fetchPayrollData() {
        String[] columnNames = {
            "PayrollID", "EmployeeID", "PeriodStartDate", "PeriodEndDate", "GrossPay",
            "HoursWorked", "TotalBenefits", "TotalDeductions", "WithholdingTax", "NetPay"
        };
        String query = "SELECT * FROM Payroll";

        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Object[] rowData = new Object[columnNames.length];
                for (int i = 0; i < columnNames.length; i++) {
                    rowData[i] = rs.getObject(columnNames[i]);
                }
                tableModel.addRow(rowData);
            }
        } catch (SQLException ex) {
            System.err.println("Error occurred while fetching payroll data: " + ex.getMessage());
            throw new RuntimeException("Error occurred while fetching payroll data", ex);
        }

        return tableModel;
    }

    

    private static String buildQuery(String tableName, String[] columnNames) {
        if (tableName == null || tableName.trim().isEmpty()) {
            throw new IllegalArgumentException("Table name must not be null or empty");
        }
        if (columnNames == null || columnNames.length == 0) {
            throw new IllegalArgumentException("Column names must not be null or empty");
        }
        String columns = String.join(", ", columnNames);
        return "SELECT " + columns + " FROM " + tableName;
    }

    public static class DatabaseException extends RuntimeException {
        public DatabaseException(String message) {
            super(message);
        }

        public DatabaseException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
