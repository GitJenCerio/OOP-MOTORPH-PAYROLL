package UI;

import DatabaseConnection.DatabaseConnector;
import DatabaseConnection.DatabaseUserDAO.DatabaseException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

        // Create a panel to hold the text field and the arrow icon
        JPanel textFieldPanel = new JPanel();
        textFieldPanel.setLayout(new BorderLayout());
        textFieldPanel.add(textField, BorderLayout.CENTER);

        Icon arrowIcon = new ImageIcon(getClass().getResource("/resources/icon-arrow.png"));
        JLabel arrowLabel = new JLabel(arrowIcon);
        arrowLabel.setBorder(new EmptyBorder(0, 0, 0, 20));
        textFieldPanel.add(arrowLabel, BorderLayout.EAST);

        // Add the text field panel to the CustomDropdown
        add(textFieldPanel, BorderLayout.CENTER);

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

        arrowLabel.addMouseListener(new MouseAdapter() {
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

    // Method to set selected role type based on role ID
    public void setSelectedRoleType(int roleId) {
        try {
            String roleType = fetchRoleType(roleId);
            textField.setText(roleType); // Update the text field with the roleType
        } catch (DatabaseException ex) {
            // Handle database exception
            ex.printStackTrace();
        }
    }

    // Method to set selected role type based on role type string
    public void setSelectedRoleType(String roleType) {
        textField.setText(roleType); // Update the text field with the roleType
    }

    // Method to fetch RoleType from Database based on RoleID
    private String fetchRoleType(int roleId) throws DatabaseException {
        String query = "SELECT RoleType FROM roles WHERE RoleID = ?";
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, roleId); // Set the parameter as int
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getString("RoleType");
                } else {
                    throw new DatabaseException("Role ID not found: " + roleId);
                }
            }
        } catch (SQLException ex) {
            throw new DatabaseException("Error occurred while fetching RoleType: " + ex.getMessage(), ex);
        }
    }
}
