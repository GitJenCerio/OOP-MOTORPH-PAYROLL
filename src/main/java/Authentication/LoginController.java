package authentication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Database.DatabaseConnector;

public class LoginController {
    
    
    private final Authentication authentication;
    
    public LoginController() {
        this.authentication = new Authentication();
    }
    
    // Method to handle user login and fetch user ID and role ID
    public int[] loginAndGetUserId(String username, String password) {
        // Delegate the authentication to the Authentication class
        return authentication.authenticate(username, password);
    }
}
