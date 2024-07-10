/*package test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import DatabaseConnection.EmployeeDAO;
import authentication.AuthenticationService;
import authentication.LoginController;
import entities.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import javax.naming.AuthenticationException;
import java.sql.SQLException;

class LoginControllerTest {

    private LoginController loginController;

    @Mock
    private AuthenticationService authenticationService;

    @Mock
    private EmployeeDAO employeeDAO;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        loginController = new LoginController(authenticationService, employeeDAO);
    }

    @Test
    void loginAndGetUserInfo_ValidCredentials_ReturnsEmployee() throws SQLException, AuthenticationException {
        // Arrange
        String username = "validUser";
        String password = "validPass";
        int userId = 1;
        int[] userInfo = {userId};
        Employee expectedEmployee = new Employee();

        when(authenticationService.authenticate(username, password)).thenReturn(userInfo);
        when(employeeDAO.getEmployeeById(userId)).thenReturn(expectedEmployee);

        // Act
        Employee result = loginController.loginAndGetUserInfo(username, password);

        // Assert
        assertNotNull(result);
        assertEquals(expectedEmployee, result);
        verify(authenticationService).authenticate(username, password);
        verify(employeeDAO).getEmployeeById(userId);
    }

    @Test
    void loginAndGetUserInfo_InvalidCredentials_ReturnsNull() throws SQLException, AuthenticationException {
        // Arrange
        String username = "invalidUser";
        String password = "invalidPass";
        int[] userInfo = {};

        when(authenticationService.authenticate(username, password)).thenReturn(userInfo);

        // Act
        Employee result = loginController.loginAndGetUserInfo(username, password);

        // Assert
        assertNull(result);
        verify(authenticationService).authenticate(username, password);
        verify(employeeDAO, never()).getEmployeeById(anyInt());
    }

    @Test
    void loginAndGetUserInfo_AuthenticationThrowsException_ThrowsException() throws SQLException, AuthenticationException {
        // Arrange
        String username = "errorUser";
        String password = "errorPass";

        when(authenticationService.authenticate(username, password)).thenThrow(new AuthenticationException("Authentication failed"));

        // Act & Assert
        assertThrows(AuthenticationException.class, () -> loginController.loginAndGetUserInfo(username, password));
        verify(authenticationService).authenticate(username, password);
        verify(employeeDAO, never()).getEmployeeById(anyInt());
    }

    @Test
    void loginAndGetUserInfo_DatabaseThrowsException_ThrowsException() throws SQLException, AuthenticationException {
        // Arrange
        String username = "validUser";
        String password = "validPass";
        int userId = 1;
        int[] userInfo = {userId};

        when(authenticationService.authenticate(username, password)).thenReturn(userInfo);
        when(employeeDAO.getEmployeeById(userId)).thenThrow(new SQLException("Database error"));

        // Act & Assert
        assertThrows(SQLException.class, () -> loginController.loginAndGetUserInfo(username, password));
        verify(authenticationService).authenticate(username, password);
        verify(employeeDAO).getEmployeeById(userId);
    }
}*/
