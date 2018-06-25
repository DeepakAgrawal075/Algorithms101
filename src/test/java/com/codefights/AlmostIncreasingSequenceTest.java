package com.codefights;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AlmostIncreasingSequenceTest {

    @Test
    void testAlmostIncreasingSequence() {
        int[] inputOne = new int[]{1, 3, 2, 1};
        int[] inputTwo = new int[]{1, 3, 2};
        int[] inputThree = new int[]{1, 2, 1, 2};
        int[] inputFour = new int[]{1, 1, 1, 2, 3};
        int[] inputFive = new int[]{1, 1, 2, 3, 0};

        assertFalse(AlmostIncreasingSequence.almostIncreasingSequence(inputOne));
        assertTrue(AlmostIncreasingSequence.almostIncreasingSequence(inputTwo));
        assertFalse(AlmostIncreasingSequence.almostIncreasingSequence(inputThree));
        assertFalse(AlmostIncreasingSequence.almostIncreasingSequence(inputFour));
        assertFalse(AlmostIncreasingSequence.almostIncreasingSequence(inputFive));
    }
}