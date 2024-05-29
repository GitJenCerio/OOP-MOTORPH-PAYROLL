
package UI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class CustomTableCellRenderer extends DefaultTableCellRenderer {
    private static final Color HEADER_BACKGROUND = new Color(183, 203, 255);
    private static final Font HEADER_FONT = new Font("Poppins", Font.BOLD, 12);
    private static final Color ROW_COLOR_1 = Color.WHITE;
    private static final Color ROW_COLOR_2 = new Color(240, 240, 240);

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                                                   boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        if (c instanceof JLabel) {
            JLabel label = (JLabel) c;
            label.setHorizontalAlignment(JLabel.CENTER);

            if (table.getTableHeader().getColumnModel().getColumn(column).getHeaderValue().equals(value)) {
                label.setBackground(HEADER_BACKGROUND);
                label.setFont(HEADER_FONT);
            } else {
                label.setBackground(row % 2 == 0 ? ROW_COLOR_1 : ROW_COLOR_2);
                label.setFont(table.getFont());
            }
            label.setOpaque(true);
        }

        return c;
    }
}
