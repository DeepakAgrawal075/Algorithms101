/**
 * 1662. Check If Two String Arrays are Equivalent
 */
package com.leetcode;

public class ArrayStringsAreEqual {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int string1Pointer = 0, string2Pointer = 0;
        int char1Pointer = 0, char2Pointer = 0;
        while (string1Pointer < word1.length && string2Pointer < word2.length) {
            if (word1[string1Pointer].charAt(char1Pointer++) != word2[string2Pointer].charAt(char2Pointer++)) {
                return false;
            }
            if (char1Pointer == word1[string1Pointer].length()) {
                string1Pointer++;
                char1Pointer = 0;
            }
            if (char2Pointer == word2[string2Pointer].length()) {
                string2Pointer++;
                char2Pointer = 0;
            }
        }
        return string1Pointer == word1.length && string2Pointer == word2.length;
    }
}
