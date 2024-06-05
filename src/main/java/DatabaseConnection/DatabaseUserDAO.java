package DatabaseConnection;

import authentication.PasswordHash;
import authentication.PasswordHash.HashingException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseUserDAO {

    // Method to add a new user to the database
    public void addUserToDatabase(int employeeId, String username, String password, int roleId) throws DatabaseException {
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO users (EmployeeID, Username, UserPassword, RoleID) VALUES (?, ?, ?, ?)")) {
            // Hash the password using the PasswordHasher utility class
            String hashedPassword = PasswordHash.hashPassword(password);

            stmt.setInt(1, employeeId);
            stmt.setString(2, username);
            stmt.setString(3, hashedPassword); // Store the hashed password in the database
            stmt.setInt(4, roleId);
            stmt.executeUpdate();
        } catch (SQLException | HashingException ex) {
            throw new DatabaseException("Error occurred while adding a user to the database", ex);
        }
    }

    // Method to update an existing user in the database
    public void updateUserInDatabase(int employeeId, String username, String password, int roleId) throws DatabaseException {
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement("UPDATE users SET Username=?, UserPassword=?, RoleID=? WHERE EmployeeID=?")) {
            // Hash the password using the PasswordHasher utility class
            String hashedPassword = PasswordHash.hashPassword(password);

            stmt.setString(1, username);
            stmt.setString(2, hashedPassword); // Store the hashed password in the database
            stmt.setInt(3, roleId);
            stmt.setInt(4, employeeId);
            stmt.executeUpdate();
        } catch (SQLException | HashingException ex) {
            throw new DatabaseException("Error occurred while updating the user in the database", ex);
        }
    }

    // Method to delete a user from the database
    public void deleteUserFromDatabase(int userId) throws DatabaseException {
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM users WHERE UserID=?")) {
            stmt.setInt(1, userId);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            throw new DatabaseException("Error occurred while deleting the user from the database", ex);
        }
    }

    // Other methods for retrieving user information, etc.

    // Custom exception for database operations
    public static class DatabaseException extends Exception {
        public DatabaseException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
