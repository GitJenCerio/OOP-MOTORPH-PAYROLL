
package entities;


public class User {
    private int userId;
    private int employeeId;
    private String username;
    private int roleId;
    private String password; // New field for hidden password

    public User(int userId, int employeeId, String username, int roleId, String password) {
        this.userId = userId;
        this.employeeId = employeeId;
        this.username = username;
        this.roleId = roleId;
        this.password = password; // Initialize hidden password
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
    
    public String getHiddenPassword() {
        return password;
    }
}
