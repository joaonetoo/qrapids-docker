package com.acme;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {

        System.out.println(new App().getGreeting());
        Example test = new Example(null, "tesa");
        test.getTest2();


    }
}
