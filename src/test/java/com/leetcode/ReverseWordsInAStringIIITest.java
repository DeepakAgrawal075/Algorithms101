package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseWordsInAStringIIITest {
    @Test
    void reverseWordsTest() {
        assertEquals("s'teL ekat edoCteeL tsetnoc", new ReverseWordsInAStringIII().reverseWords("Let's take LeetCode contest"));
        assertEquals("doG gniD", new ReverseWordsInAStringIII().reverseWords("God Ding"));
    }
}