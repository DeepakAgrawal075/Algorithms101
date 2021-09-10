package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargestPlusSignTest {
    @Test
    void orderOfLargestPlusSignTest() {
        assertEquals(2, new LargestPlusSign().orderOfLargestPlusSign(5, new int[][]{{4, 2}}));
    }
}