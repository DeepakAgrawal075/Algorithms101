/**
 * 496 : Next Greater Element I
 */
package com.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> elNextGreaterEl = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int num : nums2) {
            while (!stack.empty() && stack.peek() < num) {
                elNextGreaterEl.put(stack.pop(), num);
            }
            stack.push(num);
        }
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = elNextGreaterEl.getOrDefault(nums1[i], -1);
        }
        return nums1;
    }
}
