/**
 * 1239. Maximum Length of a Concatenated String with Unique Characters
 */
package com.leetcode;

import java.util.List;

public class MaxLengthII {
    public int maxLength(List<String> input) {
        int[] result = new int[1];
        maxUnique(input, 0, "", result);
        return result[0];
    }

    private void maxUnique(List<String> input, int index, String current, int[] result) {
        if (index == input.size() && uniqueCharCount(current) > result[0]) {
            result[0] = current.length();
            return;
        }
        if (index == input.size()) {
            return;
        }
        maxUnique(input, index + 1, current, result);
        maxUnique(input, index + 1, current + input.get(index), result);
    }

    private int uniqueCharCount(String current) {
        int[] counts = new int[26];
        for (char c : current.toCharArray()) {
            if (counts[c - 'a']++ > 0) {
                return -1;
            }
        }
        return current.length();
    }
}
