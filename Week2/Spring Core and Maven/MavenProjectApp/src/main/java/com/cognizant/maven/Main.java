package com.cognizant.maven;

import java.util.Optional;

/**
 * Exercise 4: Creating and Configuring a Maven Project
 *
 * This project demonstrates:
 *   1. A properly structured Maven project (src/main/java, pom.xml)
 *   2. Multiple Java classes with proper OOP
 *   3. Maven conventions for groupId, artifactId, version
 *   4. Java 17 compilation via maven-compiler-plugin
 *
 * Library Management System — simple console app.
 */
public class Main {

    public static void main(String[] args) {
        LibraryService library = new LibraryService();

        // Add books to the library
        library.addBook(new Book(1, "Effective Java", "Joshua Bloch"));
        library.addBook(new Book(2, "Clean Code", "Robert C. Martin"));
        library.addBook(new Book(3, "Design Patterns", "Gang of Four"));
        library.addBook(new Book(4, "Spring in Action", "Craig Walls"));

        // Print full catalogue
        library.printCatalogue();

        // Search for a specific book
        int searchId = 2;
        Optional<Book> found = library.findById(searchId);
        found.ifPresentOrElse(
                b -> System.out.println("Found book: " + b),
                () -> System.out.println("Book with ID " + searchId + " not found.")
        );
    }
}
