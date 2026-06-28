package com.cognizant.mockito.matching;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

/**
 * A test class demonstrating Mockito argument matching.
 */
public class DataServiceTest {

    @Test
    public void testProcessDataWithArgumentMatchers() {
        // 1. Create a mock object
        DataRepository mockRepository = Mockito.mock(DataRepository.class);
        DataService service = new DataService(mockRepository);
        
        // 2. Call the method with specific arguments
        service.processData(101, "  hello world  ");
        
        // 3. Use argument matchers to verify the interaction
        // Verify that saveData was called with the specific ID (eq(101)) 
        // and any string (anyString()) or specific processed string (eq("HELLO WORLD"))
        
        // Verifying with specific value for first argument and any string for second
        verify(mockRepository).saveData(eq(101), anyString());
        
        // Verifying exact processed data is correctly transformed and passed
        verify(mockRepository).saveData(101, "HELLO WORLD");
    }
}
