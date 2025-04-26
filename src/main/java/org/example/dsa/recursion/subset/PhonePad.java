package org.example.dsa.recursion.subset;

import java.util.ArrayList;
import java.util.List;

public class PhonePad {

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
//        pad("", "12");

        List<String> result = padList("", "12");
        System.out.println(result);

        List<String> list = new ArrayList<>();
        pad("", "12", list);
        System.out.println(list);


    }

    private static void pad(String pro, String unPro) {
        if (unPro.isEmpty()) {
            System.out.println(pro);
            return;
        }

        int digit = unPro.charAt(0) - '0'; // Which will convert String number to integer number

        for (int i = digit - 1; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            pad(pro + ch, unPro.substring(1));
        }
    }

    private static void pad(String pro, String unPro, List<String> list) {
        if (unPro.isEmpty()) {
            list.add(pro);
            return;
        }
        int digit = unPro.charAt(0) - '0'; // Which will convert String number to integer number
        for (int i = digit - 1; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            pad(pro + ch, unPro.substring(1), list);
        }
    }

    private static List<String> padList(String pro, String unPro) {
        if (unPro.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(pro);
            return list;
        }

        int digit = unPro.charAt(0) - '0'; // Which will convert String number to integer number
        List<String> list = new ArrayList<>();

        for (int i = digit - 1; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            list.addAll(padList(pro + ch, unPro.substring(1)));
        }
        return list;
    }
}
