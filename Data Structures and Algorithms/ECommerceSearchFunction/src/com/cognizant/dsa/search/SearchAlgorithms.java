package com.cognizant.dsa.search;

/**
 * Utility class containing search algorithms for the E-commerce Platform.
 */
public class SearchAlgorithms {

    /**
     * Performs a linear search to find a Product by its productId.
     * Iterates through the array sequentially.
     * Time Complexity: O(n)
     *
     * @param products Array of Product objects (does not need to be sorted)
     * @param targetId The productId to search for
     * @return The Product if found, otherwise null
     */
    public static Product linearSearch(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.getProductId() == targetId) {
                return product;
            }
        }
        return null;
    }

    /**
     * Performs a binary search to find a Product by its productId.
     * Uses a divide and conquer approach.
     * Time Complexity: O(log n)
     * Note: The input array MUST be sorted by productId before calling this method.
     *
     * @param sortedProducts Array of Product objects sorted by productId
     * @param targetId       The productId to search for
     * @return The Product if found, otherwise null
     */
    public static Product binarySearch(Product[] sortedProducts, int targetId) {
        int left = 0;
        int right = sortedProducts.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midId = sortedProducts[mid].getProductId();

            if (midId == targetId) {
                return sortedProducts[mid];
            }
            if (midId < targetId) {
                left = mid + 1; // target must be in the right half
            } else {
                right = mid - 1; // target must be in the left half
            }
        }
        return null;
    }
}
