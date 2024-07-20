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

   public boolean uploadCSV(String csvFilePath) {
    String sql = "INSERT INTO attendance (EmployeeID, AttendanceDate, TimeIn, TimeOut, HoursWorked) VALUES (?, ?, ?, ?, ?)";

    try (Connection connection = DatabaseConnector.getConnection();
         BufferedReader reader = new BufferedReader(new FileReader(csvFilePath));
         PreparedStatement statement = connection.prepareStatement(sql)) {

        String line;
        int lineCount = 0;
        boolean isFirstLine = true;
        int recordsInserted = 0;
        int recordsFailed = 0;

        while ((line = reader.readLine()) != null) {
            if (isFirstLine) {
                isFirstLine = false; // Skip the header line
                continue;
            }

            lineCount++;
            String[] data = line.split(",");
            if (data.length < 5) {
                System.err.println("Invalid data format at line " + lineCount + ": " + line);
                recordsFailed++;
                continue;
            }

            int employeeID = Integer.parseInt(data[0].trim());
            String dateString = data[1].trim();
            String timeIn = data[2].trim();
            String timeOut = data[3].trim();
            double hoursWorked = Double.parseDouble(data[4].trim());

            Date date;
            try {
                SimpleDateFormat sdfInput = new SimpleDateFormat("MM/dd/yyyy");
                java.util.Date parsedDate = sdfInput.parse(dateString);
                SimpleDateFormat sdfOutput = new SimpleDateFormat("yyyy-MM-dd");
                date = Date.valueOf(sdfOutput.format(parsedDate));
            } catch (ParseException | IllegalArgumentException e) {
                System.err.println("Invalid date format at line " + lineCount + ": " + dateString);
                recordsFailed++;
                continue;
            }

            statement.setInt(1, employeeID);
            statement.setDate(2, date);
            statement.setString(3, timeIn);
            statement.setString(4, timeOut);
            statement.setDouble(5, hoursWorked);

            statement.addBatch();
        }

        // Execute batch insert
        int[] rowsInsertedArray = statement.executeBatch();
        for (int result : rowsInsertedArray) {
            if (result == PreparedStatement.EXECUTE_FAILED) {
                recordsFailed++;
            } else {
                recordsInserted++;
            }
        }

        System.out.println("Total records processed: " + lineCount);
        System.out.println("Records inserted: " + recordsInserted);
        System.out.println("Records failed: " + recordsFailed);

        return recordsFailed == 0;

    } catch (IOException e) {
        System.err.println("IO Error: " + e.getMessage());
    } catch (SQLException e) {
        System.err.println("SQL Error: " + e.getMessage());
        System.err.println("SQL State: " + e.getSQLState());
    }
    return false;
}
}