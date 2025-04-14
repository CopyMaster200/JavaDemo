package org.example;

/***
 * 67. Add Binary
 * Given two binary strings a and b, return their sum as a binary string.
 * Example 1:
 * Input: a = "11", b = "1"
 * Output: "100"
 * Example 2:
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 */

public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }

    public static String addBinary(String a, String b) {
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
        char carry = 0;
        char res, temp;

        for (int i = 0; i < a.length(); i++) {
            System.out.println("a " + ch1[i]);
            if (i < ch2.length) {
                System.out.println("b " + ch2[i]);
                res = add(ch1[i], ch2[i], carry);
                temp = carry; // res = 0 carry = 1 temp = 1
            }
        }
        return "";
    }

    private static char add(char a, char b, char carry) {
        if (a == '1') {
            if (b == '1') {
                carry = '1';
                return '0';
            } else {
                carry = '0';
                return '1';
            }
        } else {
            if (b == '1') {
                carry = '0';
                return '1';
            } else {
                carry = '1';
                return '0';
            }
        }
    }
}
