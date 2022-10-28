/**
 * 523. Continuous Subarray Sum
 */
package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class CheckSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> modIndex = new HashMap<>();
        modIndex.put(0, -1);
        int prefixSum = 0;
        for (int i = 0; i < nums.length; i++) {
            prefixSum = prefixSum + nums[i];
            if (modIndex.containsKey(prefixSum % k)) {
                if (i - modIndex.get(prefixSum % k) > 1) {
                    return true;
                }
            }
            modIndex.putIfAbsent(prefixSum % k, i);
        }
        return false;
    }
}
