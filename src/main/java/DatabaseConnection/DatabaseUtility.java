/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseConnection;

import DatabaseConnection.DatabaseUserDAO.DatabaseException;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseUtility {

    // Method to fetch data from a specified table and columns, with optional password masking
    public static DefaultTableModel fetchDataAndCreateTableModel(String tableName, String[] columnNames, boolean maskPassword) throws DatabaseException {
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(buildQuery(tableName, columnNames))) {

            try (ResultSet rs = stmt.executeQuery()) {
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
            }
        } catch (SQLException ex) {
            throw new DatabaseException("Error occurred while fetching data from database", ex);
        }

        return tableModel;
    }

    // Helper method to build the SQL query dynamically
    private static String buildQuery(String tableName, String[] columnNames) {
        StringBuilder queryBuilder = new StringBuilder("SELECT ");
        queryBuilder.append(String.join(", ", columnNames));
        queryBuilder.append(" FROM ").append(tableName);
        return queryBuilder.toString();
    }
}
