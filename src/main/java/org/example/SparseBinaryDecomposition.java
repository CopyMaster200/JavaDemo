package org.example;

public class SparseBinaryDecomposition {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int number = 1000000000;
        int result = solution2(number);
        System.out.println(result);
        long endTime = System.currentTimeMillis();
        System.out.println("time taken: " + (endTime - startTime));
    }

    public static int solution2(int N) {
        for (int p = 1; p <= N; p++) {
            int q = N - p;
            if (isSparse(p) && isSparse(q)) {
                return p;
            }
        }
        return -1;
    }

    private static boolean isSparse(int num) {
        // A number is sparse if (num & (num >> 1)) == 0
        return (num & (num >> 1)) == 0;
    }

    public static int solution(int N) {
        for (int i = 1; i <= N / 2; i++) {
            if (isSparse(i, (N / 2 - i)) != -1) {
                return i;
            }
        }
        return -1;
    }

    public static int isSparse(int a, int b) {
        String binaryA = Integer.toBinaryString(a);
        String binaryB = Integer.toBinaryString(b);
        return (binaryA.contains("11") || binaryB.contains("11")) ? -1 : a;
    }
}
