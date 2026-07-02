package com.cognizant.mockito.matching;

/**
 * An interface representing a data repository dependency.
 */
public interface DataRepository {
    /**
     * Saves data to the repository.
     *
     * @param id   the identifier
     * @param data the data string to save
     * @return true if saved successfully
     */
    boolean saveData(int id, String data);
}
