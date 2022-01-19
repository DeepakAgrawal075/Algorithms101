/**
 * 290. Word Pattern
 */
package com.leetcode;

import java.util.HashMap;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(words.length != pattern.length()) return false;

        HashMap<Character, String> patternCharStringWordMap = new HashMap<>();
        HashMap<String, Boolean> isStringWordUsed = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char currentPatternChar = pattern.charAt(i);

            if (!patternCharStringWordMap.containsKey(currentPatternChar)) {
                if (isStringWordUsed.containsKey(words[i])) {
                    return false;
                } else {
                    isStringWordUsed.put(words[i], true);
                    patternCharStringWordMap.put(currentPatternChar, words[i]);
                }
            } else {
                String alreadyMappedWord = patternCharStringWordMap.get(currentPatternChar);
                if (!alreadyMappedWord.equals(words[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
