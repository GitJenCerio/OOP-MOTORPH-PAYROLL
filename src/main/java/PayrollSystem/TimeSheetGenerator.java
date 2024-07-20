package PayrollSystem;

import entities.AttendanceRecord;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TimeSheetGenerator {

    public List<AttendanceRecord> generateTimeSheet(LocalDate startDate, LocalDate endDate, int numEmployees) {
        List<AttendanceRecord> records = new ArrayList<>();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

        Random random = new Random();

        for (LocalDate date = startDate; !date.isAfter(endDate); date = date.plusDays(1)) {
            for (int employeeID = 1; employeeID <= numEmployees; employeeID++) {
                // Determine if the employee is absent or worked zero hours
                double randomValue = random.nextDouble();
                if (randomValue < 0.1) { // 10% chance of being absent
                    // Add record with 0 hours worked and time set to 00:00
                    AttendanceRecord record = new AttendanceRecord(
                            employeeID,
                            date,
                            LocalTime.of(0, 0), // TimeIn set to 00:00 for absence
                            LocalTime.of(0, 0), // TimeOut set to 00:00 for absence
                            0.0 // 0 hours worked
                    );
                    records.add(record);
                    continue;
                } else if (randomValue < 0.2) { // Additional 10% chance of working zero hours
                    LocalTime timeIn = LocalTime.of(8, 0);
                    LocalTime timeOut = LocalTime.of(8, 0); // Same time in and out means 0 hours worked
                    double hoursWorked = 0.0;

                    // Create an AttendanceRecord object
                    AttendanceRecord record = new AttendanceRecord(
                            employeeID,
                            date,
                            timeIn,
                            timeOut,
                            hoursWorked
                    );
                    records.add(record);
                    continue;
                }

                LocalTime timeIn = LocalTime.of(8, 0);
                LocalTime timeOut = LocalTime.of(17, 0);

                // Randomly add overtime
                if (random.nextDouble() < 0.1) { // 10% chance of overtime
                    int overtimeMinutes = random.nextInt(121); // Up to 2 hours of overtime
                    timeOut = timeOut.plusMinutes(overtimeMinutes);
                }

                double hoursWorked = (double) (java.time.Duration.between(timeIn, timeOut).toMinutes() - 60) / 60.0; // Subtract 1 hour break

                // Ensure hoursWorked is not negative
                hoursWorked = Math.max(0, hoursWorked);

                // Create an AttendanceRecord object
                AttendanceRecord record = new AttendanceRecord(
                        employeeID,
                        date,
                        timeIn,
                        timeOut,
                        hoursWorked
                );

                records.add(record);
            }
        }

        return records;
    }

    public void saveToCSV(List<AttendanceRecord> records, String filePath) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("EmployeeID,Date,TimeIn,TimeOut,HoursWorked\n");
            for (AttendanceRecord record : records) {
                writer.write(String.format("%d,%s,%s,%s,%.2f\n",
                        record.getEmployeeID(),
                        record.getDate().format(dateFormatter),
                        record.getTimeIn() != null ? record.getTimeIn().format(timeFormatter) : "00:00",
                        record.getTimeOut() != null ? record.getTimeOut().format(timeFormatter) : "00:00",
                        record.getHoursWorked()
                ));
            }
            System.out.println("CSV file generated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
