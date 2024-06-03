
package authentication;

import DatabaseConnection.DatabaseConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.AuthenticationException;

public class AuthenticateUser implements AuthenticationService {

    @Override
    public int[] authenticate(String username, String password) throws SQLException, AuthenticationException {
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT UserID, RoleID FROM users WHERE Username = ? AND UserPassword = ?")) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    // Authentication successful, return user ID and role ID
                    return new int[]{rs.getInt("UserID"), rs.getInt("RoleID")};
                }
            }
        }
        // Authentication failed or error occurred, throw custom exception
        throw new AuthenticationException("Authentication failed");
    }
}
