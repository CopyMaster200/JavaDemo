package org.example;

public class StarPattern {
    public static void main(String[] args) {
        int len = 3;
        starPattern5(len);
    }

    /** star pattern1
     *      * * * *
     *      * * * *
     *      * * * *
     *      * * * *
     * */
    private static void starPattern1(int len) {
        for (int row = 1; row <= len; row++) {
            // outer loop for rows in the pattern
            for (int col = 1; col <= len; col++) {
                //inner loop is for logic
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /** star pattern2
     *      *
     *      * *
     *      * * *
     *      * * * *
     * */
    private static void starPattern2(int len) {
        for (int row = 1; row <= len; row++) {
            // outer loop for rows in the pattern
            for (int col = 1; col <= row; col++) {
                //inner loop is for logic
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /** star pattern3
     *      * * * *
     *      * * *
     *      * *
     *      *
     * */
    private static void starPattern3(int len) {
        /*for (int row = len; row > 0; row--) {
            // outer loop for rows in the pattern
            for (int col = 1; col <= row; col++) {
                //inner loop is for logic
                System.out.print("* ");
            }
            System.out.println();
        }*/
        for (int row = 1; row <= len; row++) {
            // outer loop for rows in the pattern
            for (int col = row; col > 0; col--) {
                //inner loop is for logic
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /** star pattern4
     *      *
     *      * *
     *      * * *
     *      * *
     *      *
     * */
    private static void starPattern4(int len) {
        for (int row = 1; row <= 2*len-1; row++) {
            // outer loop for rows in the pattern
            for (int col = 1; col <= row && row <= len; col++) {
                //inner loop is for logic
                System.out.print("* ");
            }
            for (int des = len-(row-len); row > len && des > 0; des--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /** star pattern5
     *      *
     *      * *
     *      * * *
     *      * *
     *      *
     * */
    private static void starPattern5(int n) {
        for (int row = 0; row < 2 * n; row++) {
            // outer loop for rows in the pattern
            int totCol = row > n ? 2 * n - row : row;
            int noOfSpaces = n - totCol;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totCol; col++) {
                //inner loop is for logic
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /** number pattern1
     *      1
     *      1 2
     *      1 2 3
     *      1 2 3 4
     * */
    private static void numberPattern1(int length) {
        for (int row = 1; row <= length; row++) {
            // outer loop for rows in the pattern
            for (int col = 1; col <= row; col++) {
                //inner loop is for logic
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
