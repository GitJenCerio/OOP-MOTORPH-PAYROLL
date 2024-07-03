package DatabaseConnection;

import entities.DeductionRates.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DeductionsDAO {

    private Connection connect() throws SQLException {
        return DatabaseConnector.getConnection();
    }

    public List<PhilHealthRate> fetchPhilHealthRates() {
        String sql = "SELECT MinMonthlySalary, MaxMonthlySalary, MonthlyPremium FROM philhealthrate";
        List<PhilHealthRate> rates = new ArrayList<>();

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                double minMonthlySalary = rs.getDouble("MinMonthlySalary");
                double maxMonthlySalary = rs.getDouble("MaxMonthlySalary");
                double monthlyPremium = rs.getDouble("MonthlyPremium");

                PhilHealthRate philHealthRate = new PhilHealthRate(minMonthlySalary, maxMonthlySalary, monthlyPremium);
                rates.add(philHealthRate);
            }
        } catch (SQLException e) {
            System.out.println("Error fetching PhilHealth rates: " + e.getMessage());
        }
        return rates;
    }

    public List<SSSRate> fetchSSSRates() {
        String sql = "SELECT MinMonthlySalary, MaxMonthlySalary, SSSDeduction FROM sssrate";
        List<SSSRate> rates = new ArrayList<>();

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                double minMonthlySalary = rs.getDouble("MinMonthlySalary");
                double maxMonthlySalary = rs.getDouble("MaxMonthlySalary");
                double rate = rs.getDouble("SSSDeduction");

                SSSRate sssRate = new SSSRate(minMonthlySalary, maxMonthlySalary, rate);
                rates.add(sssRate);
            }
        } catch (SQLException e) {
            System.out.println("Error fetching SSS rates: " + e.getMessage());
        }
        return rates;
    }

    public List<TaxRate> fetchTaxRates() {
        String sql = "SELECT * FROM taxrate ORDER BY MinMonthlyRate ASC";
        List<TaxRate> taxRates = new ArrayList<>();

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int taxRateID = rs.getInt("TaxRateID");
                double minMonthlyRate = rs.getDouble("MinMonthlyRate");
                double maxMonthlyRate = rs.getDouble("MaxMonthlyRate");
                double taxRate = rs.getDouble("TaxRate");
                double baseTax = rs.getDouble("BaseTax");

                TaxRate taxRateObject = new TaxRate(taxRateID, minMonthlyRate, maxMonthlyRate, taxRate, baseTax);
                taxRates.add(taxRateObject);
            }
        } catch (SQLException e) {
            System.out.println("Error fetching tax rates: " + e.getMessage());
        }
        return taxRates;
    }
}
