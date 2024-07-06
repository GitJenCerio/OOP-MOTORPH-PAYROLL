package UI;

import DatabaseConnection.DatabaseConnector;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.sql.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class CustomTableModel extends AbstractTableModel {
    private String[] columnNames;
    private List<Object[]> data = new ArrayList<>();
    private List<Object[]> filteredData;

    public CustomTableModel(String[] columnNames) {
        this.columnNames = columnNames;
        this.filteredData = new ArrayList<>(data);
    }

    public void fetchDataFromDatabase(String tableName) {
        try (Connection connection = DatabaseConnector.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT " + String.join(",", columnNames) + " FROM " + tableName)) {

            data.clear();
            while (resultSet.next()) {
                Object[] row = new Object[columnNames.length];
                for (int i = 0; i < columnNames.length; i++) {
                    row[i] = resultSet.getObject(columnNames[i]);
                }
                data.add(row);
            }

            filteredData = new ArrayList<>(data);
            fireTableDataChanged();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteRow(int rowIndex) {
        data.remove(rowIndex);
        filteredData = new ArrayList<>(data);
        fireTableDataChanged();
    }

    public void filterByColumn(String columnName, String filterValue) {
        if (filterValue.isEmpty() || filterValue.equals("All " + columnName)) {
            filteredData = new ArrayList<>(data);
        } else {
            filteredData = data.stream()
                               .filter(row -> row[columnIndex(columnName)].equals(filterValue))
                               .collect(Collectors.toList());
        }
        fireTableDataChanged();
    }

    public void searchData(String columnName, String query) {
        if (query.isEmpty()) {
            filteredData = new ArrayList<>(data);
        } else {
            filteredData = data.stream()
                               .filter(row -> row[columnIndex(columnName)].toString().equals(query))
                               .collect(Collectors.toList());
        }
        fireTableDataChanged();
    }

    public void clearData() {
        data.clear();
        filteredData.clear();
        fireTableDataChanged();
    }

    public void addRow(Object[] row) {
        data.add(row);
        filteredData = new ArrayList<>(data);
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return filteredData.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        if (row < filteredData.size()) {
            return columnNames[column].equals("UserPassword") ? "********" : filteredData.get(row)[column];
        } else {
            return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    private int columnIndex(String columnName) {
        return Arrays.asList(columnNames).indexOf(columnName);
    }

    public static void populateComboBox(JComboBox<String> comboBox, String columnName, String tableName) {
        try {
            Set<String> valuesSet = fetchUniqueValues(columnName, tableName);
            valuesSet.add("All");

            List<String> sortedValues = new ArrayList<>(valuesSet);
            sortedValues.sort(String::compareTo);
            sortedValues.add(0, columnName);

            comboBox.setModel(new DefaultComboBoxModel<>(sortedValues.toArray(new String[0])));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static Set<String> fetchUniqueValues(String columnName, String tableName) throws SQLException {
        Set<String> valuesSet = new HashSet<>();
        try (Connection connection = DatabaseConnector.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT DISTINCT " + columnName + " FROM " + tableName)) {

            while (resultSet.next()) {
                valuesSet.add(resultSet.getString(columnName));
            }
        }
        return valuesSet;
    }
}
