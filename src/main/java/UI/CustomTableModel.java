package UI;

import DatabaseConnection.DatabaseConnector;
import javax.swing.table.AbstractTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CustomTableModel extends AbstractTableModel {
    private String[] columnNames;
    private List<Object[]> data = new ArrayList<>();

    public CustomTableModel(String tableName) {
        fetchColumnNamesAndDataFromDatabase(tableName);
    }

    private void fetchColumnNamesAndDataFromDatabase(String tableName) {
        try (Connection connection = DatabaseConnector.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM " + tableName)) {

            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            columnNames = new String[columnCount];
            for (int i = 0; i < columnCount; i++) {
                columnNames[i] = metaData.getColumnName(i + 1);
            }

            while (resultSet.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 0; i < columnCount; i++) {
                    row[i] = resultSet.getObject(i + 1);
                }
                data.add(row);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void clearData() {
        data.clear();
        fireTableDataChanged(); // Notify the table model that the data has changed
    }

    public void addRow(Object[] row) {
        data.add(row);
        fireTableRowsInserted(data.size() - 1, data.size() - 1); // Notify the table model about the new row
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
        if (columnNames[column].equals("UserPassword")) {
            return "********";
        } else {
            return data.get(row)[column];
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    // Method to create and style the JTable
    public JTable createStyledTable() {
        JTable table = new JTable(this);

        // Set header color and height
        table.getTableHeader().setBackground(new Color(183, 203, 255));
        table.getTableHeader().setPreferredSize(new Dimension(table.getTableHeader().getWidth(), 30));

        // Set background color, font, and row height
        table.setBackground(Color.WHITE);
        table.setFont(new Font("Poppins", Font.PLAIN, 12));
        table.setRowHeight(30);

        // Remove borders and gridlines
        table.setShowGrid(false);
        table.setIntercellSpacing(new Dimension(0, 0));

        // Set row selection to full row
        table.setRowSelectionAllowed(true);
        table.setColumnSelectionAllowed(false);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Center align text in columns
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        // Set row colors
        table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                                                           boolean isSelected, boolean hasFocus,
                                                           int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value,
                                                                  isSelected, hasFocus,
                                                                  row, column);
                // Set alternating row colors based on row index
                if (isSelected) {
                    c.setBackground(new Color(180, 180, 180)); // Selected row color
                } else if (hasFocus) {
                    c.setBackground(new Color(100, 100, 100)); // Hovered row color
                } else {
                    c.setBackground(row % 2 == 0 ? new Color(240, 240, 240) : Color.WHITE); // Alternating row colors
                }

                return c;
            }
        });

        return table;
    }
}
