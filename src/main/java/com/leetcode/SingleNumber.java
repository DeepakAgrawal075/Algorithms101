/**
 * 136. Single Number
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * A space complexity of O(1) means that the space required by the algorithm to process data is constant;
 * it does not grow with the size of the data on which the algorithm is operating.
 */
package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static int singleNumberI(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; //XOR
        }
        return result;
    }

    public static int singleNumberII(int[] nums) {
        HashMap<Integer, Integer> numFreq = new HashMap<>();
        for (int num : nums) {
            if (!numFreq.containsKey(num)) {
                numFreq.put(num, 1);
            } else {
                numFreq.put(num, numFreq.get(num) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : numFreq.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (value == 1)
                return key;
        }
        return -1;
    }
}
