package UI;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

import DatabaseConnection.DatabaseUtility;
import javax.swing.table.DefaultTableModel;

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
        setRowHeight(25); // Set row height to 30 pixels

        // Center align text in all columns
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        // Apply center alignment to all columns
        for (int columnIndex = 0; columnIndex < getColumnCount(); columnIndex++) {
            getColumnModel().getColumn(columnIndex).setCellRenderer(centerRenderer);
        }

        // Set selection mode to single row only
        setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Enable row selection and disable cell selection
        setRowSelectionAllowed(true);
        setColumnSelectionAllowed(false);
        setCellSelectionEnabled(false);

        // Set table header height
        JTableHeader tableHeader = getTableHeader();
        tableHeader.setPreferredSize(new Dimension(tableHeader.getPreferredSize().width, 25));
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
