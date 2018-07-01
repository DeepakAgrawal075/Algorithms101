package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoSumTest {

    @Test
    void givenArrayAndTargetReturnIndicesSumToTarget1() {
        int[] inputArray = {2, 7, 11, 15};

        int[] result = TwoSum.twoSum(inputArray, 9);

        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    void givenArrayAndTargetReturnIndicesSumToTarget2() {
        int[] inputArray = {2, 7, 11, 15};

        int[] result = TwoSum.twoSum(inputArray, 26);

        assertEquals(2, result[0]);
        assertEquals(3, result[1]);
    }
}