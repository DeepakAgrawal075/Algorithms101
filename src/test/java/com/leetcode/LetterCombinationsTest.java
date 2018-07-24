package com.leetcode;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;

class LetterCombinationsTest {
    @Test
    void letterCombinationsTest() {
        List<String> actual = LetterCombinations.letterCombinations("23");
        List<String> expected = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");

        assertThat(actual, hasSize(expected.size()));
        assertThat(actual, containsInAnyOrder(expected.toArray()));
        assertThat(actual, not(IsEmptyCollection.empty()));
    }
}