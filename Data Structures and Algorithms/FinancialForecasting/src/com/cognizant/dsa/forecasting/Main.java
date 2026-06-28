package com.cognizant.dsa.forecasting;

/**
 * Main class to test financial forecasting algorithms.
 */
public class Main {
    public static void main(String[] args) {
        FinancialForecasting forecasting = new FinancialForecasting();

        double presentValue = 1000.0; // Initial investment of $1000
        double growthRate = 0.05;     // 5% growth rate per period
        int periods = 10;             // Forecast for 10 periods

        System.out.println("--- Financial Forecasting Tool ---");
        System.out.println("Present Value: $" + presentValue);
        System.out.println("Growth Rate: " + (growthRate * 100) + "% per period");
        System.out.println("Periods: " + periods);

        // Standard Recursive Approach
        double futureValue = forecasting.calculateFutureValue(presentValue, growthRate, periods);
        System.out.printf("\nFuture Value (Standard Recursion): $%.2f\n", futureValue);

        // Optimized Recursive Approach using Memoization
        double futureValueOptimized = forecasting.calculateFutureValueOptimized(presentValue, growthRate, periods);
        System.out.printf("Future Value (Optimized Recursion): $%.2f\n", futureValueOptimized);
    }
}
