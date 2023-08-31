package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumAndDifferenceAndMultiplyAndDivision(double first, double second) {
        return sum(first, second)
                + difference(first, second)
                + multiply(first, second)
                + division(first, second);
    }

    public static double divisionAndDifference(double first, double second) {
        return division(first, second)
                + difference(first, second);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Значения: " + a + " " + b);
        System.out.println("Сумма и умножение: " + sumAndMultiply(10, 20));
        System.out.println("Сумма, разность, умножение и деление: " + sumAndDifferenceAndMultiplyAndDivision(10, 20));
        System.out.println("Разность и деление: " + divisionAndDifference(10, 20));
    }
}