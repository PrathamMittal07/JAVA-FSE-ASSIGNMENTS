package com.cognizant.slf4j.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A simple application demonstrating logging error messages and warning levels using SLF4J.
 */
public class LoggingExample {

    // Obtain a logger instance for this class
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        System.out.println("Starting the LoggingExample application...");

        // Log an error message
        logger.error("This is an error message. Something critical went wrong.");

        // Log a warning message
        logger.warn("This is a warning message. Something unexpected happened but the application can recover.");

        System.out.println("Application execution finished.");
    }
}
