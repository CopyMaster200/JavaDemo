package org.example.leetcode;

import java.util.*;

/**
 * 1773. Count Items Matching a Rule
 * You are given an array items, where each items[i] = [typei, colori, namei]
 * describes the type, color, and name of the ith item.
 * You are also given a rule represented by two strings, ruleKey and ruleValue.
 * The ith item is said to match the rule if one of the following is true:
 * ruleKey == "type" and ruleValue == typei.
 * ruleKey == "color" and ruleValue == colori.
 * ruleKey == "name" and ruleValue == namei.
 * Return the number of items that match the given rule.
 * Example 1:
 * Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
 * Output: 1
 * Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
 */

public class LeetCode1773 {
    public static Map<String, Integer> map = new HashMap<>();

    static {
        map.put("type", 0);
        map.put("color", 1);
        map.put("name", 2);
    }

    public static void main(String[] args) {
        String[][] items = {{"phone", "blue", "pixel"},
                {"computer", "silver", "lenovo"},
                {"phone", "gold", "iphone"}};
        List<List<String>> list = new ArrayList<>();

        for (String[] row : items) {
            list.add(new ArrayList<>(Arrays.asList(row)));
        }
        String ruleKey = "color", ruleValue = "silver";
        System.out.println(countMatches(list, ruleKey, ruleValue));
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        for (List<String> item: items) {
            if (item.get(map.get(ruleKey)).equalsIgnoreCase(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
