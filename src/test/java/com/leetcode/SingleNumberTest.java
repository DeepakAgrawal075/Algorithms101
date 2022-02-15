package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingleNumberTest {

    @Test
    void givenArrayReturnSingleNumber() {
        assertEquals(1, SingleNumber.singleNumberI(new int[]{2, 2, 1}));
        assertEquals(4, SingleNumber.singleNumberI(new int[]{4, 1, 2, 1, 2}));
        assertEquals(1, SingleNumber.singleNumberI(new int[]{1}));
    }
}