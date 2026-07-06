package com.cognizant.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA Repository for the Country entity.
 *
 * By extending JpaRepository<Country, String>, Spring Data JPA automatically
 * provides implementations for:
 *   - save(), findById(), findAll(), deleteById(), count(), existsById(), etc.
 *
 * The String type parameter is the type of the @Id field (country code).
 */
@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
    // No custom methods needed for this Quick Example
    // Spring Data JPA generates all CRUD implementations at runtime
}
