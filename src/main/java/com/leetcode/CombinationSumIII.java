/**
 * 216. Combination Sum III
 * 1. The sum of all the elements in each ArrayList in the answer should be equal to n
 * 2. The size of each ArrayList in the answer should be equal to k
 * 3. Each element in the answer should include numbers from 1 to 9
 * 4. Can't duplicate the numbers in each entry in the answer
 * 5. No permutation to be counted. Only combinations
 */
package com.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        Set<List<Integer>> set = new HashSet<>();
        combinationSumIIIHelper(set, k, n, new HashSet<>(), 1);
        return new ArrayList<>(set);
    }

    private void combinationSumIIIHelper(Set<List<Integer>> ans, int noOfElements, int remainingSum, Set<Integer> runningSet, int startVal) {
        if (noOfElements == 0) {
            if (remainingSum == 0) {
                ans.add(new ArrayList<>(runningSet));
            } else {
                return;
            }
        }
        if (remainingSum < 0) {
            return;
        }
        for (int i = startVal; i <= 9; i++) {
            runningSet.add(i);
            combinationSumIIIHelper(ans, noOfElements - 1, remainingSum - i, runningSet, i + 1);
            runningSet.remove(i);
        }
    }
}
