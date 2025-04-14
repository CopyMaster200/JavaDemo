package org.example.dsa.patterns;

public class Pattern9 {
    public static void main(String[] args) {
        int range = 5;

        for (int row = 1; row <= range; row++) {
            for (int space = 0; space < range - row; space++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
