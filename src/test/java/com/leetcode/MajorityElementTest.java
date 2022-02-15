package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MajorityElementTest {
    @Test
    void majorityElementTest() {
        assertEquals(3, new MajorityElement().majorityElementI(new int[]{3, 2, 3}));
        assertEquals(2, new MajorityElement().majorityElementI(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}