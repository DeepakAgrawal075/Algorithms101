/**
 * 899. Orderly Queue
 * You are given a string s and an integer k. You can choose one of the first k letters of s and append it at the end of the string.
 * Return the lexicographically smallest string you could have after applying the mentioned step any number of moves.
 *
 * The smallest lexicographical order is an order relation where string s is smaller than t,
 * given the first character of s (s1) is smaller than the first character of t (t1),
 * or in case they are equivalent, the second character, and so on.
 */
package com.leetcode;

import java.util.Arrays;

public class OrderlyQueue {
    public String orderlyQueue(String s, int k) {
        if (k == 0) {
            return s;
        } else if (k > 1) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        } else if (k == 1) {
            String ans = s;
            for (int i = 1; i < s.length(); i++) {
                String reorderedStr = s.substring(i) + s.substring(0, i);
                if (ans.compareTo(reorderedStr) > 0) {
                    ans = reorderedStr;
                }
            }
            return ans;
        }
        return s;
    }
}
