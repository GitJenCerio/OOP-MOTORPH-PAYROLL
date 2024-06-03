package DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseUserDAO {
    
    // Method to add a new user to the database
    public void addUserToDatabase(int employeeId, String username, String password, int roleId) {
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO users (Username, Password, RoleID) VALUES (?, ?, ?)")) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            stmt.setInt(3, roleId);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(); // Handle the exception properly
        }
    }

    // Method to update an existing user in the database
    public void updateUserInDatabase(int userId, String username, String password, int roleId) {
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement("UPDATE users SET Username=?, Password=?, RoleID=? WHERE UserID=?")) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            stmt.setInt(3, roleId);
            stmt.setInt(4, userId);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(); // Handle the exception properly
        }
    }

    // Method to delete a user from the database
    public void deleteUserFromDatabase(int userId) {
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM users WHERE UserID=?")) {
            stmt.setInt(1, userId);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(); // Handle the exception properly
        }
    }

    // Other methods for retrieving user information, etc.
}
