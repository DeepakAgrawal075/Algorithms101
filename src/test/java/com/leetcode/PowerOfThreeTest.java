package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfThreeTest {
    @Test
    void isPowerOfThreeTest(){
        assertTrue(new PowerOfThree().isPowerOfThree(27));
        assertFalse(new PowerOfThree().isPowerOfThree(0));
        assertFalse(new PowerOfThree().isPowerOfThree(45));
    }
}