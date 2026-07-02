# Exercise 7: Financial Forecasting

## Objective
To understand recursive algorithms by developing a financial forecasting tool that predicts future values based on past data using a recursive approach, and to optimize it using memoization.

## Concepts Used
- **Data Structures:** Maps / Dictionaries (for Memoization)
- **Algorithms:** Recursion, Dynamic Programming (Memoization)
- **Java Basics:** Methods, Conditionals

## Recursive Algorithms
Recursion is a programming technique where a method calls itself to solve a smaller instance of the same problem. It simplifies complex problems by breaking them down into manageable sub-problems. A recursive algorithm must always have a **base case** to terminate the recursive calls and prevent infinite loops (e.g., when periods reach 0).

## Approach
1. **Setup:** Created a `FinancialForecasting` class.
2. **Standard Recursion:** Implemented `calculateFutureValue` that computes the future value recursively using the formula: `FV(n) = FV(n-1) * (1 + growthRate)`. 
   - Base case: `n <= 0`, return `presentValue`.
3. **Optimized Recursion:** Implemented `calculateFutureValueOptimized` that introduces **Memoization**. We use a `HashMap` to store previously computed future values for specific periods. Before computing for a period, it checks if the value is already in the map, avoiding redundant calculations.
4. **Testing:** Created a `Main` class to test both methods with an initial investment of $1000, a growth rate of 5%, and a period of 10.

## Analysis
- **Time Complexity (Standard Recursion):** O(n), where n is the number of periods. The method calls itself `n` times. While this is linear, for tree-like recursive calls (e.g., Fibonacci), it can become O(2^n).
- **Time Complexity (Optimized Recursion with Memoization):** O(n). Although the time complexity is similar in this specific linear recursive example, memoization is crucial for optimizing more complex recursive trees to prevent excessive and redundant computation, reducing time complexity from exponential to linear.

## Files Included
- `src/com/cognizant/dsa/forecasting/FinancialForecasting.java`
- `src/com/cognizant/dsa/forecasting/Main.java`

## How to Run
1. Open a terminal/command prompt and navigate to the `FinancialForecasting` directory.
2. Compile the Java files:
   ```bash
   javac -d bin src/com/cognizant/dsa/forecasting/*.java
   ```
3. Run the compiled `Main` class:
   ```bash
   java -cp bin com.cognizant.dsa.forecasting.Main
   ```

## Expected Output
```
--- Financial Forecasting Tool ---
Present Value: $1000.0
Growth Rate: 5.0% per period
Periods: 10

Future Value (Standard Recursion): $1628.89
Future Value (Optimized Recursion): $1628.89
```
