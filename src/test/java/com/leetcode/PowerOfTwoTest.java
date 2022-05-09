package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PowerOfTwoTest {
    @Test
    void isPowerOfTwoTest() {
        assertTrue(new PowerOfTwo().isPowerOfTwo(0));
        assertTrue(new PowerOfTwo().isPowerOfTwo(64));
        assertFalse(new PowerOfTwo().isPowerOfTwo(218));
    }
}