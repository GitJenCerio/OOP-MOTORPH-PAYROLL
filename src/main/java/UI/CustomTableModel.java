
package UI;

import Database.DatabaseConnector;
import javax.swing.table.AbstractTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomTableModel extends AbstractTableModel {
    private String[] columnNames;
    private List<Object[]> data = new ArrayList<>();

    public CustomTableModel(String tableName) {
        // Fetch column names from the database
        fetchColumnNamesFromDatabase(tableName);
        // Fetch data from the database using the table name
        fetchDataFromDatabase(tableName);
    }

    private void fetchColumnNamesFromDatabase(String tableName) {
        try (Connection connection = DatabaseConnector.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM " + tableName + " LIMIT 0")) {

            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            columnNames = new String[columnCount];
            for (int i = 0; i < columnCount; i++) {
                columnNames[i] = metaData.getColumnName(i + 1); // Column index starts from 1
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void fetchDataFromDatabase(String tableName) {
        try (Connection connection = DatabaseConnector.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM " + tableName)) {

            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            while (resultSet.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 0; i < columnCount; i++) {
                    row[i] = resultSet.getObject(i + 1); // ResultSet column index starts from 1
                }
                data.add(row);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        // Check if the column corresponds to the password column
        if (columnNames[column].equals("UserPassword")){
            // Return a placeholder string for the password
            return "********"; // You can use any placeholder you prefer
        } else {
            // Return the actual value for other columns
            return data.get(row)[column];
        }
    
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    // Implement other methods as needed, such as setValueAt() for editable cells
}

