package UI;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import DatabaseConnection.DatabaseUtility;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class CustomTable extends JTable {

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

    // Center align text in all columns
    DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
    centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

    // Apply center alignment and set dynamic widths to all columns
    for (int columnIndex = 0; columnIndex < getColumnCount(); columnIndex++) {
        getColumnModel().getColumn(columnIndex).setCellRenderer(centerRenderer);

        // Calculate preferred width based on the widest cell content
        int maxWidth = 0; // Initial preferred width
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

        // Set the column width with padding and constraints
        int preferredWidth = Math.min(Math.max(maxWidth + 10, 50), 150); // Adjust padding and max width as needed
        column.setPreferredWidth(preferredWidth);

        // Set a minimum width based on the preferred width
        int minWidth = Math.min(preferredWidth, 20); // Example minimum width (adjust as needed)
        column.setMinWidth(minWidth);
    }

    setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    // Set selection mode to single row only
    setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    // Enable row selection and disable cell selection
    setRowSelectionAllowed(true);
    setColumnSelectionAllowed(false);
    setCellSelectionEnabled(false);

    // Set table header height and width
    JTableHeader tableHeader = getTableHeader();
    tableHeader.setPreferredSize(new Dimension(60, 35));
}


    // Override isCellEditable to make cells non-editable
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

        // Reapply center alignment to all columns after updating data
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        for (int columnIndex = 0; columnIndex < getColumnCount(); columnIndex++) {
            getColumnModel().getColumn(columnIndex).setCellRenderer(centerRenderer);
        }
    }

    // Override prepareRenderer to set alternating row colors
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
}
