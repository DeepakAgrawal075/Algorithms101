package com.leetcode;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;

class ThreeSumTest {
    @Test
    void givenIntegerArrayReturnUniqueTripletsSumToZero() {
        int[] input = new int[]{-1, 0, 1, 2, -1, -4};

        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1, 0, 1), Arrays.asList(-1, -1, 2));
        List<List<Integer>> actual = ThreeSum.threeSum(input);

        assertThat(actual, hasSize(expected.size()));
        assertThat(actual, containsInAnyOrder(expected.toArray()));
        assertThat(actual, not(IsEmptyCollection.empty()));

    }

    @Test
    void givenIntegerArrayWithAllZerosReturnUniqueTripletsSumToZero() {
        int[] input = new int[]{0, 0, 0};

        List<List<Integer>> expected = Arrays.asList(Arrays.asList(0, 0, 0));
        List<List<Integer>> actual = ThreeSum.threeSum(input);

        assertThat(actual, hasSize(expected.size()));
        assertThat(actual, containsInAnyOrder(expected.toArray()));
        assertThat(actual, not(IsEmptyCollection.empty()));
    }
}