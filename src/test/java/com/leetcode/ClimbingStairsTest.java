package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClimbingStairsTest {
    @Test
    void givenStairCaseReturnClimbWays() {
        assertEquals(2, ClimbingStairs.climbStairs(2));
        assertEquals(3, ClimbingStairs.climbStairs(3));
    }
}