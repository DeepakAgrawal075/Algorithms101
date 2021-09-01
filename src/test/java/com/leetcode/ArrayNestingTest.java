package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayNestingTest {
    @Test
    void givenArrayReturnLongestLengthSet() {
        assertEquals(4, ArrayNesting.arrayNesting(new int[]{5, 4, 0, 3, 1, 6, 2}));
        assertEquals(1, ArrayNesting.arrayNesting(new int[]{0,1,2}));
    }
}