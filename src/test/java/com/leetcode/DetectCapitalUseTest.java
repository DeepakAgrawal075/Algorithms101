package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DetectCapitalUseTest {
    @Test
    void detectCapitalUseTest(){
        assertTrue(new DetectCapitalUse().detectCapitalUse("USA"));
        assertTrue(new DetectCapitalUse().detectCapitalUse("leetcode"));
        assertTrue(new DetectCapitalUse().detectCapitalUse("Google"));
        assertFalse(new DetectCapitalUse().detectCapitalUse("FlaG"));
    }
}