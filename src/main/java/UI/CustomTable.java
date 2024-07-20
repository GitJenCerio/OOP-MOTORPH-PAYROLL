
package UI;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.text.DecimalFormat;
import DatabaseConnection.DatabaseUtility;

public class CustomTable extends JTable {

    private static final DecimalFormat currencyFormat = new DecimalFormat("#,##0.00");
    private static final int CELL_PADDING = 10; // Margin in pixels

    public CustomTable() {
        super();
        setupTable();
    }

    public CustomTable(String tableName, String[] columnNames, boolean maskPassword) {
        super(DatabaseUtility.fetchDataAndCreateTableModel(tableName, columnNames, maskPassword));
        setupTable();
    }

    private void setupTable() {
        // Set table properties
        setOpaque(false);
        setIntercellSpacing(new Dimension(0, 0)); // Remove cell spacing
        setShowGrid(false); // Hide grid lines
        setRowHeight(25); // Set row height to 25 pixels

        // Apply center alignment and set renderers for all columns
        for (int columnIndex = 0; columnIndex < getColumnCount(); columnIndex++) {
            TableColumn column = getColumnModel().getColumn(columnIndex);

            if (isNumericColumn(columnIndex)) {
                column.setCellRenderer(new NumericCellRenderer());
            } else {
                column.setCellRenderer(new DefaultTableCellRenderer());
            }
            
            // Apply center alignment
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
            column.setCellRenderer(centerRenderer);

            // Calculate preferred width based on the widest cell content
            int maxWidth = calculateMaxWidth(columnIndex);
            int preferredWidth = Math.min(Math.max(maxWidth + 20, 80), 150); // Adjust padding and max width as needed
            column.setPreferredWidth(preferredWidth);
            column.setMinWidth(70); // Example minimum width (adjust as needed)
        }

        setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Set table header height
        JTableHeader tableHeader = getTableHeader();
        tableHeader.setPreferredSize(new Dimension(tableHeader.getPreferredSize().width, 35));
    }

    private boolean isNumericColumn(int columnIndex) {
        // Implement logic to identify numeric columns, e.g., by checking column names or data types
        // For example purposes, assume numeric columns are even-indexed
        return columnIndex % 2 == 0;
    }

    private int calculateMaxWidth(int columnIndex) {
        int maxWidth = 0;
        TableColumn column = getColumnModel().getColumn(columnIndex);
        TableCellRenderer headerRenderer = column.getHeaderRenderer();
        if (headerRenderer == null) {
            headerRenderer = getTableHeader().getDefaultRenderer();
        }
        Component headerComp = headerRenderer.getTableCellRendererComponent(
                null, column.getHeaderValue(), false, false, 0, 0);
        int headerWidth = headerComp.getPreferredSize().width;
        maxWidth = Math.max(maxWidth, headerWidth);

        // Iterate through all rows to find the widest cell content
        for (int row = 0; row < getRowCount(); row++) {
            TableCellRenderer cellRenderer = getCellRenderer(row, columnIndex);
            Component cellComp = prepareRenderer(cellRenderer, row, columnIndex);
            int cellWidth = cellComp.getPreferredSize().width + getIntercellSpacing().width;
            maxWidth = Math.max(maxWidth, cellWidth);
        }

        return maxWidth;
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    public void updateTableData(String tableName, String[] columnNames, boolean maskPassword) {
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.setRowCount(0); // Clear existing rows

        // Fetch updated data and populate the table
        model = DatabaseUtility.fetchDataAndCreateTableModel(tableName, columnNames, maskPassword);
        setModel(model);

        // Reapply custom renderer to all columns after updating data
        for (int columnIndex = 0; columnIndex < getColumnCount(); columnIndex++) {
            if (isNumericColumn(columnIndex)) {
                getColumnModel().getColumn(columnIndex).setCellRenderer(new NumericCellRenderer());
            } else {
                getColumnModel().getColumn(columnIndex).setCellRenderer(new DefaultTableCellRenderer());
            }
        }
    }

    @Override
    public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
        Component component = super.prepareRenderer(renderer, row, column);

        // Alternate row colors
        if (row % 2 == 0) {
            component.setBackground(Color.WHITE);
        } else {
            component.setBackground(new Color(233, 237, 245));
        }

        // Highlight entire row on selection
        if (isRowSelected(row)) {
            component.setBackground(Color.BLUE);
            component.setForeground(Color.WHITE);
        } else {
            component.setForeground(Color.BLACK);
        }

        return component;
    }

    // Custom cell renderer for numeric columns
   private static class NumericCellRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        // Get the default cell renderer component
        JComponent cell = (JComponent) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        // Add padding around the cell content
        cell.setPreferredSize(new Dimension(cell.getPreferredSize().width + CELL_PADDING * 2,
                cell.getPreferredSize().height));
        cell.setBorder(BorderFactory.createEmptyBorder(0, CELL_PADDING, 0, CELL_PADDING));

        // Apply currency formatting if the value is numeric
        if (value instanceof Number) {
            setText(currencyFormat.format((Number) value));
        } else {
            setText(value != null ? value.toString() : "");
        }

        return cell;
    }
}
}