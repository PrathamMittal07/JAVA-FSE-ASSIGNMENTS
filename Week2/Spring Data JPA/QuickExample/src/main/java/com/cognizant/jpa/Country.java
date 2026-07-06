package com.cognizant.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * JPA Entity representing a Country.
 * @Entity maps this class to the "COUNTRY" database table.
 */
@Entity
@Table(name = "COUNTRY")
public class Country {

    @Id
    private String code;   // Primary key — ISO country code (e.g., "IN")

    private String name;

    // JPA requires a no-argument constructor
    public Country() {}

    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "Country{code='" + code + "', name='" + name + "'}";
    }
}
