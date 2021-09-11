package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BasicCalculatorTest {
    @Test
    void calculateTest() {
        assertEquals(2, new BasicCalculator().calculate("1 + 1"));
        assertEquals(3, new BasicCalculator().calculate(" 2-1 + 2 "));
        assertEquals(23, new BasicCalculator().calculate("(1+(4+5+2)-3)+(6+8)"));
    }
}