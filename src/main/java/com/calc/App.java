package com.calc;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        StandardCalculator calc = new StandardCalculator();
        calc.add(1, 2);
        System.out.println(calc.getResult());
    }
}