package org.example.dsa.patterns;

public class Pattern5 {
    public static void main(String[] args) {
        int range = 5;
        for (int row = 0; row < range * 2; row++) {
            int colCondition = row > range ? 2 * range - row : row;
            for (int col = 0; col < colCondition; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
