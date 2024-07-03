package DatabaseConnection;

import entities.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class DatabaseEmployeeDAO implements EmployeeDAO {

    @Override
    public Employee getEmployeeById(int userId) {
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM employees WHERE EmployeeID = ?")) {
            stmt.setInt(1, userId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    // Retrieve employee details from the result set
                    return extractEmployeeFromResultSet(rs);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle or log the exception properly
        }
        return null; // Return null if employee not found or error occurred
    }

    public Employee searchEmployeeByID(String employeeID) {
        try {
            int userId = Integer.parseInt(employeeID);
            return getEmployeeById(userId);
        } catch (NumberFormatException e) {
            System.err.println("Invalid employee ID format.");
            return null;
        }
    }

    private Employee extractEmployeeFromResultSet(ResultSet rs) throws SQLException {
        int employeeId = rs.getInt("EmployeeID");
        String lastName = rs.getString("LastName");
        String firstName = rs.getString("FirstName");
        Date birthday = rs.getDate("Birthday");
        String address = rs.getString("Address");
        String phoneNumber = rs.getString("PhoneNumber");
        String sssNumber = rs.getString("SSSNumber");
        String philHealthNumber = rs.getString("PhilHealthNumber");
        String tinNumber = rs.getString("TinNumber");
        String pagIbigNumber = rs.getString("PagIbigNumber");
        String empStatus = rs.getString("EmpStatus");
        String position = rs.getString("Position");
        String immediateSupervisor = rs.getString("ImmediateSupervisor");
        
        double basicSalary = rs.getDouble("BasicSalary");
        double riceSubsidy = rs.getDouble("RiceSubsidy");
        double phoneAllowance = rs.getDouble("PhoneAllowance");
        double clothingAllowance = rs.getDouble("ClothingAllowance");
        double grossSemiMonthlyRate = rs.getDouble("GrossSemiMonthlyRate");
        double hourlyRate = rs.getDouble("HourlyRate");
        
        int supervisorId = rs.getInt("SupervisorID");

        // Create and return Employee object
        return new Employee(employeeId, lastName, firstName, birthday, address, phoneNumber,
                sssNumber, philHealthNumber, tinNumber, pagIbigNumber, empStatus, position,
                immediateSupervisor, basicSalary, riceSubsidy, phoneAllowance, clothingAllowance,
                grossSemiMonthlyRate, hourlyRate, supervisorId);
    }
}
