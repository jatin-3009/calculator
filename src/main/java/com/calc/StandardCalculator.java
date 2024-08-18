package com.calc;

public class StandardCalculator {
    protected double result;

    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }

    // For two ints
    public final void add(int num1, int num2) {
        add((double) num1, (double) num2);
    }

    public final void subtract(int num1, int num2) {
        subtract((double) num1, (double) num2);
    }

    public final void multiply(int num1, int num2) {
        multiply((double) num1, (double) num2);
    }

    public final void divide(int num1, int num2) {
        divide((double) num1, (double) num2);
    }

    // For two doubles
    public final void add(double num1, double num2) {
        double result = num1 + num2;

        if (result == Double.MAX_VALUE || result == Double.POSITIVE_INFINITY) {
            throw new ArithmeticException("Double overflow");
        }

        this.result = result;
    }

    public final void subtract(double num1, double num2) {
        double result = num1 - num2;

        if (result == -Double.MAX_VALUE || result == Double.NEGATIVE_INFINITY) {
            throw new ArithmeticException("Double overflow");
        }

        this.result = result;
    }

    public final void multiply(double num1, double num2) {
        result = num1 * num2;
    }

    public final void divide(double num1, double num2) {
        result = num1 / num2;
    }

    public double getResult() {
        return result;
    }

    public void clearResult() {
        result = 0.0d;
    }

    public void printResult() {
        System.out.println("Standard Calculator Result: " + result);
    }
}
