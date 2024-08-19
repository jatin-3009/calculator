package com.calc;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        StandardCalculator standardCalculator = new StandardCalculator();

        // passing integer params
        standardCalculator.add(1, 2);
        System.out.println(standardCalculator.getResult());

        // passing double params
        standardCalculator.add(1.5, 2.5);
        System.out.println(standardCalculator.getResult());

        try {
            standardCalculator.add(Double.MAX_VALUE, 1.0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        standardCalculator.printResult();

        LogicalCalculator logicalCalculator = new LogicalCalculator();
        logicalCalculator.OR(8, 6);
        standardCalculator.printResult();

    }
}