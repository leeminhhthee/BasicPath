package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AverageCalculatorTest {

    @Test
    public void testAllValuesInRange() {
        AverageCalculator calculator = new AverageCalculator();
        int[] values = {10, 20, 30, 40}; // Tất cả giá trị nằm trong khoảng
        int minimum = 10;
        int maximum = 50;
        int expectedAverage = (10 + 20 + 30 + 40) / 4;
        assertEquals(expectedAverage, calculator.average(values, minimum, maximum));
    }

    @Test
    public void testValuesOutOfRange() {
        AverageCalculator calculator = new AverageCalculator();
        int[] values = {5, 60, 70}; // Giá trị ngoài khoảng
        int minimum = 10;
        int maximum = 50;
        int expectedAverage = -999; // Không có giá trị hợp lệ trong khoảng
        assertEquals(expectedAverage, calculator.average(values, minimum, maximum));
    }

    @Test
    public void testWithSentinelValue() {
        AverageCalculator calculator = new AverageCalculator();
        int[] values = {10, 20, -999, 30, 40}; // Có giá trị sentinel -999
        int minimum = 10;
        int maximum = 50;
        int expectedAverage = (10 + 20) / 2; // Chỉ tính đến -999
        assertEquals(expectedAverage, calculator.average(values, minimum, maximum));
    }

    @Test
    public void testEmptyArray() {
        AverageCalculator calculator = new AverageCalculator();
        int[] values = {}; // Mảng rỗng
        int minimum = 10;
        int maximum = 50;
        int expectedAverage = -999; // Không có giá trị nào
        assertEquals(expectedAverage, calculator.average(values, minimum, maximum));
    }

    @Test
    public void testExceedsInputLimit() {
        AverageCalculator calculator = new AverageCalculator();
        int[] values = new int[101];
        for (int i = 0; i < values.length; i++) {
            values[i] = 20;
        }
        int minimum = 10;
        int maximum = 30;
        int expectedAverage = 20; // Chỉ tính 100 giá trị đầu tiên
        assertEquals(expectedAverage, calculator.average(values, minimum, maximum));
    }
}

