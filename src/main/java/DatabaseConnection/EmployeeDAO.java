package DatabaseConnection;

import entities.Employee;
import java.sql.SQLException;

public interface EmployeeDAO {
    Employee getEmployeeById(int userId) throws SQLException;
}