package entities;

import DatabaseConnection.*;
import DatabaseConnection.DatabaseUserDAO.DatabaseException;


public class User {
    private int userId;
    private int employeeId;
    private String username;
    private int roleId;
    private String roleType; // Updated to store RoleType
    private String password; // Added password field

    public User(int userId, int employeeId, String username, int roleId, String password) {
        this.userId = userId;
        this.employeeId = employeeId;
        this.username = username;
        this.roleId = roleId;
        this.password = password;
        try {
            this.roleType = fetchRoleType(roleId); // Initialize roleType from roleId
        } catch (DatabaseException ex) {
            // Log the exception or rethrow as a runtime exception for handling higher up
            System.err.println("Error fetching role type for roleId " + roleId + ": " + ex.getMessage());
            throw new RuntimeException(ex); // Rethrow as a runtime exception
        }
    }

    public int getUserId() {
        return userId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getUsername() {
        return username;
    }

    public int getRoleId() {
        return roleId;
    }
    
    public String getRoleType() {
        return roleType;
    }

    public String getPassword() {
        return password;
    }

    // Method to fetch RoleType from Database based on RoleID
    private String fetchRoleType(int roleId) throws DatabaseException {
        return DatabaseUtility.fetchRoleType(roleId);
    }
}
