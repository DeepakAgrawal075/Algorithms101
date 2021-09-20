/**
 * 438. Find All Anagrams in a String
 */
package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || p == null || p.length() == 0 || s.length() < p.length()) return result;

        HashMap<Character, Integer> sourceMap = new HashMap<>();
        HashMap<Character, Integer> patternMap = new HashMap<>();

        for (char c : p.toCharArray()) {
            patternMap.put(c, patternMap.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < p.length(); i++) {
            sourceMap.put(s.charAt(i), sourceMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        int right = p.length();
        while (right < s.length()) {
            if (compare(patternMap, sourceMap)) {
                result.add(right - p.length());
            }

            char acquiredChar = s.charAt(right);
            sourceMap.put(acquiredChar, sourceMap.getOrDefault(acquiredChar, 0) + 1);

            char releasedChar = s.charAt(right - p.length());
            if (sourceMap.get(releasedChar) == 1) {
                sourceMap.remove(releasedChar);
            } else {
                sourceMap.put(releasedChar, sourceMap.get(releasedChar) - 1);
            }
            right++;
        }
        if (compare(patternMap, sourceMap)) {
            result.add(right - p.length());
        }
        return result;
    }

    private boolean compare(HashMap<Character, Integer> patternMap, HashMap<Character, Integer> sourceMap) {
        for (char c : sourceMap.keySet()) {
            if (!Objects.equals(patternMap.getOrDefault(c, 0), sourceMap.get(c))) {
                return false;
            }
        }
        return true;
    }
}