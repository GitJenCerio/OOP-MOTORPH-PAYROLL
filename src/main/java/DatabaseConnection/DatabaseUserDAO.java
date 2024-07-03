package DatabaseConnection;

import authentication.PasswordHash;
import authentication.PasswordHash.HashingException;
import entities.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTextField;

public class DatabaseUserDAO {
    
    public User getUserByUserId(int userId) throws DatabaseException {
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT UserID, EmployeeID, Username, RoleID, UserPassword FROM users WHERE UserID=?")) {
            stmt.setInt(1, userId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    int id = rs.getInt("UserID");
                    int employeeId = rs.getInt("EmployeeID");
                    String username = rs.getString("Username");
                    int roleId = rs.getInt("RoleID");
                    String password = rs.getString("UserPassword");
                    
                    // Replace each character of the password with an asterisk
                    StringBuilder hiddenPassword = new StringBuilder();
                    for (int i = 0; i < password.length(); i++) {
                        hiddenPassword.append("*");
                    }
                    
                    return new User(id, employeeId, username, roleId, hiddenPassword.toString());
                } else {
                    return null; // User not found
                }
            }
        } catch (SQLException ex) {
            throw new DatabaseException("Error occurred while retrieving the user from the database");
        }
    
    }

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
    } catch (SQLException ex) {
        throw new DatabaseException("SQL Error occurred while adding a user to the database: " + ex.getMessage(), ex);
    } catch (HashingException ex) {
        throw new DatabaseException("Error occurred while hashing the password: " + ex.getMessage(), ex);
    }
}

    // Method to update an existing user in the database
   public void updateUserInDatabase(User updatedUser) throws DatabaseException {
    try (Connection conn = DatabaseConnector.getConnection();
         PreparedStatement stmt = conn.prepareStatement("UPDATE users SET EmployeeID=?, Username=?, RoleID=?, UserPassword=? WHERE UserID=?")) {
        
        // Hash the password using the PasswordHasher utility class
        String hashedPassword = PasswordHash.hashPassword(updatedUser.getHiddenPassword());

        stmt.setInt(1, updatedUser.getEmployeeId());
        stmt.setString(2, updatedUser.getUsername());
        stmt.setInt(3, updatedUser.getRoleId());
        stmt.setString(4, hashedPassword);
        stmt.setInt(5, updatedUser.getUserId());
        
        stmt.executeUpdate();
    } catch (SQLException | HashingException ex) {
        throw new DatabaseException("Error occurred while updating the user in the database");
    }
}


    // Method to delete a user from the database
public void deleteUserFromDatabase(int userId) throws DatabaseException {
    try (Connection conn = DatabaseConnector.getConnection();
         PreparedStatement stmt = conn.prepareStatement("DELETE FROM users WHERE UserID=?")) {
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
