# Exercise 2: E-commerce Platform Search Function

## Objective
To understand and implement search algorithms (Linear Search and Binary Search) and analyze their time complexities using Big O notation in the context of an e-commerce platform.

## Concepts Used
- **Data Structures:** Arrays, Custom Objects
- **Algorithms:** Linear Search, Binary Search
- **Asymptotic Notation (Big O):** A mathematical notation used to describe the limiting behavior of a function when the argument tends towards a particular value or infinity. It helps in analyzing the time complexity (worst-case scenario) and space complexity of an algorithm.
- **Comparisons & Sorting:** Implementing `Comparable` interface, `Arrays.sort()`

## Big O Notation and Search Scenarios
Big O notation helps analyze how the runtime or space requirements of an algorithm grow as the input size grows.
- **Best Case:** The target element is found at the first position checked.
- **Average Case:** The target element is found somewhere in the middle.
- **Worst Case:** The target element is at the very end or not present at all.

## Approach
1. **Setup:** Created a `Product` class implementing `Comparable` with attributes `productId`, `productName`, and `category`.
2. **Linear Search:** Implemented `linearSearch` which iterates through the array one by one.
   - *Time Complexity:* O(n) worst/average case, O(1) best case.
3. **Binary Search:** Implemented `binarySearch` which uses a divide-and-conquer approach. It repeatedly divides the search interval in half.
   - *Time Complexity:* O(log n) worst/average case, O(1) best case.
   - *Requirement:* The array **must** be sorted before performing binary search.
4. **Testing:** Created a `Main` class to setup products, execute both searches for a target product ID, and display the results.

## Analysis: Linear vs Binary Search
- **Linear Search** is simpler and does not require the data to be sorted. However, its O(n) time complexity makes it slow for very large datasets.
- **Binary Search** is much faster with a time complexity of O(log n), but it requires the data to be sorted first. Sorting itself takes O(n log n) time.
- **Suitability:** For an e-commerce platform with a massive product catalog where searches are frequent, **Binary Search** (or hash-based structures) is far more suitable due to its high efficiency on sorted datasets.

## Files Included
- `src/com/cognizant/dsa/search/Product.java`
- `src/com/cognizant/dsa/search/SearchAlgorithms.java`
- `src/com/cognizant/dsa/search/Main.java`

## How to Run
1. Open a terminal/command prompt and navigate to the `ECommerceSearchFunction` directory.
2. Compile the Java files:
   ```bash
   javac -d bin src/com/cognizant/dsa/search/*.java
   ```
3. Run the compiled `Main` class:
   ```bash
   java -cp bin com.cognizant.dsa.search.Main
   ```

## Expected Output
```
--- E-commerce Search Platform ---

Executing Linear Search for Product ID: 103
Found (Linear): Product [ID=103, Name=Desk Lamp, Category=Lighting]

Executing Binary Search for Product ID: 103
Array sorted for binary search.
Found (Binary): Product [ID=103, Name=Desk Lamp, Category=Lighting]

Searching for non-existent Product ID: 999
Linear Search result: null
Binary Search result: null
```
