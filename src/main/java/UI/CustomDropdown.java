package UI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CustomDropdown extends JPanel {

    private RoundedTextField textField;
    private JList<String> list;
    private JPopupMenu popupMenu;
    private String[] items;

    public CustomDropdown() {
        this(new String[]{});
    }

    public CustomDropdown(String[] items) {
        this.items = items;
        setLayout(new BorderLayout());

        textField = new RoundedTextField();
        add(textField, BorderLayout.CENTER);

        Icon arrowIcon = new ImageIcon(getClass().getResource("/resources/icon-arrow.png"));
        JLabel arrowLabel = new JLabel(arrowIcon);
        arrowLabel.setBorder(new EmptyBorder(0, 0, 0, 5));
        add(arrowLabel, BorderLayout.EAST);

        popupMenu = new JPopupMenu();
        list = new JList<>(items);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setVisibleRowCount(5);
        JScrollPane scrollPane = new JScrollPane(list);
        popupMenu.add(scrollPane);

        textField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showPopupMenu();
            }
        });

        list.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int index = list.locationToIndex(e.getPoint());
                if (index != -1) {
                    textField.setText(list.getModel().getElementAt(index));
                    popupMenu.setVisible(false);
                }
            }
        });
    }

    private void showPopupMenu() {
        Dimension size = textField.getSize();
        popupMenu.setPreferredSize(new Dimension(size.width, 100));
        popupMenu.show(textField, 0, size.height);
    }

    public String getSelectedRoleType() {
        return textField.getText();
    }

    public void setItems(String[] items) {
        this.items = items;
        list.setListData(items);
    }
}
