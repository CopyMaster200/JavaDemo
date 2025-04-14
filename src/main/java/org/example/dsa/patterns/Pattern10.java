package org.example.dsa.patterns;

public class Pattern10 {
    public static void main(String[] args) {
        int range = 3;

        for (int row = 1; row <= 2 * range; row++) {
            int colCond = row > range ? 2 * range - row : row;

            for (int space = 0; space < range - colCond; space++) {
                System.out.print("  ");
            }

            for (int col = colCond; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= colCond; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
