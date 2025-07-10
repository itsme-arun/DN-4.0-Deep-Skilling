package org.example;


import org.example.model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CountryApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        Country country = ctx.getBean("country", Country.class);
        System.out.println(country);

        ((ClassPathXmlApplicationContext) ctx).close();
    }
}
