package DatabaseConnection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date; // Import for SQL date type
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CSVUploader {

    public void uploadCSV(String csvFilePath) {
        String sql = "INSERT INTO attendance (EmployeeID, Date, TimeIn, TimeOut, HoursWorked) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = DatabaseConnector.getConnection();
             BufferedReader reader = new BufferedReader(new FileReader(csvFilePath));
             PreparedStatement statement = connection.prepareStatement(sql)) {

            String line;
            int lineCount = 0;
            reader.readLine(); // Skip the header line
            while ((line = reader.readLine()) != null) {
                lineCount++;
                String[] data = line.split(",");
                if (data.length < 5) {
                    System.err.println("Invalid data format at line " + lineCount + ": " + line);
                    continue;
                }
                int employeeID = Integer.parseInt(data[0].trim());
                String dateString = data[1].trim(); // Assuming date is in 'MM/DD/YYYY' format
                String timeIn = data[2].trim();
                String timeOut = data[3].trim();
                double hoursWorked = Double.parseDouble(data[4].trim());

                // Convert dateString to MySQL date format 'YYYY-MM-DD'
                Date date;
                try {
                    SimpleDateFormat sdfInput = new SimpleDateFormat("MM/dd/yyyy"); // Input format from CSV
                    java.util.Date parsedDate = sdfInput.parse(dateString);
                    SimpleDateFormat sdfOutput = new SimpleDateFormat("yyyy-MM-dd"); // Output format for MySQL
                    date = Date.valueOf(sdfOutput.format(parsedDate));
                } catch (ParseException | IllegalArgumentException e) {
                    System.err.println("Invalid date format at line " + lineCount + ": " + dateString);
                    continue;
                }

                statement.setInt(1, employeeID);
                statement.setDate(2, date); // Use setDate for SQL Date type
                statement.setString(3, timeIn);
                statement.setString(4, timeOut);
                statement.setDouble(5, hoursWorked);

                statement.addBatch();
            }

            // Execute batch insert
            int[] rowsInserted = statement.executeBatch();
            System.out.println("Rows inserted: " + rowsInserted.length);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }
}
