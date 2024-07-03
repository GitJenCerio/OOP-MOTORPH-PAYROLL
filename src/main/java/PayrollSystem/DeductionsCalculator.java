package PayrollSystem;

import entities.DeductionRates.*;

import java.util.List;

public class DeductionsCalculator {

    private List<SSSRate> sssRates;
    private List<PhilHealthRate> philHealthRates;
    private List<TaxRate> taxRates;

    public DeductionsCalculator(List<SSSRate> sssRates, List<PhilHealthRate> philHealthRates, List<TaxRate> taxRates) {
        this.sssRates = sssRates;
        this.philHealthRates = philHealthRates;
        this.taxRates = taxRates;
    }

    public double calculateSSS(double basicSalary) {
        double deduction = 0.0;

        for (SSSRate rate : sssRates) {
            if (basicSalary >= rate.getMinMonthlySalary() && basicSalary <= rate.getMaxMonthlySalary()) {
                deduction = rate.getRate();
                break;
            }
        }

        return deduction;
    }

  public double calculatePhilHealth(double basicSalary) {
    double deduction = 0.0;
    boolean found = false;

    for (PhilHealthRate rate : philHealthRates) {
        if (basicSalary >= rate.getMinMonthlySalary() && basicSalary <= rate.getMaxMonthlySalary()) {
            if (rate.getMonthlyPremium() == 0.0) {
                deduction = basicSalary * 0.03; // 3% of basic salary
            } else {
                deduction = rate.getMonthlyPremium() * 0.5; // Assuming 50% of monthly premium
            }
            found = true;
            break;
        }
    }

    // If basic salary is higher than the highest minimum rate in the table
    if (!found && !philHealthRates.isEmpty() && basicSalary > philHealthRates.get(philHealthRates.size() - 1).getMinMonthlySalary()) {
        deduction = 1800.0; // Set deduction to 1800
    }

    return deduction;
}


    public double calculatePagIBIGDeduction() {
        return 100.0; // Constant value of 100
    }

    public double calculateTotalDeductions(double basicSalary) {
        double totalDeductions = 0.0;
        totalDeductions = calculateSSS(basicSalary) + calculatePhilHealth(basicSalary) + calculatePagIBIGDeduction() ;
        return totalDeductions;
    }

   public double calculateTaxableIncome(double grossPay, double totalDeductions) {
        double taxableIncome = 0.0;
        taxableIncome = grossPay - (totalDeductions/2);
        return taxableIncome;
    }

    public double calculateWithholdingTax(double taxableIncome) {
        double withholdingTax = 0.0;

        for (TaxRate rate : taxRates) {
            if (taxableIncome >= rate.getMinMonthlyRate() && taxableIncome <= rate.getMaxMonthlyRate()) {
                withholdingTax = (rate.getTaxRate() / 100.0) * taxableIncome - rate.getBaseTax();
                break;
            }
        }

        return withholdingTax;
    }

    // Getters and Setters
    public List<SSSRate> getSssRates() {
        return sssRates;
    }

    public void setSssRates(List<SSSRate> sssRates) {
        this.sssRates = sssRates;
    }

    public List<PhilHealthRate> getPhilHealthRates() {
        return philHealthRates;
    }

    public void setPhilHealthRates(List<PhilHealthRate> philHealthRates) {
        this.philHealthRates = philHealthRates;
    }

    public List<TaxRate> getTaxRates() {
        return taxRates;
    }

    public void setTaxRates(List<TaxRate> taxRates) {
        this.taxRates = taxRates;
    }
}
