package UI;

import DatabaseConnection.DatabaseConnector;

import javax.swing.*;
import javax.swing.table.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CustomTableModel extends AbstractTableModel {
    private String[] columnNames;
    private List<Object[]> data = new ArrayList<>();
    private List<Object[]> filteredData; // Data after filtering
    private String supervisorFilter = ""; // Selected supervisor filter
    private String positionFilter = ""; // Selected position filter
    
    public CustomTableModel(String[] columnNames) {
        this.columnNames = columnNames;
    }

    // Method to fetch data from database and update the model
    public void fetchDataFromDatabase(String tableName) {
        try (Connection connection = DatabaseConnector.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT " + String.join(",", columnNames) + " FROM " + tableName)) {

            data.clear(); // Clear previous data

            while (resultSet.next()) {
                Object[] row = new Object[columnNames.length];
                for (int i = 0; i < columnNames.length; i++) {
                    row[i] = resultSet.getObject(columnNames[i]);
                }
                data.add(row);
            }

            // Initialize filteredData with all data
            filteredData = new ArrayList<>(data);

            fireTableDataChanged(); // Notify the table that data has changed
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to delete a row from the table model
    public void deleteRow(int rowIndex) {
        data.remove(rowIndex); // Remove from main data list
        filterByColumn(columnNames[0], ""); // Refresh filtered data
        fireTableDataChanged(); // Notify the table that data has changed
    }
    
    public void filterByColumn(String columnName, String filterValue) {
    if (filterValue.isEmpty() || filterValue.equals("All " + columnName)) {
        filteredData = new ArrayList<>(data); // Reset to contain all data
    } else {
        filteredData = data.stream()
                           .filter(row -> row[columnIndex(columnName)].equals(filterValue))
                           .collect(Collectors.toList());
    }
    fireTableDataChanged();
    }
    private int columnIndex(String columnName) {
        for (int i = 0; i < columnNames.length; i++) {
            if (columnNames[i].equals(columnName)) {
                return i;
            }
        }
        return -1;
    }


    // Method to search data
        public void searchData(String columnName, String query) {
          if (query.isEmpty()) {
              filteredData = new ArrayList<>(data); // Reset to contain all data
          } else {
              filteredData = data.stream()
                                 .filter(row -> row[columnIndex(columnName)].toString().equals(query))
                                 .collect(Collectors.toList());
          }
          fireTableDataChanged();
      }


    public void clearData() {
        data.clear();
        filteredData.clear(); // Clear filtered data
        fireTableDataChanged(); // Notify the table that data has changed
    }

    public void addRow(Object[] row) {
        data.add(row);
        fireTableDataChanged(); // Notify the table that data has changed
    }

    @Override
    public int getRowCount() {
        return filteredData.size(); // Return the total number of rows after filtering
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        if (row < filteredData.size()) {
            if (columnNames[column].equals("UserPassword")) {
                return "********";
            } else {
                return filteredData.get(row)[column];
            }
        } else {
            return ""; // Return empty string for empty rows
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    // Method to create and style the JTable
    /*public JTable createStyledTable() {
        JTable table = new JTable(this) {
            @Override
            public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
                Component c = super.prepareRenderer(renderer, row, column);
                if (!isRowSelected(row)) {
                    c.setBackground(row % 2 == 0 ? Color.WHITE : new Color(240, 240, 240)); // Alternating row colors
                } else {
                    c.setBackground(new Color(180, 180, 180)); // Selected row color
                }
                return c;
            }

            @Override
            public void setShowGrid(boolean showGrid) {
                // Override to prevent the selection grid
            }
        };

        // Set header color and height
        table.getTableHeader().setBackground(new Color(107, 151, 177));
        table.getTableHeader().setPreferredSize(new Dimension(table.getTableHeader().getWidth(), 30));

        // Set background color, font, and row height
        table.setBackground(Color.WHITE);
        table.setFont(new Font("Poppins", Font.PLAIN, 12));
        table.setRowHeight(30);

        // Show only horizontal grid lines and set grid color
        table.setShowHorizontalLines(true);
        table.setGridColor(Color.GRAY);
        table.setIntercellSpacing(new Dimension(0, 1)); // To emphasize horizontal lines

        // Set row selection to full row
        table.setRowSelectionAllowed(true);
        table.setColumnSelectionAllowed(false);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Set selection background to transparent
        table.setSelectionBackground(new Color(0, 0, 0, 0));

        // Center align text in columns
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        // Set font color and alignment of table header
        JTableHeader header = table.getTableHeader();
        header.setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                label.setForeground(Color.WHITE); // Set font color of header
                label.setBackground(new Color(107, 151, 177)); // Set background color of header
                label.setFont(new Font("Montserrat", Font.BOLD, 12)); // Set font to Poppins
                label.setHorizontalAlignment(JLabel.CENTER); // Set alignment to center
                return label;
            }
        });

        // Adjust column widths to create desired spacing
        adjustColumnWidths(table);

        return table;
    }*/

    private void adjustColumnWidths(JTable table) {
        TableColumnModel  columnModel = table.getColumnModel();

        // Assuming you want the first column to have less width compared to the second column
        TableColumn firstColumn = columnModel.getColumn(0);
        TableColumn secondColumn = columnModel.getColumn(1);
        TableColumn thirdColumn = columnModel.getColumn(2);

        // Set preferred widths for columns
        firstColumn.setPreferredWidth(20); // Adjust this value according to your preference
        secondColumn.setPreferredWidth(30);
        thirdColumn.setPreferredWidth(30);// Adjust this value according to your preference
        // You can set preferred widths for other columns in a similar manner
    }
    
     public static void populateComboBox(JComboBox<String> comboBox, String columnName, String tableName) {
    try {
        Set<String> valuesSet = fetchUniqueValues(columnName, tableName);

        // Add "All" option
        valuesSet.add("All");

        // Convert Set to List and sort alphabetically
        List<String> sortedValues = valuesSet.stream()
                                             .sorted()
                                             .collect(Collectors.toList());

        // Add the column name as the first item in the combo box
        sortedValues.add(0, columnName);

        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(sortedValues.toArray(new String[0]));
        comboBox.setModel(model);
    } catch (SQLException e) {
        e.printStackTrace();
        // Handle database connection or query errors
    }
}

    private static Set<String> fetchUniqueValues(String columnName, String tableName) throws SQLException {
        Set<String> valuesSet = new HashSet<>();
        try (Connection connection = DatabaseConnector.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT DISTINCT " + columnName + " FROM " + tableName)) {

            while (resultSet.next()) {
                String value = resultSet.getString(columnName);
                valuesSet.add(value);
            }
        }
        return valuesSet;
    }

}
