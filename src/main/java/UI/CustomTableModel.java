package UI;

import DatabaseConnection.DatabaseConnector;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class CustomTableModel extends AbstractTableModel {
    private String[] columnNames;
    private List<Object[]> data = new ArrayList<>();
    private List<Object[]> pageData = new ArrayList<>();
    private int pageSize = 10;
    private int currentPage = 0;

    public CustomTableModel(String tableName) {
        fetchColumnNamesAndDataFromDatabase(tableName);
        updatePageData();
    }

    private void fetchColumnNamesAndDataFromDatabase(String tableName) {
        try (java.sql.Connection connection = DatabaseConnector.getConnection();
             java.sql.Statement statement = connection.createStatement();
             java.sql.ResultSet resultSet = statement.executeQuery("SELECT * FROM " + tableName)) {

            java.sql.ResultSetMetaData metaData = resultSet.getMetaData();
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

        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
        updatePageData();
    }

    public void clearData() {
        data.clear();
        updatePageData();
        fireTableDataChanged();
    }

    public void addRow(Object[] row) {
        data.add(row);
        updatePageData();
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return pageSize; // Always return the page size
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        if (row < pageData.size()) {
            if (columnNames[column].equals("UserPassword")) {
                return "********";
            } else {
                return pageData.get(row)[column];
            }
        } else {
            return ""; // Return empty string for empty rows
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
        updatePageData();
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
        updatePageData();
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public int getTotalPages() {
        return (int) Math.ceil((double) data.size() / pageSize);
    }

    private void updatePageData() {
        int start = currentPage * pageSize;
        int end = Math.min(start + pageSize, data.size());
        pageData = data.subList(start, end);
    }

    // Method to create and style the JTable

// Method to create and style the JTable
public JTable createStyledTable() {
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

    return table;
}
}