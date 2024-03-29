/**
 * 797. All Paths From Source to Target
 */
package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AllPathsSourceTarget {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        int startIndex = 0;
        int endIndex = graph.length - 1;
        Queue<List<Integer>> qu = new LinkedList<>();
        qu.add(Arrays.asList(startIndex));

        while (!qu.isEmpty()) {
            int size = qu.size();
            while (size-- > 0) {
                List<Integer> headList = qu.poll();
                if (headList.get(headList.size() - 1) == endIndex) {
                    ans.add(headList);
                }
                int lastNode = headList.get(headList.size() - 1);
                for (int connection : graph[lastNode]) {
                    List<Integer> copyList = new ArrayList<>(headList);
                    copyList.add(connection);
                    qu.add(copyList);
                }
            }
        }
        return ans;
    }
}
