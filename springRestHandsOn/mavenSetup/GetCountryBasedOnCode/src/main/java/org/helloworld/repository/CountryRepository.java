package org.helloworld.repository;

import org.helloworld.model.Country;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class CountryRepository {

    private final Map<String, Country> data = Map.of(
            "IN", new Country("IN", "India"),
            "US", new Country("US", "United States"),
            "FR", new Country("FR", "France")
    );

    public Country findByCode(String code) {
        return data.get(code.toUpperCase());
    }
}
