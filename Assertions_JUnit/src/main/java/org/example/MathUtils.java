package org.example;

public class MathUtils {
    public int add(int a, int b){
        return a+b;
    }
    public int div(int a, int b){
        return a/b;
    }
    public String greetings(String name){
        return name == null ? null : "Hello " + name;
    }
}
