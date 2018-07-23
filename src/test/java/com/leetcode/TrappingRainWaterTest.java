package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrappingRainWaterTest {
    @Test
    void givenElevationMapReturnRainWaterUnits() {
        int[] elevationMapOne = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] elevationMapTwo = {7, 1, 4, 0, 2, 8, 6, 3, 5};
        int[] elevationMapThree = {9, 1, 4, 0, 2, 8, 6, 3, 5};
        assertEquals(6, TrappingRainWater.trap(elevationMapOne));
        assertEquals(23, TrappingRainWater.trap(elevationMapTwo));
        assertEquals(27, TrappingRainWater.trap(elevationMapThree));
    }
}