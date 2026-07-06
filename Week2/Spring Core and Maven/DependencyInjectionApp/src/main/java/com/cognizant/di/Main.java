package com.cognizant.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Exercise 2: Implementing Dependency Injection
 *
 * Demonstrates Spring's Dependency Injection using component scanning
 * and constructor-based injection.
 *
 * Spring IoC container:
 *   1. Reads AppConfig → scans com.cognizant.di package
 *   2. Finds @Component on MessageService and MessagePrinter
 *   3. Creates beans and injects MessageService into MessagePrinter
 */
public class Main {

    public static void main(String[] args) {
        // Bootstrap the Spring application context from configuration class
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve MessagePrinter — Spring has already injected MessageService into it
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();
    }
}
