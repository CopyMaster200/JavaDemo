package org.example;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        int gcf = findGCF(36, 54);
        System.out.println(gcf);
    }

    private static int findGCF(int num1, int num2) {
        int gcf = 0;
        int limit = Math.min(num1, num2);
        for (int i = 1; i <limit; i++) {
            if(num1 % i ==0 && num2 % i == 0) {
                gcf = i;
            }
        }
        return gcf;
    }
}
