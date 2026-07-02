package com.cognizant.designpatterns.factory;

/**
 * Abstract factory class for creating Document objects.
 */
public abstract class DocumentFactory {
    
    /**
     * Factory method to be implemented by subclasses.
     * @return A concrete Document object.
     */
    public abstract Document createDocument();
}
