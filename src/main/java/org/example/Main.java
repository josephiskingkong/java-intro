package org.example;

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

    public static String solveQuadraticEquation(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return "Корни уравнения: " + root1 + " и " + root2;
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            return "Один корень: " + root;
        } else {
            return "Нет вещественных корней.";
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

        double a = 1, b = -3, c = 2;
        System.out.println(solveQuadraticEquation(a, b, c));

        double seriesSum = calculateSumOfSeries();
        System.out.println("Сумма ряда: " + seriesSum);
    }
}