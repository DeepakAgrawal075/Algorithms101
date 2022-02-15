/**
 * 169. Majority Element
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 */
package com.leetcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElementI(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            if (freqMap.containsKey(num)) {
                freqMap.put(num, freqMap.get(num) + 1);
            } else {
                freqMap.put(num, 1);
            }
        }
        int maxValueInMap = Collections.max(freqMap.values());
        int result = 0;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == maxValueInMap) {
                result = entry.getKey();
            }
        }
        return result;
    }
}
