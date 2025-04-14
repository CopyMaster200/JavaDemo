package org.example.dsa.patterns;

public class Pattern11 {
    public static void main(String[] args) {
        int range = 5; // You can change this to any value (5, 10, etc.)

        for (int row = 0; row < range; row++) {
            // Print spaces for alignment
            for (int space = 0; space < range-row; space++) {
                System.out.print(" ");
            }

            // Print the pattern using binomial coefficients (Pascal's Triangle)
            int number = 1;
            for (int col = 0; col <= row; col++) {
                System.out.print(number+" ");
                number = number * (row - col) / (col + 1);
            }

            System.out.println();
        }
    }
}
