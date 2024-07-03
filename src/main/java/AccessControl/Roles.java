package AccessControl;

public class Roles {
    public static final int ADMIN_ROLE_ID = 1;
    public static final int PAYROLL_ROLE_ID = 2;
    public static final int HR_ROLE_ID = 3;
    public static final int EMPLOYEE_ROLE_ID = 4;

    public static boolean isAdmin(int roleId) {
        return roleId == ADMIN_ROLE_ID;
    }

    public static boolean isPayroll(int roleId) {
        return roleId == PAYROLL_ROLE_ID;
    }

    public static boolean isHR(int roleId) {
        return roleId == HR_ROLE_ID;
    }

    public static boolean isEmployee(int roleId) {
        return roleId == EMPLOYEE_ROLE_ID;
    }
}