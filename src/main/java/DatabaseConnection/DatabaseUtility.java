package DatabaseConnection;

import DatabaseConnection.DatabaseUserDAO.DatabaseException;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseUtility {

    // Method to fetch data from a specified table and columns, with optional password masking
    public static DefaultTableModel fetchDataAndCreateTableModel(String tableName, String[] columnNames, boolean maskPassword) {
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(buildQuery(tableName, columnNames));
             ResultSet rs = stmt.executeQuery()) {

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
        } catch (SQLException ex) {
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
    public static int fetchLastUserId() {
        String query = "SELECT MAX(userId) AS lastUserID FROM users"; // Adjust your table name if necessary
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                return rs.getInt("lastUserID");
            } else {
                return 0; // Return 0 if there are no users in the table
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
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


    // Helper method to build the SQL query dynamically
    private static String buildQuery(String tableName, String[] columnNames) {
        StringBuilder queryBuilder = new StringBuilder("SELECT ");
        queryBuilder.append(String.join(", ", columnNames));
        queryBuilder.append(" FROM ").append(tableName);
        return queryBuilder.toString();
    }
}
