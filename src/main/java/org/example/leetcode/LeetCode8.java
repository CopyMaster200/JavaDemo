package org.example.leetcode;

public class LeetCode8 {
    public static void main(String[] args) {
//        System.out.println("myAtoi: " + myAtoi("0-1"));
//        System.out.println("myAtoi: " + myAtoi("words and 987"));
        System.out.println("myAtoi: " + myAtoi("-91283472332"));
    }

    public static int myAtoi(String s) {
        // 1. I have to remove trailing and leading spaces
        s = s.strip();
        if (s.isEmpty()) return 0; // Edge case: empty string

        char[] arr = s.toCharArray();
        int index = 0;
        int sign = 1;

        // sign handling at first index
        if (arr[index] == '-' || arr[index] == '+') {
            sign = (arr[index] == '-') ? -1 : 1;
            index++;
        }
        int result = 0;

        // 3. I have to traverse until a non-numeric character.
        while (index < arr.length && Character.isDigit(arr[index])) {
            int digit = arr[index] - '0';
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            index++;
        }

        return result * sign;
    }
}
