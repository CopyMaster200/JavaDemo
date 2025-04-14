package org.example.dsa.patterns;

public class Pattern8 {
    public static void main(String[] args) {
        int range = 3;

        for (int row = 0; row < range; row++) {
            byte bit = 1;

            if (row % 2 == 1) {
                bit = 0;
            }

            for (int col = 0; col <= row; col++) {
                System.out.print(bit +" ");
                bit ^= 1;
            }
            System.out.println();
        }
    }
}
