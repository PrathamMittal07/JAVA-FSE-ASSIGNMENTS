# Exercise 2: Implementing the Factory Method Pattern

## Objective
To understand and implement the Factory Method design pattern by creating a document management system capable of instantiating different types of documents (Word, PDF, Excel) without specifying the exact class of the object that will be created.

## Concepts Used
- **Design Patterns:** Factory Method Pattern (Creational Pattern)
- **Object-Oriented Programming (OOP) Principles:** Abstraction, Polymorphism, Inheritance
- **Java Basics:** Interfaces, abstract classes, method overriding

## Approach
1. Defined a base `Document` interface with operations (`open()`, `save()`, `close()`).
2. Created concrete document classes (`WordDocument`, `PdfDocument`, `ExcelDocument`) implementing the `Document` interface.
3. Created an abstract `DocumentFactory` class containing the abstract factory method `createDocument()`.
4. Implemented concrete factories (`WordDocumentFactory`, `PdfDocumentFactory`, `ExcelDocumentFactory`) that extend `DocumentFactory` and provide their specific implementation for creating documents.
5. Developed a `Main` class to test the pattern by instantiating respective factories and using them to create and interact with documents dynamically.

## Files Included
- `src/com/cognizant/designpatterns/factory/Document.java`
- `src/com/cognizant/designpatterns/factory/WordDocument.java`
- `src/com/cognizant/designpatterns/factory/PdfDocument.java`
- `src/com/cognizant/designpatterns/factory/ExcelDocument.java`
- `src/com/cognizant/designpatterns/factory/DocumentFactory.java`
- `src/com/cognizant/designpatterns/factory/WordDocumentFactory.java`
- `src/com/cognizant/designpatterns/factory/PdfDocumentFactory.java`
- `src/com/cognizant/designpatterns/factory/ExcelDocumentFactory.java`
- `src/com/cognizant/designpatterns/factory/Main.java`

## How to Run
1. Open a terminal/command prompt and navigate to the `FactoryMethodPatternExample` directory.
2. Compile the Java files:
   ```bash
   javac -d bin src/com/cognizant/designpatterns/factory/*.java
   ```
3. Run the compiled `Main` class:
   ```bash
   java -cp bin com.cognizant.designpatterns.factory.Main
   ```

## Expected Output
```
--- Testing Factory Method Pattern ---

Using Word Factory:
Opening Word document...
Saving Word document...
Closing Word document...

Using PDF Factory:
Opening PDF document...
Saving PDF document...
Closing PDF document...

Using Excel Factory:
Opening Excel document...
Saving Excel document...
Closing Excel document...

SUCCESS: All document types were successfully created using their respective factories.
```
