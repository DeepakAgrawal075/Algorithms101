package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LengthOfLCISTest {
    @Test
    void givenArrayReturnLengthOfLCIS() {
        int[] inputArrayOne = {1, 3, 5, 4, 7};
        int[] inputArrayTwo = {2, 2, 2, 2, 2};

        assertEquals(3, LengthOfLCIS.findLengthOfLCIS(inputArrayOne));
        assertEquals(1, LengthOfLCIS.findLengthOfLCIS(inputArrayTwo));
    }
}