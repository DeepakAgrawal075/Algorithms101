package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumIITest {
    @Test
    void twoSumTest() {
        assertArrayEquals(new int[]{1, 2}, new TwoSumII().twoSum(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{1, 3}, new TwoSumII().twoSum(new int[]{2, 3, 4}, 6));
        assertArrayEquals(new int[]{1, 2}, new TwoSumII().twoSum(new int[]{-1, 0}, -1));
        assertArrayEquals(new int[]{1, 2}, new TwoSumII().twoSumII(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{1, 3}, new TwoSumII().twoSumII(new int[]{2, 3, 4}, 6));
        assertArrayEquals(new int[]{1, 2}, new TwoSumII().twoSumII(new int[]{-1, 0}, -1));
    }
}