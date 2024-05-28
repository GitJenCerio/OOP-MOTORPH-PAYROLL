package authentication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Database.DatabaseConnector;

public class Authentication {

    // Method to authenticate user and retrieve user ID and role ID based on provided username and password
    public int[] authenticate(String username, String password) {
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT UserID, RoleID FROM users WHERE Username = ? AND UserPassword = ?")) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    // Authentication successful, return user ID and role ID
                    return new int[] { rs.getInt("UserID"), rs.getInt("RoleID") };
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Authentication failed or error occurred, return an empty array
        return new int[0];
    }
}