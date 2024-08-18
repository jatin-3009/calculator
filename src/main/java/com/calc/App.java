package com.calc;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        StandardCalculator calc = new StandardCalculator();

        // passing integer params
        calc.add(1, 2);
        System.out.println(calc.getResult());

        // passing double params
        calc.add(1.5, 2.5);
        System.out.println(calc.getResult());

        try {
            calc.add(Double.MAX_VALUE, 1.0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        calc.printResult();
    }
}