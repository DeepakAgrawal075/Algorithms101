/**
 * 1962. Remove Stones to Minimize the Total
 */
package com.leetcode;

import java.util.PriorityQueue;

public class MinStoneSum {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> b - a);
        for (int num : piles) {
            heap.add(num);
        }
        for (int i = 0; i < k; i++) {
            int current = heap.remove();
            int remove = current / 2;
            heap.add(current - remove);
        }
        int answer = 0;
        for (int number : heap) {
            answer += number;
        }
        return answer;
    }
}