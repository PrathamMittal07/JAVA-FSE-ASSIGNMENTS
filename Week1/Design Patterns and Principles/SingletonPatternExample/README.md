# Exercise 1: Implementing the Singleton Pattern

## Objective
To understand and implement the Singleton design pattern by creating a logging utility class that has only one instance throughout the application lifecycle. This ensures consistent logging across the entire application without instantiating multiple logger objects.

## Concepts Used
- **Design Patterns:** Singleton Pattern (Creational Pattern)
- **Object-Oriented Programming (OOP) Principles:** Encapsulation
- **Java Basics:** Private constructors, static fields, and static methods
- **Concurrency:** Thread safety using Double-Checked Locking (`synchronized` block)

## Approach
1. Created a `Logger` class with a `private static` instance variable to hold the single object.
2. Made the constructor `private` so that the class cannot be instantiated from outside.
3. Provided a `public static` method `getInstance()` to return the instance. Used double-checked locking to ensure thread safety without degrading performance.
4. Added a `log(String message)` method to simulate logging functionality.
5. Tested the singleton behavior in a `Main` class by creating two references and verifying they point to the exact same memory location.

## Files Included
- `src/com/cognizant/designpatterns/singleton/Logger.java` - The Singleton class implementation.
- `src/com/cognizant/designpatterns/singleton/Main.java` - The test class to demonstrate the singleton usage.

## How to Run
1. Open a terminal/command prompt and navigate to the `SingletonPatternExample` directory.
2. Compile the Java files:
   ```bash
   javac -d bin src/com/cognizant/designpatterns/singleton/*.java
   ```
3. Run the compiled `Main` class:
   ```bash
   java -cp bin com.cognizant.designpatterns.singleton.Main
   ```

## Expected Output
```
[LOG]: Application started.
[LOG]: Connecting to database...
--- Testing Singleton Property ---
SUCCESS: logger1 and logger2 point to the same memory location.
Only ONE instance of Logger was created.
```
