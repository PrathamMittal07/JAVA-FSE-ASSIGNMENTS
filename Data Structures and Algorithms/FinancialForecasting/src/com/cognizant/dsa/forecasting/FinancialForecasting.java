package com.cognizant.dsa.forecasting;

import java.util.HashMap;
import java.util.Map;

/**
 * Class containing methods for financial forecasting.
 */
public class FinancialForecasting {

    // Memoization map to store previously computed future values to avoid excessive computation
    private Map<Integer, Double> memo = new HashMap<>();

    /**
     * Recursive method to calculate the future value of a financial asset.
     * Future Value (n) = Future Value (n-1) * (1 + growthRate)
     * Base case: when periods (n) is 0, the future value is the present value.
     *
     * @param presentValue The initial value (amount)
     * @param growthRate   The growth rate per period (e.g., 0.05 for 5%)
     * @param periods      The number of periods to forecast into the future
     * @return The calculated future value
     */
    public double calculateFutureValue(double presentValue, double growthRate, int periods) {
        // Base Condition
        if (periods <= 0) {
            return presentValue;
        }

        // Recursive Call
        return calculateFutureValue(presentValue, growthRate, periods - 1) * (1 + growthRate);
    }

    /**
     * Optimized recursive method using memoization to avoid redundant computations.
     *
     * @param presentValue The initial value (amount)
     * @param growthRate   The growth rate per period (e.g., 0.05 for 5%)
     * @param periods      The number of periods to forecast into the future
     * @return The calculated future value
     */
    public double calculateFutureValueOptimized(double presentValue, double growthRate, int periods) {
        // Base Condition
        if (periods <= 0) {
            return presentValue;
        }

        // Check if value for this period is already computed
        if (memo.containsKey(periods)) {
            return memo.get(periods);
        }

        // Recursive Call
        double futureValue = calculateFutureValueOptimized(presentValue, growthRate, periods - 1) * (1 + growthRate);
        
        // Store computed value in memo dictionary
        memo.put(periods, futureValue);
        
        return futureValue;
    }
}
