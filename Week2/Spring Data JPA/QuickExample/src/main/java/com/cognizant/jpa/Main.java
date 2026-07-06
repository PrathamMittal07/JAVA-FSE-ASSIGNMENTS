package com.cognizant.jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Spring Data JPA – Quick Example
 *
 * Demonstrates the full Spring Data JPA workflow:
 *   1. Define a JPA Entity (Country.java)
 *   2. Create a Repository interface (CountryRepository.java)
 *   3. Spring Data JPA auto-generates CRUD implementations
 *   4. Use H2 in-memory database (no external DB setup needed)
 *
 * How to run: mvn spring-boot:run
 */
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    /**
     * CommandLineRunner runs after the application context is loaded.
     * Demonstrates saving and retrieving Country records.
     */
    @Bean
    public CommandLineRunner demo(CountryRepository repository) {
        return (args) -> {
            System.out.println("=== Spring Data JPA Quick Example ===");

            // Save countries to H2 in-memory DB using repository.save()
            repository.save(new Country("IN", "India"));
            repository.save(new Country("US", "United States"));
            repository.save(new Country("UK", "United Kingdom"));

            // Retrieve all countries using repository.findAll()
            System.out.println("\nAll countries in the database:");
            repository.findAll().forEach(System.out::println);

            // Find by ID (country code) using repository.findById()
            System.out.println("\nFind country with code 'IN':");
            repository.findById("IN").ifPresent(System.out::println);

            System.out.println("\nTotal countries: " + repository.count());
        };
    }
}
