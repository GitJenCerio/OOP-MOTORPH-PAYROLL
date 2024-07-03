package AccessControl;

import DatabaseConnection.DatabaseConnector;
import UI.*;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class RoleAccess {

   public static int getRoleId(int userId) {
        int roleId = -1; // Default value for role ID

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
            System.err.println("Error while fetching role ID: " + e.getMessage());
        }

        return roleId;
    }

}

