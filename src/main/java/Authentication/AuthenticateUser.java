package authentication;

import DatabaseConnection.DatabaseConnector;
import PayrollSystem.UserActionLogger;

import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.AuthenticationException;

public class AuthenticateUser implements AuthenticationService {

    @Override
    public int[] authenticate(String username, String password) throws SQLException, AuthenticationException {
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT UserID, RoleID, UserPassword FROM users WHERE Username = ?")) {
            stmt.setString(1, username);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    // Retrieve hashed password from the result set
                    String hashedPassword = rs.getString("UserPassword");

                    // Validate the provided password
                    if (PasswordHash.validatePassword(password, hashedPassword)) {
                        // Authentication successful, log the event
                        int userId = rs.getInt("UserID");
                        UserActionLogger.logUserAction(userId, "Login", "User logged in successfully.");
                        return new int[]{userId, rs.getInt("RoleID")};
                    } else {
                        // Incorrect password, log invalid login attempt
                        int userId = rs.getInt("UserID");
                        UserActionLogger.logInvalidLoginAttempt(userId, username);
                        throw new AuthenticationException("Invalid password");
                    }
                } else {
                    // User not found, log invalid login attempt
                    UserActionLogger.logInvalidLoginAttempt(-1, username);
                    throw new AuthenticationException("User not found");
                }
            }
        } catch (SQLException | PasswordHash.HashingException e) {
            // Log any SQL, hashing related exceptions or authentication exceptions
            throw new SQLException("Error occurred during authentication", e);
        }
    }
}
