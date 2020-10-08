package com.mechanitis.demo.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void shouldAddIntegers() {
        // given
        Calculator calc = new Calculator();

        // when
        int result = calc.add(2, 3);

        // then
        assertEquals(5, result);
    }

    @Test
    void shouldMultiplyIntegers() {
        // given
        Calculator calc = new Calculator();

        // when
        int result = calc.multiply(2, 3);

        // then
        assertEquals(6, result);
    }
}
