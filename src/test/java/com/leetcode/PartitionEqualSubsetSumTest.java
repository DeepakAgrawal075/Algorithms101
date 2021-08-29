package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PartitionEqualSubsetSumTest {
    @Test
    void givenArrayPartitionEqualSubsetSum() {
        assertEquals(true, PartitionEqualSubsetSum.canPartition(new int[]{1, 5, 11, 5}));
        assertEquals(true, PartitionEqualSubsetSum.canPartition(new int[]{1, 5, 0, 4}));
        assertEquals(false, PartitionEqualSubsetSum.canPartition(new int[]{1, 2, 3, 5}));
    }
}