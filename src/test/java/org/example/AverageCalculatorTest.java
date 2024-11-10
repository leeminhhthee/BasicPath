package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AverageCalculatorTest {
    @Test
    public void testPath1() {
        // Test Case TC1: Path 1 (1 → 2 → 3 → 4 → 5 → 6 → 2 → 7 → 8 → 10)
        AverageCalculator calculator = new AverageCalculator();
        int[] values = {10, 20, -999, 30, 40}; // Các giá trị trong khoảng và sentinel -999
        int minimum = 10;
        int maximum = 50;
        int expectedAverage = 15; // Tính trung bình của 10 và 20
        assertEquals(expectedAverage, calculator.average(values, minimum, maximum));
    }

    @Test
    public void testPath2() {
        // Test Case TC2: Path 2 (1 → 2 → 3 → 4 → 6 → 2 → 7 → 9 → 10)
        AverageCalculator calculator = new AverageCalculator();
        int[] values = {5, 60, 70, -999}; // Giá trị ngoài khoảng và sentinel -999
        int minimum = 10;
        int maximum = 50;
        int expectedAverage = -999; // Không có giá trị hợp lệ
        assertEquals(expectedAverage, calculator.average(values, minimum, maximum));
    }

    @Test
    public void testPath3() {
        // Test Case TC3: Path 3 (1 → 2 → 7 → 9 → 10)
        AverageCalculator calculator = new AverageCalculator();
        int[] values = {}; // Mảng rỗng
        int minimum = 10;
        int maximum = 50;
        int expectedAverage = -999; // Không có giá trị nào
        assertEquals(expectedAverage, calculator.average(values, minimum, maximum));
    }
}

