/**
 * 557. Reverse Words in a String III
 * Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 */
package com.leetcode;

public class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder answer = new StringBuilder();
        for (String word : words)
            answer.append(new StringBuffer(word).reverse()).append(" ");
        return answer.toString().trim();
    }
}
