
package DatabaseConnection;

import entities.Employee;
import java.math.BigDecimal;
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
        }
        return null; // Return null if employee not found or error occurred
    }

    public static String generateUserID() {
        String userID = null;
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT MAX(UserID) FROM users")) {
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int lastUserID = rs.getInt(1);
                // Increment the last user ID to generate a new one
                int newUserID = lastUserID + 1;
                userID = String.valueOf(newUserID);
            } else {
                // If no user IDs exist in the database yet, start with 1
                userID = "1";
            }
        } catch (SQLException ex) {
            ex.printStackTrace(); // Handle the exception properly
        }
        return userID;
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
        BigDecimal basicSalary = rs.getBigDecimal("BasicSalary");
        BigDecimal riceSubsidy = rs.getBigDecimal("RiceSubsidy");
        BigDecimal phoneAllowance = rs.getBigDecimal("PhoneAllowance");
        BigDecimal clothingAllowance = rs.getBigDecimal("ClothingAllowance");
        BigDecimal grossSemiMonthlyRate = rs.getBigDecimal("GrossSemiMonthlyRate");
        BigDecimal hourlyRate = rs.getBigDecimal("HourlyRate");
        int supervisorId = rs.getInt("SupervisorID");

        // Create and return Employee object
        return new Employee(employeeId, lastName, firstName, birthday, address, phoneNumber,
                sssNumber, philHealthNumber, tinNumber, pagIbigNumber, empStatus, position,
                immediateSupervisor, basicSalary, riceSubsidy, phoneAllowance, clothingAllowance,
                grossSemiMonthlyRate, hourlyRate, supervisorId);
    }
    
}



    

