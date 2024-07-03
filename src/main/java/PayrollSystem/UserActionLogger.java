
package PayrollSystem;

import DatabaseConnection.DatabaseConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserActionLogger {
    
    private static final Logger LOGGER = Logger.getLogger(UserActionLogger.class.getName());

    public static void logUserAction(int userId, String action, String details) {
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(
                     "INSERT INTO user_logs (UserID, Action, Details, Timestamp) VALUES (?, ?, ?, ?)")) {
            stmt.setInt(1, userId);
            stmt.setString(2, action);
            stmt.setString(3, details);
            stmt.setTimestamp(4, new Timestamp(System.currentTimeMillis())); // Set current timestamp
            stmt.executeUpdate();
            LOGGER.log(Level.INFO, "User action logged successfully: " + action);
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, "Error logging user action", ex);
        }
    }

    public static void logInvalidLoginAttempt(int userId, String username) {
        String action = "Invalid Login";
        String details = "Invalid login attempt for username: " + username;
        logUserAction(-1, action, details); // Assuming -1 represents an invalid user ID
    }
    
    public static void logUserAddition(int userId, String username) {
    String action = "User Addition";
    String details = "User added: UserID: " + userId + ", Username: " + username;
    logUserAction(userId, action, details);
}

    public static void logUserUpdate(int userId, String username, String updatedField) {
    String action = "User Update";
    String details = "User information updated for UserID: " + userId + ", Username: " + username + ", Updated Field: " + updatedField;
    logUserAction(userId, action, details);
}

    public static void logUserDeletion(int userId, String username) {
    String action = "User Deletion";
    String details = "User deleted: UserID: " + userId + ", Username: " + username;
    logUserAction(userId, action, details);
}

}
