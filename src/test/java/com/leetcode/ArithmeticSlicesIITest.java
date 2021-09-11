package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArithmeticSlicesIITest {
    @Test
    void numberOfArithmeticSlicesTest() {
        assertEquals(7, new ArithmeticSlicesII().numberOfArithmeticSlices(new int[]{2, 4, 6, 8, 10}));
        assertEquals(16, new ArithmeticSlicesII().numberOfArithmeticSlices(new int[]{7, 7, 7, 7, 7}));
    }
}