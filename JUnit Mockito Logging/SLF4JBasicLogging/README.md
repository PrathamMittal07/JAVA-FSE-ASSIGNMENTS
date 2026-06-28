# Exercise 1: Logging Error Messages and Warning Levels

## Objective
To configure a Java application with SLF4J and Logback, and demonstrate logging messages at the `ERROR` and `WARN` levels.

## Concepts Used
- **Logging Facade:** SLF4J (Simple Logging Facade for Java)
- **Logging Implementation:** Logback Classic
- **Logging Levels:** `ERROR`, `WARN`

## Approach
1. **Project Setup:** Created a standard Maven project structure.
2. **Dependencies:** Added the `slf4j-api` dependency for the logging facade and the `logback-classic` dependency as the concrete logging implementation in the `pom.xml`.
3. **Application Code:** Created a `LoggingExample` class with a `main` method.
4. **Logging Implementation:** 
   - Initialized a logger instance using `LoggerFactory.getLogger(LoggingExample.class)`.
   - Used `logger.error("...")` to log an error message.
   - Used `logger.warn("...")` to log a warning message.

## Files Included
- `pom.xml` - Maven configuration file with SLF4J and Logback dependencies.
- `src/main/java/com/cognizant/slf4j/basic/LoggingExample.java` - The main Java class demonstrating logging.

## How to Run
1. Open a terminal/command prompt and navigate to the `SLF4JBasicLogging` directory.
2. Execute the following Maven command to compile and run the application:
   ```bash
   mvn clean compile exec:java
   ```

## Expected Output
When running the application, the output should display the log messages prefixed with the timestamp, thread, log level, and logger name (provided by Logback's default configuration):
```
Starting the LoggingExample application...
HH:mm:ss.SSS [main] ERROR com.cognizant.slf4j.basic.LoggingExample - This is an error message. Something critical went wrong.
HH:mm:ss.SSS [main] WARN  com.cognizant.slf4j.basic.LoggingExample - This is a warning message. Something unexpected happened but the application can recover.
Application execution finished.
```
