package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void reverseString() {
        String str = "make install";
        assertEquals("llatsni ekam", Main.reverseString(str));
    }

    @Test
    void isPalindrome() {
        assertTrue(Main.isPalindrome("radar"));
        assertFalse(Main.isPalindrome("hello"));
    }

    @Test
    void solveQuadraticEquation() {
        assertEquals("Корни уравнения: 2.0 и 1.0", Main.solveQuadraticEquation(1, -3, 2));
        assertEquals("Нет вещественных корней.", Main.solveQuadraticEquation(1, 1, 1));
    }

    @Test
    void calculateSumOfSeries() {
        double expectedSum = 0.6111;
        double actualSum = Main.calculateSumOfSeries();
        assertEquals(expectedSum, actualSum, 1e-4);
    }

    @Test
    void fizzBuzzCheck() {
        assertEquals("fizzbuzz", Main.fizzBuzzCheck(35));
        assertEquals("fizz", Main.fizzBuzzCheck(10));
        assertEquals("buzz", Main.fizzBuzzCheck(14));
        assertEquals("8", Main.fizzBuzzCheck(8));
    }
}