/**
 * 1239. Maximum Length of a Concatenated String with Unique Characters
 */
package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MaxLength {
    public int maxLength(List<String> input) {
        List<String> ansList = new ArrayList<>();
        int ans = 0;
        ansList.add("");
        for (String currElement : input) {
            if (!checkUniqueCharString(currElement)) continue;
            List<String> newAnsListWithCurrStr = new ArrayList<>();
            for (String candidate : ansList) {
                String temp = candidate + currElement;
                if (checkUniqueCharString(temp)) {
                    newAnsListWithCurrStr.add(temp);
                    ans = Math.max(ans, temp.length());
                }
            }
            ansList.addAll(newAnsListWithCurrStr);
        }
        return ans;
    }

    private boolean checkUniqueCharString(String str) {
        if (str.length() > 26) return false;
        int[] freq = new int[26];
        char[] arr = str.toCharArray();
        for (char ch : arr) {
            freq[ch - 'a']++;
            if (freq[ch - 'a'] > 1) {
                return false;
            }
        }
        return true;
    }
}
