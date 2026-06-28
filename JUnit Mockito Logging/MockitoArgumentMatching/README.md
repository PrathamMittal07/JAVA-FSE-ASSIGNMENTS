# Exercise 3: Argument Matching

## Objective
To verify that a method is called with specific or generic arguments using Mockito's argument matchers.

## Concepts Used
- **Testing Framework:** JUnit 5 (Jupiter)
- **Mocking Framework:** Mockito
- **Argument Matchers:** `anyString()`, `eq()`

## Approach
1. **Project Setup:** Created a standard Maven project structure with dependencies for JUnit 5 and Mockito.
2. **Application Code:** 
   - Created a `DataRepository` interface with a `saveData(int id, String data)` method.
   - Created a `DataService` class that processes data and calls the repository to save it.
3. **Test Class:** Created a `DataServiceTest` class.
4. **Argument Matching Implementation:** 
   - Mocked the `DataRepository`.
   - Called `processData(101, "  hello world  ")` on the service, which internally trims and capitalizes the string before passing it to the repository.
   - Used `verify(mockRepository).saveData(eq(101), anyString())` to ensure the correct ID was passed along with *any* string.
   - Used `verify(mockRepository).saveData(101, "HELLO WORLD")` to ensure the string was processed and passed correctly.

## Files Included
- `pom.xml` - Maven configuration file.
- `src/main/java/com/cognizant/mockito/matching/DataRepository.java` - The repository interface.
- `src/main/java/com/cognizant/mockito/matching/DataService.java` - The class being tested.
- `src/test/java/com/cognizant/mockito/matching/DataServiceTest.java` - The JUnit test class demonstrating argument matching.

## How to Run
1. Open a terminal/command prompt and navigate to the `MockitoArgumentMatching` directory.
2. Execute the following Maven command:
   ```bash
   mvn test
   ```

## Expected Output
Running the tests should result in a successful build since the method was called with the matching arguments:
```
[INFO] Running com.cognizant.mockito.matching.DataServiceTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: ... s
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
```
