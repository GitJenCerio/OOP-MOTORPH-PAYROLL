
package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/motorph"; 
    private static final String USER = "root";
    private static final String PASSWORD = "AmarahLois1108@";

    // Private constructor to prevent instantiation
    private DatabaseConnector() {}

    // Method to establish a connection to the database
    public static Connection getConnection() throws SQLException {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            // Log the exception or handle it appropriately
            throw new SQLException("Failed to connect to the database", e);
        }
    }

    // Method to close a database connection
    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                // Log the exception or handle it appropriately
                System.err.println("Error closing database connection: " + e.getMessage());
            }
        }
    }
}
