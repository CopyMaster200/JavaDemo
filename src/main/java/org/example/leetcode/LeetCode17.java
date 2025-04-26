package org.example.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class LeetCode17 {
    private static final String[] KEYPAD = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
    };

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        pad("", "23", list);
        System.out.println(list);
    }

    private static void pad(String pro, String unPro, List<String> list) {
        if (unPro.isEmpty()) {
            list.add(pro);
            return;
        }
        String letters = KEYPAD[unPro.charAt(0) - '0']; // Which will get the characters under keypad
        for (char ch : letters.toCharArray()) {
            pad(pro + ch, unPro.substring(1), list);
        }
    }
}
