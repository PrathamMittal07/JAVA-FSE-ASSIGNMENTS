package com.cognizant.designpatterns.factory;

/**
 * Test class to demonstrate the Factory Method Pattern.
 */
public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- Testing Factory Method Pattern ---\n");
        
        // Create Word Document using WordDocumentFactory
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        System.out.println("Using Word Factory:");
        wordDoc.open();
        wordDoc.save();
        wordDoc.close();
        System.out.println();
        
        // Create PDF Document using PdfDocumentFactory
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        System.out.println("Using PDF Factory:");
        pdfDoc.open();
        pdfDoc.save();
        pdfDoc.close();
        System.out.println();
        
        // Create Excel Document using ExcelDocumentFactory
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        System.out.println("Using Excel Factory:");
        excelDoc.open();
        excelDoc.save();
        excelDoc.close();
        
        System.out.println("\nSUCCESS: All document types were successfully created using their respective factories.");
    }
}
