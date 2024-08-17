package com.calc;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        StandardCalculator calc = new StandardCalculator();
        calc.add(1, 2); // passing integer params
        System.out.println(calc.getResult());
        calc.add(1.5, 2.5); // passing double params
        System.out.println(calc.getResult());
    }
}