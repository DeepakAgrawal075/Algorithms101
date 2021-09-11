/**
 * 446. Arithmetic Slices II - Subsequence
 */
package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ArithmeticSlicesII {
    public int numberOfArithmeticSlices(int[] nums) {
        int ans = 0;
        int len = nums.length;
        Map<Integer, Integer>[] map = new Map[len];
        for (int i = 0; i < len; i++) {
            map[i] = new HashMap<>(i);

            for (int j = 0; j < i; j++) {
                long commonDifference = (long) (nums[j]) - nums[i];
                if (commonDifference <= Integer.MIN_VALUE || commonDifference > Integer.MAX_VALUE) continue;

                int APEndingOnJ = map[j].getOrDefault((int) commonDifference, 0);
                int APEndingOnI = map[i].getOrDefault((int) commonDifference, 0);

                ans += APEndingOnJ;
                map[i].put((int) commonDifference, APEndingOnI + APEndingOnJ + 1);
            }
        }
        return ans;
    }
}