package entities;

public class DeductionRates {

    public static class SSSRate {
        double minMonthlySalary;
        double maxMonthlySalary;
        double rate; // Percentage rate

        public SSSRate(double minMonthlySalary, double maxMonthlySalary, double rate) {
            this.minMonthlySalary = minMonthlySalary;
            this.maxMonthlySalary = maxMonthlySalary;
            this.rate = rate;
        }

        // Getters and Setters
        public double getMinMonthlySalary() {
            return minMonthlySalary;
        }

        public void setMinMonthlySalary(double minMonthlySalary) {
            this.minMonthlySalary = minMonthlySalary;
        }

        public double getMaxMonthlySalary() {
            return maxMonthlySalary;
        }

        public void setMaxMonthlySalary(double maxMonthlySalary) {
            this.maxMonthlySalary = maxMonthlySalary;
        }

        public double getRate() {
            return rate;
        }

        public void setRate(double rate) {
            this.rate = rate;
        }
    }

    public static class PhilHealthRate {
        private double minMonthlySalary;
        private double maxMonthlySalary;
        private double monthlyPremium;

        public PhilHealthRate(double minMonthlySalary, double maxMonthlySalary, double monthlyPremium) {
            this.minMonthlySalary = minMonthlySalary;
            this.maxMonthlySalary = maxMonthlySalary;
            this.monthlyPremium = monthlyPremium;
        }

        // Getters and Setters
        public double getMinMonthlySalary() {
            return minMonthlySalary;
        }

        public void setMinMonthlySalary(double minMonthlySalary) {
            this.minMonthlySalary = minMonthlySalary;
        }

        public double getMaxMonthlySalary() {
            return maxMonthlySalary;
        }

        public void setMaxMonthlySalary(double maxMonthlySalary) {
            this.maxMonthlySalary = maxMonthlySalary;
        }

        public double getMonthlyPremium() {
            return monthlyPremium;
        }

        public void setMonthlyPremium(double monthlyPremium) {
            this.monthlyPremium = monthlyPremium;
        }
    }

    public static class TaxRate {
        // Fields
        private int taxRateID;
        private double minMonthlyRate;
        private double maxMonthlyRate;
        private double taxRate;
        private double baseTax;

        // Constructor
        public TaxRate(int taxRateID, double minMonthlyRate, double maxMonthlyRate, double taxRate, double baseTax) {
            this.taxRateID = taxRateID;
            this.minMonthlyRate = minMonthlyRate;
            this.maxMonthlyRate = maxMonthlyRate;
            this.taxRate = taxRate;
            this.baseTax = baseTax;
        }

        // Getters
        public int getTaxRateID() {
            return taxRateID;
        }

        public double getMinMonthlyRate() {
            return minMonthlyRate;
        }

        public double getMaxMonthlyRate() {
            return maxMonthlyRate;
        }

        public double getTaxRate() {
            return taxRate;
        }

        public double getBaseTax() {
            return baseTax;
        }

        // Setters
        public void setTaxRateID(int taxRateID) {
            this.taxRateID = taxRateID;
        }

        public void setMinMonthlyRate(double minMonthlyRate) {
            this.minMonthlyRate = minMonthlyRate;
        }

        public void setMaxMonthlyRate(double maxMonthlyRate) {
            this.maxMonthlyRate = maxMonthlyRate;
        }

        public void setTaxRate(double taxRate) {
            this.taxRate = taxRate;
        }

        public void setBaseTax(double baseTax) {
            this.baseTax = baseTax;
        }
    }

    // Other classes and methods within DeductionRates
}
