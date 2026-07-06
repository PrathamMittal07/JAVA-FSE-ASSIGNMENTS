package com.cognizant.maven;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Book in the Library.
 */
public class Book {

    private int id;
    private String title;
    private String author;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    @Override
    public String toString() {
        return String.format("[%d] %-35s by %s", id, title, author);
    }
}
