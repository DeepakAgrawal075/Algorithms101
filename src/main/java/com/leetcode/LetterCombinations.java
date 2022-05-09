/**
 * 17. Letter Combinations of a Phone Number
 *
 * Given a string containing digits from 2-9 inclusive,
 *
 * return all possible letter combinations that the number could represent.
 *
 * Note that 1 does not map to any letters.
 *
 * Example:
 *
 * Input: "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 *
 * Note:
 * Although the above answer is in lexicographical order, your answer could be in any order you want.
 */
package com.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class LetterCombinations {
    static List<String> letterCombinations(String digits) {
        LinkedList<String> result = new LinkedList<>();
        if (digits.isEmpty()) {
            return result;
        }
        String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        result.add("");
        while (result.peek().length() != digits.length()) {
            String head = result.remove();
            String map = mapping[digits.charAt(head.length()) - '0'];
            for (char c : map.toCharArray()) {
                result.addLast(head + c);
            }
        }
        return result;
    }

    List<String> letterCombinationsII(String digits) {
        String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) return result;

        helper(result, digits, mapping, 0, "");
        return result;
    }

    void helper(List<String> result, String digits, String[] mapping, int index, String currString) {
        if (index == digits.length()) {
            result.add(currString);
            return;
        }

        String possibleChars = mapping[digits.charAt(index) - '0'];
        for (char c : possibleChars.toCharArray()) {
            helper(result, digits, mapping, index + 1, currString + c);
        }
    }
}