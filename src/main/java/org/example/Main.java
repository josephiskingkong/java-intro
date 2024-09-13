package org.example;

import javafx.util.Pair;

public class Main {
    public static String fizzBuzzCheck(int n) {
        if (n % 5 == 0 && n % 7 == 0) {
            return "fizzbuzz";
        } else if (n % 5 == 0) {
            return "fizz";
        } else if (n % 7 == 0) {
            return "buzz";
        } else {
            return String.valueOf(n);
        }
    }

    public static String from1To500() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 500; i++) {
            result.append(fizzBuzzCheck(i)).append("\n");
        }
        return result.toString();
    }

    public static String reverseString(String str) {
        StringBuilder res = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            res.append(str.charAt(i));
        }
        return res.toString();
    }

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static Pair<Double, Double> solveQuadraticEquation(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return new Pair<Double, Double>(root1, root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            return new Pair<Double, Double>(root, root);
        } else {
            throw new IllegalArgumentException("Нету корней");
        }
    }

    public static double calculateSumOfSeries() {
        double sum = 0;
        int n = 2;
        double epsilon = 1e-10;
        double term;

        do {
            term = 1.0 / ((n - 1) * (n + 2));
            sum += term;
            n++;
        } while (term > epsilon);

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(from1To500());

        System.out.println(reverseString("make install"));

        String testPalindrome = "radar";
        System.out.println("Палиндром ли строка '" + testPalindrome + "'? " + isPalindrome(testPalindrome));

        // x^2 - 3x + 2 = 0
        double a = 1, b = -3, c = 2;
        Pair<Double, Double> solution = solveQuadraticEquation(a, b, c);
        System.out.println("Корни уравнения: " + solution.getKey() + " и " + solution.getValue());

        double seriesSum = calculateSumOfSeries();
        System.out.println("Сумма ряда: " + seriesSum);
    }
}