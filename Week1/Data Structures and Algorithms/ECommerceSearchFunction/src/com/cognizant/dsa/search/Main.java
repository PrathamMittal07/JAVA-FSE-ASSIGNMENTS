package com.cognizant.dsa.search;

import java.util.Arrays;

/**
 * Main class to test the search algorithms.
 */
public class Main {
    public static void main(String[] args) {
        
        // Setup some products
        Product[] products = {
            new Product(105, "Wireless Mouse", "Electronics"),
            new Product(101, "Mechanical Keyboard", "Electronics"),
            new Product(109, "Ergonomic Chair", "Furniture"),
            new Product(103, "Desk Lamp", "Lighting"),
            new Product(102, "Coffee Mug", "Kitchen"),
            new Product(107, "Monitor Stand", "Accessories")
        };
        
        System.out.println("--- E-commerce Search Platform ---");
        int targetId = 103;
        
        // Test Linear Search
        System.out.println("\nExecuting Linear Search for Product ID: " + targetId);
        Product foundByLinear = SearchAlgorithms.linearSearch(products, targetId);
        if (foundByLinear != null) {
            System.out.println("Found (Linear): " + foundByLinear);
        } else {
            System.out.println("Product not found using Linear Search.");
        }
        
        // Test Binary Search
        System.out.println("\nExecuting Binary Search for Product ID: " + targetId);
        
        // Binary search requires a sorted array
        Product[] sortedProducts = Arrays.copyOf(products, products.length);
        Arrays.sort(sortedProducts);
        
        System.out.println("Array sorted for binary search.");
        Product foundByBinary = SearchAlgorithms.binarySearch(sortedProducts, targetId);
        if (foundByBinary != null) {
            System.out.println("Found (Binary): " + foundByBinary);
        } else {
            System.out.println("Product not found using Binary Search.");
        }
        
        // Test for a non-existent product
        int notFoundId = 999;
        System.out.println("\nSearching for non-existent Product ID: " + notFoundId);
        System.out.println("Linear Search result: " + SearchAlgorithms.linearSearch(products, notFoundId));
        System.out.println("Binary Search result: " + SearchAlgorithms.binarySearch(sortedProducts, notFoundId));
    }
}
