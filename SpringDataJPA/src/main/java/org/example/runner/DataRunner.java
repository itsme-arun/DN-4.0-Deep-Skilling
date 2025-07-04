package org.example.runner;


import org.example.entity.User;
import org.example.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataRunner implements CommandLineRunner {

    private final UserRepository userRepo;

    public DataRunner(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public void run(String... args) {
        userRepo.save(new User("Arun R", "arun@example.com"));
        userRepo.save(new User("Rajendiran", "rajendiran@example.com"));

        userRepo.findAll().forEach(System.out::println);
    }
}
