package com.cognizant.designpatterns.singleton;

/**
 * Logger class implementing the Singleton Design Pattern.
 * Ensures that only one instance of the Logger exists throughout the application lifecycle.
 */
public class Logger {
    
    // Private static instance of the class
    private static Logger instance;
    
    // Private constructor to prevent instantiation from outside
    private Logger() {
        // Initialization code can go here (e.g., opening a file for logging)
    }
    
    /**
     * Public static method to get the single instance of the Logger class.
     * Uses double-checked locking for thread safety in a multithreaded environment.
     * 
     * @return The single Logger instance
     */
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }
    
    /**
     * Method to simulate logging a message.
     * 
     * @param message The message to log
     */
    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}
