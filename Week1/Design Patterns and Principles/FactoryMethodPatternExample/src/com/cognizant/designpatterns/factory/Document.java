package com.cognizant.designpatterns.factory;

/**
 * Base interface for all Document types.
 */
public interface Document {
    void open();
    void save();
    void close();
}
