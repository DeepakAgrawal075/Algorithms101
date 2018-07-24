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
 *
 */
package com.leetcode;

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
}