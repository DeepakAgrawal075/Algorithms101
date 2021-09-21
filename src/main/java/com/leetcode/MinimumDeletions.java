/**
 * 1647. Minimum Deletions to Make Character Frequencies Unique
 */
package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class MinimumDeletions {
    public int minDeletions(String s) {
        int[] charCount = new int[26];
        for (char ch : s.toCharArray()) {
            charCount[ch - 'a']++;
        }

        Set<Integer> set = new HashSet<>();
        int deletion = 0;
        for (int count : charCount) {
            while (count != 0 && set.contains(count)) {
                count--;
                deletion++;
            }
            set.add(count);
        }
        return deletion;
    }
}
