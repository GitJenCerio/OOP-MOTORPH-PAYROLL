package AccessControl;

import DatabaseConnection.DatabaseConnector;
import UI.UI_AuthorizedUserDashboard;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class RoleAccess {

    

    public static void authorizedUserLogin(JButton authorizedUserButton, int userId) {
        // Remove all existing action listeners
        for (ActionListener al : authorizedUserButton.getActionListeners()) {
            authorizedUserButton.removeActionListener(al);
        }

        // Fetch the role ID of the logged-in user from the database
        int roleId = getRoleId(userId);

        // Configure UI components based on the role ID
        switch (roleId) {
            case 1:
            case 2:
            case 3:
                // Configuration for roles 1, 2, and 3
                authorizedUserButton.addActionListener(e -> {
                    
                    // Redirect to Authorized User Dashboard or perform other actions
                    UI_AuthorizedUserDashboard authorizedUI = new UI_AuthorizedUserDashboard(userId);
                    authorizedUI.openAuthorizedUserDashboard();
                });
                break;
            case 4:
                // Configuration for role 4 (Employee)
                authorizedUserButton.addActionListener(e -> {
                    // Display "Access Denied" message
                    JOptionPane.showMessageDialog(null, "Access Denied. You do not have permission to access this feature.");
                });
                break;
            default:
                // Handle invalid role ID
                JOptionPane.showMessageDialog(null, "Invalid role ID.");
                break;
        }
    }

    private static int getRoleId(int userId) {
        int roleId = -1; // Default value for role ID

        // Query to fetch the role ID of the logged-in user
        String sql = "SELECT RoleID FROM users WHERE UserID = ?";

        try (Connection conn = DatabaseConnector.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, userId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    roleId = rs.getInt("RoleID");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return roleId;
    }
}

