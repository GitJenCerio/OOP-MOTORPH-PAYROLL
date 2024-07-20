package DatabaseConnection;


import static DatabaseConnection.DatabaseConnector.getConnection;
import DatabaseConnection.DatabaseUserDAO.DatabaseException;
import DatabaseConnection.DatabaseUtility;
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
        int departmentId = rs.getInt("DepartmentID");

        double basicSalary = rs.getDouble("BasicSalary");
        double riceSubsidy = rs.getDouble("RiceSubsidy");
        double phoneAllowance = rs.getDouble("PhoneAllowance");
        double clothingAllowance = rs.getDouble("ClothingAllowance");
        double grossSemiMonthlyRate = rs.getDouble("GrossSemiMonthlyRate");
        double hourlyRate = rs.getDouble("HourlyRate");

        // Create and return Employee object
        return new Employee(employeeId, lastName, firstName, birthday, address, phoneNumber, sssNumber,
                philHealthNumber, tinNumber, pagIbigNumber, empStatus, position, 
                getSupervisorNameById(supervisorId), getDepartmentNameById(departmentId),
                basicSalary, riceSubsidy, phoneAllowance, clothingAllowance, grossSemiMonthlyRate, hourlyRate);
    }

           public boolean addEmployeeToDatabase(Employee employee) throws SQLException, DatabaseException {
           String sql = "INSERT INTO employees (LastName, FirstName, Birthday, Address, PhoneNumber, SSSNumber, " +
                        "PhilHealthNumber, TinNumber, PagIbigNumber, EmpStatus, Position, BasicSalary, RiceSubsidy, " +
                        "PhoneAllowance, ClothingAllowance, GrossSemiMonthlyRate, HourlyRate, SupervisorID, DepartmentID) " +
                        "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

           try (Connection conn = DatabaseConnector.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

               stmt.setString(1, employee.getLastName());
               stmt.setString(2, employee.getFirstName());
               stmt.setDate(3, new java.sql.Date(employee.getBirthday().getTime()));
               stmt.setString(4, employee.getAddress());
               stmt.setString(5, employee.getPhoneNumber());
               stmt.setString(6, employee.getSssNumber());
               stmt.setString(7, employee.getPhilhealthNumber());
               stmt.setString(8, employee.getTinNumber());
               stmt.setString(9, employee.getPagibigNumber());
               stmt.setString(10, employee.getEmpStatus());
               stmt.setString(11, employee.getPosition());
               stmt.setDouble(12, employee.getBasicSalary());
               stmt.setDouble(13, employee.getRiceSubsidy());
               stmt.setDouble(14, employee.getPhoneAllowance());
               stmt.setDouble(15, employee.getClothingAllowance());
               stmt.setDouble(16, employee.getGrossSemiMonthlyRate());
               stmt.setDouble(17, employee.getHourlyRate());

               // Fetch SupervisorID and DepartmentID dynamically
               int supervisorId = DatabaseUtility.fetchSupervisorID(employee.getSupervisorName());
               int departmentId = DatabaseUtility.fetchDepartmentID(employee.getDepartmentName());

               stmt.setInt(18, supervisorId);
               stmt.setInt(19, departmentId);

               int rowsAffected = stmt.executeUpdate();
               return rowsAffected > 0; // Return true if employee added successfully

           } catch (SQLException ex) {
               logError("Error occurred while adding an employee to the database", ex);
               throw new DatabaseException("Error occurred while adding an employee to the database", ex);
           }
       }

       private void logError(String message, Exception ex) {
           System.err.println(message);
           ex.printStackTrace(); // Print detailed stack trace to the error stream
       }
        public static void deleteEmployeeFromDatabase(int employeeId) throws DatabaseException {
        String sql = "DELETE FROM employees WHERE EmployeeID=?";
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, employeeId);
            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected == 0) {
                throw new DatabaseException("No user found with EmployeeID " + employeeId);
            }
        } catch (SQLException ex) {
            throw new DatabaseException("Error occurred while deleting the Employee from the database", ex);
        }
    }
       

        public boolean isPhoneNumberExists(String phoneNumber) throws SQLException {
        String query = "SELECT COUNT(*) FROM employees WHERE PhoneNumber = ?";
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, phoneNumber);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getInt(1) > 0;
            }
        }
        return false;
    }

    public boolean isSSSNumberExists(String sssNumber) throws SQLException {
        String query = "SELECT COUNT(*) FROM employees WHERE SSSNumber = ?";
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, sssNumber);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getInt(1) > 0;
            }
        }
        return false;
    }

    public boolean isPhilhealthNumberExists(String philhealthNumber) throws SQLException {
        String query = "SELECT COUNT(*) FROM employees WHERE PhilHealthNumber = ?";
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, philhealthNumber);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getInt(1) > 0;
            }
        }
        return false;
    }

    public boolean isTinNumberExists(String tinNumber) throws SQLException {
        String query = "SELECT COUNT(*) FROM employees WHERE TINNumber = ?";
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, tinNumber);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getInt(1) > 0;
            }
        }
        return false;
    }

    public boolean isPagibigNumberExists(String pagibigNumber) throws SQLException {
        String query = "SELECT COUNT(*) FROM employees WHERE PagIbigNumber = ?";
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, pagibigNumber);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getInt(1) > 0;
            }
        }
        return false;
    }

    private String getSupervisorNameById(int supervisorId) {
        String supervisorName = null;
        String query = "SELECT SupervisorName FROM supervisors WHERE SupervisorID = ?";

        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, supervisorId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                supervisorName = rs.getString("SupervisorName");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return supervisorName != null ? supervisorName : "Unknown Supervisor";
    }

    private String getDepartmentNameById(int departmentId) {
        String departmentName = null;
        String query = "SELECT DepartmentName FROM department WHERE DepartmentID = ?";

        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, departmentId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                departmentName = rs.getString("DepartmentName");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return departmentName != null ? departmentName : "Unknown Department";
    }

  public boolean updateEmployeeInDatabase(int employeeId, String newLastName, String newFirstName, java.sql.Date newBirthday, 
                                        String newAddress, String newPhoneNumber, String newSssNumber, String newPhilhealthNumber, 
                                        String newTinNumber, String newPagibigNumber, String newEmpStatus, String newPosition, 
                                        String newSupervisorName, String newDepartmentName, double newBasicSalary, double newRiceSubsidy, 
                                        double newPhoneAllowance, double newClothingAllowance, double newGrossSemiMonthlyRate, 
                                        double newHourlyRate) throws SQLException, DatabaseException {
    String sql = "UPDATE employees SET LastName = ?, FirstName = ?, Birthday = ?, Address = ?, PhoneNumber = ?, SSSNumber = ?, " +
                 "PhilHealthNumber = ?, TinNumber = ?, PagIbigNumber = ?, EmpStatus = ?, Position = ?, BasicSalary = ?, " +
                 "RiceSubsidy = ?, PhoneAllowance = ?, ClothingAllowance = ?, GrossSemiMonthlyRate = ?, HourlyRate = ?, " +
                 "SupervisorID = ?, DepartmentID = ? WHERE EmployeeID = ?";

    try (Connection conn = DatabaseConnector.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, newLastName);
        stmt.setString(2, newFirstName);
        stmt.setDate(3, newBirthday);
        stmt.setString(4, newAddress);
        stmt.setString(5, newPhoneNumber);
        stmt.setString(6, newSssNumber);
        stmt.setString(7, newPhilhealthNumber);
        stmt.setString(8, newTinNumber);
        stmt.setString(9, newPagibigNumber);
        stmt.setString(10, newEmpStatus);
        stmt.setString(11, newPosition);
        stmt.setDouble(12, newBasicSalary);
        stmt.setDouble(13, newRiceSubsidy);
        stmt.setDouble(14, newPhoneAllowance);
        stmt.setDouble(15, newClothingAllowance);
        stmt.setDouble(16, newGrossSemiMonthlyRate);
        stmt.setDouble(17, newHourlyRate);

        // Fetch SupervisorID and DepartmentID dynamically
        int supervisorId = DatabaseUtility.fetchSupervisorID(newSupervisorName);
        int departmentId = DatabaseUtility.fetchDepartmentID(newDepartmentName);

        stmt.setInt(18, supervisorId);
        stmt.setInt(19, departmentId);
        stmt.setInt(20, employeeId);

        int rowsAffected = stmt.executeUpdate();
        return rowsAffected > 0; // Return true if employee updated successfully

    } catch (SQLException ex) {
        logError("Error occurred while updating an employee in the database", ex);
        throw new DatabaseException("Error occurred while updating an employee in the database", ex);
    }
}

public boolean updateEmployeePersonalInfo(Employee employee) throws SQLException {
    String sql = "UPDATE employees SET lastName = ?, firstName = ?, birthday = ?, address = ?, phoneNumber = ? WHERE employeeId = ?";
    try (Connection conn = DatabaseConnector.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, employee.getLastName());
        pstmt.setString(2, employee.getFirstName());
        pstmt.setDate(3, new java.sql.Date(employee.getBirthday().getTime()));
        pstmt.setString(4, employee.getAddress());
        pstmt.setString(5, employee.getPhoneNumber());
        pstmt.setInt(6, employee.getEmployeeId());

        int affectedRows = pstmt.executeUpdate();
        return affectedRows > 0;
    }
}
}