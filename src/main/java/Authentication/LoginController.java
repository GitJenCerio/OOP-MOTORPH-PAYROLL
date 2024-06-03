package authentication;

import DatabaseConnection.EmployeeDAO;
import entities.Employee;
import java.sql.SQLException;
import javax.naming.AuthenticationException;

public class LoginController {
    private final AuthenticationService authenticationService;
    private final EmployeeDAO employeeDAO;

    public LoginController(AuthenticationService authenticationService, EmployeeDAO employeeDAO) {
        this.authenticationService = authenticationService;
        this.employeeDAO = employeeDAO;
    }

    public Employee loginAndGetUserInfo(String username, String password) throws SQLException, AuthenticationException {
        int[] userInfo = authenticationService.authenticate(username, password);

        if (userInfo.length > 0) {
            return employeeDAO.getEmployeeById(userInfo[0]);
        }
        return null;
    }
}
