package org.example.dsa.patterns;

public class Pattern7 {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(count++ + "\t");
            }
            System.out.println();
        }
    }
}
