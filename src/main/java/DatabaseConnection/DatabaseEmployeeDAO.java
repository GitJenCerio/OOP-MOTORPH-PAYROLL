package DatabaseConnection;

import entities.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
    int supervisorId = rs.getInt("SupervisorID");
    int departmentId = rs.getInt("DepartmentID"); // Assuming you have this column in your ResultSet

    double basicSalary = rs.getDouble("BasicSalary");
    double riceSubsidy = rs.getDouble("RiceSubsidy");
    double phoneAllowance = rs.getDouble("PhoneAllowance");
    double clothingAllowance = rs.getDouble("ClothingAllowance");
    double grossSemiMonthlyRate = rs.getDouble("GrossSemiMonthlyRate");
    double hourlyRate = rs.getDouble("HourlyRate");

    // Create and return Employee object
    return new Employee(employeeId, lastName, firstName, birthday, address, phoneNumber, sssNumber,
            philHealthNumber, tinNumber, pagIbigNumber, empStatus, position, supervisorId, departmentId,
            basicSalary, riceSubsidy, phoneAllowance, clothingAllowance, grossSemiMonthlyRate, hourlyRate);
}
   public boolean addEmployee(Employee employee) throws SQLException, DatabaseUserDAO.DatabaseException {
        String sql = "INSERT INTO employees (LastName, FirstName, Birthday, Address, PhoneNumber, SSSNumber, " +
                     "PhilHealthNumber, TinNumber, PagIbigNumber, EmpStatus, Position, BasicSalary, RiceSubsidy, " +
                     "PhoneAllowance, ClothingAllowance, GrossSemiMonthlyRate, HourlyRate, SupervisorID, DepartmentID) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, employee.getLastName());
            stmt.setString(2, employee.getFirstName());
            stmt.setDate(3, new java.sql.Date(employee.getBirthday().getTime()));
            stmt.setString(4, employee.getAddress());
            stmt.setString(5, employee.getPhoneNumber());
            stmt.setString(6, employee.getSssNumber());
            stmt.setString(7, employee.getPhilHealthNumber());
            stmt.setString(8, employee.getTinNumber());
            stmt.setString(9, employee.getPagIbigNumber());
            stmt.setString(10, employee.getEmpStatus());
            stmt.setString(11, employee.getPosition());
            stmt.setDouble(12, employee.getBasicSalary());
            stmt.setDouble(13, employee.getRiceSubsidy());
            stmt.setDouble(14, employee.getPhoneAllowance());
            stmt.setDouble(15, employee.getClothingAllowance());
            stmt.setDouble(16, employee.getGrossSemiMonthlyRate());
            stmt.setDouble(17, employee.getHourlyRate());

          // Fetch SupervisorID and DepartmentID dynamically
            int supervisorId = DatabaseUtility.fetchSupervisorID(employee.getSupervisor());
            int departmentId = DatabaseUtility.fetchDepartmentID(employee.getDepartment());

            stmt.setInt(18, supervisorId);
            stmt.setInt(19, departmentId);

            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 1) {
                ResultSet generatedKeys = stmt.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int employeeId = generatedKeys.getInt(1);
                    employee.setEmployeeId(employeeId);
                    return true; // Employee added successfully
                }
            }
        }

        return false; // Failed to add employee
    }
}
    
