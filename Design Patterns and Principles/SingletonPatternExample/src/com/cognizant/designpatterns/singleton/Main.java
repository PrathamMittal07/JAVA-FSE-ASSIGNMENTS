package com.cognizant.designpatterns.singleton;

/**
 * Test class to verify the Singleton implementation.
 */
public class Main {
    public static void main(String[] args) {
        // Attempt to get multiple instances of the Logger class
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        
        // Log messages using both references
        logger1.log("Application started.");
        logger2.log("Connecting to database...");
        
        // Verify that both references point to the same instance
        System.out.println("--- Testing Singleton Property ---");
        if (logger1 == logger2) {
            System.out.println("SUCCESS: logger1 and logger2 point to the same memory location.");
            System.out.println("Only ONE instance of Logger was created.");
        } else {
            System.out.println("FAILURE: logger1 and logger2 point to different memory locations.");
        }
    }
}
