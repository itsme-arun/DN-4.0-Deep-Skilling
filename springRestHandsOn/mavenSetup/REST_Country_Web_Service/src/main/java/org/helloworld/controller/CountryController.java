package org.helloworld.controller;

import org.helloworld.model.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
    @GetMapping("/country")
    public Country getCountry() {
        return new Country("IN", "India");
    }
    @GetMapping("/country/{code}")
    public Country getCountryByCode(@PathVariable String code) {
        if (code.equalsIgnoreCase("IN")) {
            return new Country("IN", "India");
        } else if (code.equalsIgnoreCase("US")) {
            return new Country("US", "United States");
        } else {
            return new Country(code.toUpperCase(), "Unknown Country");
        }
    }
}
