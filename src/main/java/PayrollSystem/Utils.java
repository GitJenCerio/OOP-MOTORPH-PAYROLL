
package PayrollSystem;

import DatabaseConnection.TableUpdater;
import UI.CustomTableModel;
import javax.swing.JTable;
import javax.swing.JTextField;


public class Utils {
    
       public static void clearTextFields(JTextField... textFields) {
        for (JTextField textField : textFields) {
            textField.setText("");
        }
    }

    // Method to update a table in the UI
    public static void updateTable(JTable table, CustomTableModel model, String tableName) {
        TableUpdater.updateTable(table, model, tableName);
    }

}
