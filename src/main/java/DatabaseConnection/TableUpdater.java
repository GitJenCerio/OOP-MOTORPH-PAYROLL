package DatabaseConnection;

import UI.CustomTableModel;
import javax.swing.JTable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class TableUpdater {

    // Method to update a table in the UI
    public static void updateTable(JTable table, CustomTableModel model, String tableName) {
        model.clearData(); // Clear previous data

        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM " + tableName)) {
            ResultSet rs = stmt.executeQuery();

            // Iterate over the result set and add rows to the table model
            while (rs.next()) {
                Object[] row = new Object[model.getColumnCount()];
                for (int i = 0; i < model.getColumnCount(); i++) {
                    row[i] = rs.getObject(i + 1);
                }
                model.addRow(row);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(); // Handle the exception properly
        }
    }public static void refreshTable(JTable table, String tableName) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Clear existing rows

        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM " + tableName);
             ResultSet rs = stmt.executeQuery()) {

            // Iterate over the result set and add rows to the table model
            while (rs.next()) {
                Object[] row = new Object[model.getColumnCount()];
                for (int i = 0; i < model.getColumnCount(); i++) {
                    row[i] = rs.getObject(i + 1);
                }
                model.addRow(row);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(); // Handle the exception properly
        }
    }

}
