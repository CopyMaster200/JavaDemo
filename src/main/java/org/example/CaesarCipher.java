package org.example;

public class CaesarCipher {
    public static void main(String[] args) {
//        String input = "Hello"; // Hello 4 result: Lipps
        String input = "Caesar Cipher"; // Caesar Cipher 2
        int num = 2;
        String result = shift(input, num);
        System.out.println(result);
    }

    private static String shift(String input, int num) {
        char[] chars = input.toCharArray();
        System.out.println(chars);
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            if ((c > 64 && c < 91) || (c > 96 && c < 123)) {
                c += num;
                if ((c > 90 && c < 97) || c > 122) {
                    c -= 26;
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
