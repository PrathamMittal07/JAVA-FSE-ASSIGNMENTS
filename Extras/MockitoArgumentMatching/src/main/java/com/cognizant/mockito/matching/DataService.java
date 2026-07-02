package com.cognizant.mockito.matching;

/**
 * A service that depends on DataRepository.
 */
public class DataService {
    private final DataRepository repository;

    public DataService(DataRepository repository) {
        this.repository = repository;
    }

    /**
     * Processes and saves data.
     *
     * @param id   the identifier
     * @param data the data string to save
     */
    public void processData(int id, String data) {
        // Some business logic could be here
        String processedData = data.trim().toUpperCase();
        
        // Call the repository with specific arguments
        repository.saveData(id, processedData);
    }
}
