package DatabaseConnection;

import authentication.PasswordHash;
import authentication.PasswordHash.HashingException;
import entities.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
    private String maskPassword(String password) {
        StringBuilder maskedPassword = new StringBuilder();
        for (int i = 0; i < password.length(); i++) {
            maskedPassword.append("*");
        }
        return maskedPassword.toString();
    }


    public void addUserToDatabase(int employeeId, String username, String password, String roleType) throws DatabaseException {
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
                stmt.setString(3, hashedPassword); // Store the hashed password in the database
                stmt.setInt(4, roleId);

                // Execute the update
                stmt.executeUpdate();
            }
        } catch (SQLException | HashingException ex) {
            throw new DatabaseException("Error occurred while adding a user to the database", ex);
        }
    }

 // Method to update an existing user in the database
    
public void updateUserInDatabase(int userId, int employeeId, String username, String roleType, String newPassword) throws DatabaseException {
    try {
        // Fetch RoleID based on RoleType
        int roleId = DatabaseUtility.fetchRoleId(roleType);

        // Fetch existing user details from the database
        DatabaseUserDAO userDAO = new DatabaseUserDAO();
        User existingUser = userDAO.getUserByUserId(userId);

        // Prepare SQL statement to update user
        StringBuilder sqlBuilder = new StringBuilder("UPDATE users SET ");
        List<Object> params = new ArrayList<>();

        // Check each field and add to SQL statement and params if changed
        if (employeeId != existingUser.getEmployeeId()) {
            sqlBuilder.append("EmployeeID = ?, ");
            params.add(employeeId);
        }

        if (!username.equals(existingUser.getUsername())) {
            sqlBuilder.append("Username = ?, ");
            params.add(username);
        }

        if (!roleType.equals(existingUser.getRoleType())) {
            sqlBuilder.append("RoleID = ?, ");
            params.add(roleId);
        }

        // Check if newPassword is provided and not empty
        if (newPassword != null && !newPassword.isEmpty()) {
            // Hash the new password
            String hashedPassword = PasswordHash.hashPassword(newPassword);
            sqlBuilder.append("UserPassword = ?, ");
            params.add(hashedPassword); // Add hashed password to parameters
        }

        // Remove trailing comma and space from SQL statement
        sqlBuilder.delete(sqlBuilder.length() - 2, sqlBuilder.length());

        // Add WHERE clause for userId
        sqlBuilder.append(" WHERE UserID = ?");
        params.add(userId);

        String sql = sqlBuilder.toString();

        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Set parameters for the prepared statement
            int index = 1;
            for (Object param : params) {
                stmt.setObject(index++, param);
            }

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
