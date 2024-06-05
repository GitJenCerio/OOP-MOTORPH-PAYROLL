
package authentication;

import DatabaseConnection.DatabaseConnector;
import java.security.MessageDigest;
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
                    
                    // Hash the provided password
                    String hashedProvidedPassword = hashPassword(password);
                    
                    // Compare hashed passwords
                    if (hashedPassword.equals(hashedProvidedPassword)) {
                        // Authentication successful, return user ID and role ID
                        return new int[]{rs.getInt("UserID"), rs.getInt("RoleID")};
                    }
                }
            }
        }
        // Authentication failed or error occurred, throw custom exception
        throw new AuthenticationException("Authentication failed");
    }
    
    // Method to hash the password using SHA-256
    private String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(password.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            // Handle the exception properly
            return null;
        }
    }
}
