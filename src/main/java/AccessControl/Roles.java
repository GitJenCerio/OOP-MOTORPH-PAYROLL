
package AccessControl;

public class Roles {
    
    public static boolean isAdmin(int roleId) {
        return roleId == 1;
    }
    
    public static boolean isPayroll(int roleId) {
        return roleId == 2;
    }
    
    public static boolean isHR(int roleId) {
        return roleId == 3;
    }
    
    public static boolean isEmployee(int roleId) {
        return roleId == 4;
    }
}
