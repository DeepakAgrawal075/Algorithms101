package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class CanJumpTest {
    @Test
    void canJumpTest() {
        assertTrue(new CanJump().canJump(new int[]{2, 3, 1, 1, 4}));
        assertTrue(new CanJump().canJump(new int[]{1, 3, 2, 0, 2}));
        assertFalse(new CanJump().canJump(new int[]{3, 2, 1, 0, 4}));
        assertFalse(new CanJump().canJump(new int[]{1, 2, 1, 0, 2}));
    }
}