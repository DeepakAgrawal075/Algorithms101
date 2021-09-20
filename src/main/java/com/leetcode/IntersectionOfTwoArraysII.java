/**
 * 350. Intersection of Two Arrays II
 */
package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] freq1 = getFreq(nums1);
        int[] freq2 = getFreq(nums2);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < freq1.length; i++) {
            int count = Math.min(freq1[i], freq2[i]);
            while (count-- > 0) {
                list.add(i);
            }
        }
        return givenListReturnArray(list);
    }

    private int[] getFreq(int[] nums) {
        int[] freq = new int[1001]; // As 0 <= nums1[i], nums2[i] <= 1000
        for (int el : nums) {
            freq[el]++;
        }
        return freq;
    }

    public int[] intersectII(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        List<Integer> list = new ArrayList<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return givenListReturnArray(list);
    }

    private int[] givenListReturnArray(List<Integer> list) {
        int[] result = new int[list.size()];
        int k = 0;
        for (int num : list) {
            result[k++] = num;
        }
        return result;
    }
}
