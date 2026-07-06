package com.cognizant.maven;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Service class for managing the library's book collection.
 * Demonstrates standard Java OOP within a Maven project structure.
 */
public class LibraryService {

    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added: " + book);
    }

    public Optional<Book> findById(int id) {
        return books.stream()
                .filter(b -> b.getId() == id)
                .findFirst();
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public void printCatalogue() {
        System.out.println("\n=== Library Catalogue ===");
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            books.forEach(System.out::println);
        }
        System.out.println("=========================\n");
    }
}
