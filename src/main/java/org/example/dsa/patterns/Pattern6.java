package org.example.dsa.patterns;

public class Pattern6 {
    public static void main(String[] args) {
        int range = 3;
        for (int row = 0; row < range * 2; row++) {
            int colCond = row < range ? row : 2 * range - row;
            int spaceCond = range - colCond;

            for (int space = 0; space < spaceCond; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col < colCond; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
