package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumSubArrayTest {
    @Test
    void givenArrayReturnsMaxSumSubArray() {
        assertEquals(6, MaximumSubArray.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        assertEquals(1, MaximumSubArray.maxSubArray(new int[]{1}));
        assertEquals(23, MaximumSubArray.maxSubArray(new int[]{5, 4, -1, 7, 8}));
        assertEquals(Integer.MIN_VALUE, MaximumSubArray.maxSubArray(new int[]{}));
        assertEquals(-1, MaximumSubArray.maxSubArray(new int[]{-1, -2, -3}));
    }
}