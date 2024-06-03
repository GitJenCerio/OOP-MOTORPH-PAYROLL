
package DatabaseConnection;

import entities.Employee;


public interface EmployeeDAO {
    Employee getEmployeeById(int userId);
}