package com.cognizant.maven;


public class GreetingServiceImpl implements GreetingService {

    @Override
    public String greet(String name) {
        return "Hello, " + name + "! Welcome to Cognizant.";
    }
}
