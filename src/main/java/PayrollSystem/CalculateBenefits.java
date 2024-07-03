package PayrollSystem;

import entities.Employee;
import DatabaseConnection.DatabaseEmployeeDAO; // Import the correct DAO class

public class CalculateBenefits {
    private DatabaseEmployeeDAO databaseEmployeeDAO; // Declare DatabaseEmployeeDAO instance

    // Constructor to initialize DatabaseEmployeeDAO
    public CalculateBenefits() {
        this.databaseEmployeeDAO = new DatabaseEmployeeDAO(); // Initialize your DAO instance here
    }

    // Method to calculate total benefits for an employee
    public double getTotalBenefits(int employeeID) {
        try {
            // Fetch employee details from database or wherever you store employee information
            Employee employee = databaseEmployeeDAO.getEmployeeById(employeeID);

            if (employee == null) {
                // Handle case where employee ID does not exist or fetch failed
                return 0.0; // Or throw an exception as per your application's error handling strategy
            }

            // Calculate total benefits based on the employee's attributes
            double totalBenefits = 0.0;
            
            // Example calculations, replace with your actual attribute names
            totalBenefits += employee.getRiceSubsidy();
            totalBenefits += employee.getPhoneAllowance();
            totalBenefits += employee.getClothingAllowance();
            
            // Add other benefit calculations as needed
            
            return totalBenefits;
        } catch (Exception e) {
            // Handle exceptions appropriately (log, rethrow, etc.)
            e.printStackTrace(); // Example: Print stack trace for debugging
            return 0.0; // Return a default value or handle the error gracefully
        }
    }
}
