package PayrollSystem;

import entities.Attendance;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TimeSheetGenerator {

    /*public static void main(String[] args) {
        List<AttendanceRecord> records = new ArrayList<>();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy"); // Updated date format
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm"); // Removed seconds from time format

        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 2, 29);

        Random random = new Random();

        for (LocalDate date = startDate; !date.isAfter(endDate); date = date.plusDays(1)) {
            for (int employeeID = 1; employeeID <= 35; employeeID++) {
                // Determine if the employee is absent or on leave
                if (random.nextDouble() < 0.1) { // 10% chance of being absent or on leave
                    continue;
                }

                LocalDateTime timeIn = LocalDateTime.of(date, LocalTime.of(8, 0));
                LocalDateTime timeOut = LocalDateTime.of(date, LocalTime.of(17, 0));

                // Randomly add overtime
                if (random.nextDouble() < 0.2) { // 20% chance of overtime
                    int overtimeMinutes = random.nextInt(121); // Up to 2 hours of overtime
                    timeOut = timeOut.plusMinutes(overtimeMinutes);
                }

                double hoursWorked = (double) (java.time.Duration.between(timeIn, timeOut).toMinutes() - 60) / 60; // Subtract 1 hour break

                AttendanceRecord record = new AttendanceRecord(
                        employeeID,
                        date.format(dateFormatter), // Format the date correctly
                        timeIn.toLocalTime().format(timeFormatter), // Change to only include time
                        timeOut.toLocalTime().format(timeFormatter), // Change to only include time
                        Math.round(hoursWorked * 100.0) / 100.0 // Round to 2 decimal places
                );

                records.add(record);
            }
        }

        try (FileWriter writer = new FileWriter("timesheets.csv")) {
            writer.write("EmployeeID,Date,TimeIn,TimeOut,HoursWorked\n");
            for (AttendanceRecord record : records) {
                writer.write(record.toString() + "\n");
            }
            System.out.println("CSV file generated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}
