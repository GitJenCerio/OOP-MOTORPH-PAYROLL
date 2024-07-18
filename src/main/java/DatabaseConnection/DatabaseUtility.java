package DatabaseConnection;

import static DatabaseConnection.DatabaseConnector.getConnection;
import DatabaseConnection.DatabaseUserDAO.DatabaseException;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
                    rowData[i] = "********"; // Mask the password
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


    // Method to fetch dropdown items from a specified table and column
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

    // Method to fetch the last UserID from the users table
     public static int fetchNextUserId() {
        int nextUserId = -1;
        String sql = "SHOW TABLE STATUS LIKE 'users'"; 
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            if (rs.next()) {
                nextUserId = rs.getInt("Auto_increment"); // For MySQL
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return nextUserId;
    }


    // Method to fetch RoleID based on RoleType
    public static int fetchRoleId(String roleType) throws DatabaseException {
        String query = "SELECT RoleID FROM roles WHERE RoleType = ?";
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, roleType); // Set the parameter as String
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
            stmt.setInt(1, roleId); // Set the parameter as int
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
            stmt.setString(1, departmentName); // Set the parameter as String
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

    // Method to fetch SupervisorID based on supervisor name
    public static int fetchSupervisorID(String supervisorName) throws DatabaseException {
        String query = "SELECT SupervisorID FROM supervisors WHERE SupervisorName = ?";
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, supervisorName); // Set the parameter as String
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

    // Helper method to build the SQL query dynamically
   private static String buildQuery(String tableName, String[] columnNames) {
    StringBuilder query = new StringBuilder("SELECT ");
    for (int i = 0; i < columnNames.length; i++) {
        query.append(columnNames[i]);
        if (i < columnNames.length - 1) {
            query.append(", ");
        }
    }
    query.append(" FROM ").append(tableName);
    return query.toString();
}
}