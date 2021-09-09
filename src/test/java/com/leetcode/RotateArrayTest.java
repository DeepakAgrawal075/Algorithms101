package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.*;

public class RotateArrayTest {
    @Test
    void rotateTest() {
        RotateArray rotateArray = mock(RotateArray.class);
        doNothing().when(rotateArray).rotate(isA(int[].class), isA(Integer.class));
        rotateArray.rotate(new int[]{}, 0);
        verify(rotateArray, times(1)).rotate(new int[]{}, 0);
    }
}
