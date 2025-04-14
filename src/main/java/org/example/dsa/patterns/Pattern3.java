package org.example.dsa.patterns;

public class Pattern3 {
    public static void main(String[] args) {
        int range = 5;

        for (int row = 0; row < range; row++) {
            for (int col = 0; col < range - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
