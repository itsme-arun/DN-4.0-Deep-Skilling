package com.cognizant.maven;

public class Main {
    public static void main(String[] args) {
        GreetingService service = new GreetingServiceImpl();
        String message = service.greet("Arun");
        System.out.println(message);
    }
}
