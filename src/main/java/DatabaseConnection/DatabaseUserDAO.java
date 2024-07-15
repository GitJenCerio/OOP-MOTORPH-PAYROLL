package DatabaseConnection;

import authentication.PasswordHash;
import authentication.PasswordHash.HashingException;
import entities.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DatabaseUserDAO {

    // Method to retrieve a user by UserID
  public User getUserByUserId(int userId) throws DatabaseException {
        String query = "SELECT UserID, EmployeeID, Username, RoleID, UserPassword FROM users WHERE UserID=?";
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, userId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    int id = rs.getInt("UserID");
                    int employeeId = rs.getInt("EmployeeID");
                    String username = rs.getString("Username");
                    int roleId = rs.getInt("RoleID");
                    String password = rs.getString("UserPassword");

                    // Mask the password with asterisks
                    String maskedPassword = maskPassword(password);

                    return new User(id, employeeId, username, roleId, maskedPassword);
                } else {
                    return null; // User not found
                }
            }
        } catch (SQLException ex) {
            throw new DatabaseException("Error occurred while retrieving the user from the database", ex);
        }
    }

    // Method to mask the password with asterisks
   public String maskPassword(String password) {
    return "********";
}

    public boolean addUserToDatabase(int employeeId, String username, String password, String roleType) throws DatabaseException {
    try {
        // Fetch RoleID based on RoleType
        int roleId = DatabaseUtility.fetchRoleId(roleType);

        // Hash the password using the PasswordHash utility class
        String hashedPassword = PasswordHash.hashPassword(password);

        // Prepare SQL statement to insert user
        String sql = "INSERT INTO users (EmployeeID, Username, UserPassword, RoleID) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Set parameters for the prepared statement
            stmt.setInt(1, employeeId);
            stmt.setString(2, username);
            stmt.setString(3, hashedPassword);
            stmt.setInt(4, roleId);

            // Execute the update
            int rowsAffected = stmt.executeUpdate();

            return rowsAffected > 0; // Return true if user added successfully
        }
    } catch (SQLException | HashingException ex) {
        logError("Error occurred while adding a user to the database", ex);
        throw new DatabaseException("Error occurred while adding a user to the database", ex);
    }
}
    
    private void logError(String message, Exception ex) {
    System.err.println(message);
    ex.printStackTrace(); // Print detailed stack trace to the error stream
}


 // Method to update an existing user in the database
    
public void updateUserInDatabase(int userId, int employeeId, String username, String roleType, String newPassword) throws DatabaseException {
    try {
        // Fetch RoleID based on RoleType
        int roleId = DatabaseUtility.fetchRoleId(roleType);

        // Prepare SQL statement to update user
        String sql = "UPDATE users SET EmployeeID = ?, Username = ?, RoleID = ?, UserPassword = ? WHERE UserID = ?";

        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Set parameters for the prepared statement
            stmt.setInt(1, employeeId);
            stmt.setString(2, username);
            stmt.setInt(3, roleId);

            if (newPassword != null && !newPassword.isEmpty()) {
                // Hash the new password
                String hashedPassword = PasswordHash.hashPassword(newPassword);
                stmt.setString(4, hashedPassword);
            } else {
                stmt.setNull(4, Types.VARCHAR);
            }

            stmt.setInt(5, userId);

            // Execute the update
            stmt.executeUpdate();
        }
    } catch (SQLException | HashingException ex) {
        throw new DatabaseException("Error occurred while updating the user in the database", ex);
    }
}



    // Method to delete a user from the database
    public static void deleteUserFromDatabase(int userId) throws DatabaseException {
        String sql = "DELETE FROM users WHERE UserID=?";
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, userId);
            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected == 0) {
                throw new DatabaseException("No user found with UserID " + userId);
            }
        } catch (SQLException ex) {
            throw new DatabaseException("Error occurred while deleting the user from the database", ex);
        }
    }
    public boolean usernameExists(String username) throws SQLException {
        return checkIfExists("SELECT COUNT(*) FROM users WHERE Username = ?", username);
    }

    // Method to check if employee ID exists
    public boolean employeeIdExists(int employeeId) throws SQLException {
        return checkIfExists("SELECT COUNT(*) FROM users WHERE EmployeeID = ?", employeeId);
    }

    // Generic method to check existence based on SQL query
    private boolean checkIfExists(String sql, Object parameter) throws SQLException {
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setObject(1, parameter);
            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next() && rs.getInt(1) > 0;
            }
        }
    }
    

    // Custom exception for database operations
    public static class DatabaseException extends Exception {
        public DatabaseException(String message, Throwable cause) {
            super(message, cause);
        }

        public DatabaseException(String message) {
            super(message);
        }
    }
}
