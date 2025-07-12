package org.helloworld.controller;

import org.helloworld.model.Country;
import org.helloworld.repository.CountryRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/country")
public class CountryController {

    private final CountryRepository repo;

    public CountryController(CountryRepository repo) {
        this.repo = repo;
    }
    @GetMapping
    public Country getDefaultCountry() {
        return repo.findByCode("IN");
    }
    @GetMapping("/{code}")
    public ResponseEntity<Country> getByCode(@PathVariable String code) {
        Country c = repo.findByCode(code);
        return (c != null) ? ResponseEntity.ok(c)
                : ResponseEntity.notFound().build();
    }
}
