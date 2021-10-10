/**
 * 46. Permutations
 * Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
 */
package com.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        List<List<Integer>> results = permute(new int[]{1, 2, 3});
        for (List<Integer> result : results) {
            System.out.println(result);
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        boolean[] visited = new boolean[nums.length];
        dfs(nums, result, new LinkedList<>(), visited);
        return result;
    }

    private static void dfs(int[] nums, List<List<Integer>> result, LinkedList<Integer> current, boolean[] visited) {
        if (current.size() == nums.length) {
            result.add(new LinkedList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                current.add(nums[i]);
                dfs(nums, result, current, visited);
                current.remove(current.size() - 1);
                visited[i] = false;
            }
        }
    }
}
