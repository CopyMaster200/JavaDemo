package org.example;

public class BinaryFormat {
    public static void main(String[] args) {
        int number = 529;
        String binaryStr = Integer.toBinaryString(number);
        System.out.println("Max gap for " + number + " (" + binaryStr + ") is: " + findMaxGap(number));
    }

    private static int findMaxGap(int number) { // 1010
        String binaryStr = Integer.toBinaryString(number);
        int curGap = 0, maxGap = 0;
        for (int i = 0; i < binaryStr.length(); i++) {
            if (binaryStr.charAt(i) == '1') {
                if (curGap > maxGap)
                    maxGap = curGap;
                curGap = 0;
            } else {
                curGap++;
            }
        }
        return maxGap;
    }

    private static void toBinary(int number) {
        StringBuilder sb = new StringBuilder();
        while (number > 0) {
            sb.insert(0, number % 2);
            number /= 2;
        }
        if (sb.length() == 0) {
            sb.append("0");
        }
        System.out.println(sb);
    }
}
