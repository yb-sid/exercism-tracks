package com.ybsid.exercism.concepts;

/**
 * <a href="https://exercism.org/tracks/java/exercises/salary-calculator">...</a>
 */
public class SalaryCalculator {
    public double multiplierPerDaysSkipped(int daysSkipped) {
        return daysSkipped>5 ? 0.85 : 1.00;
    }
    public int multiplierPerProductsSold(int productsSold) {
        return productsSold>20 ? 13 : 10;
    }
    public double bonusForProductSold(int productsSold) {
        return 1.00*productsSold * multiplierPerProductsSold(productsSold);
    }
    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = 1000.00* multiplierPerDaysSkipped(daysSkipped) + bonusForProductSold(productsSold);
        return Math.min(salary, 2000.00);
    }
}
