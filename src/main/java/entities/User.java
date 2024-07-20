package entities;

import DatabaseConnection.DatabaseUserDAO.DatabaseException;
import DatabaseConnection.DatabaseUtility;


public class User {
    private int userId;
    private int employeeId;
    private String username;
    private int roleId;
    private String password;

    public User(int userId, int employeeId, String username, int roleId, String password) {
        this.userId = userId;
        this.employeeId = employeeId;
        this.username = username;
        this.roleId = roleId;
        this.password = password;
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
        return getRoleTypeById(this.roleId);
    }

    public String getPassword() {
        return password;
    }

    private String getRoleTypeById(int roleId) {
        return DatabaseUtility.fetchRoleType(roleId); // Log the exception or rethrow as a runtime exception for handling higher up
        // Rethrow as a runtime exception
    }
}
