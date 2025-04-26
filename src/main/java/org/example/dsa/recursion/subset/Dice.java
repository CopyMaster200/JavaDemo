package org.example.dsa.recursion.subset;

import java.util.ArrayList;
import java.util.List;

public class Dice {

    private static final int MOD = 1_000_000_007;
    private static Integer[][] memo;

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        dice("", 4, 1, list);
        System.out.println(list);

        int n = 30;
        int target = 500;
        int k = 30;
        memo = new Integer[n + 1][target + 1];
        System.out.println(dp(n, k, target));
    }

    private static void dice(String p, int target, int n, List<String> list) {
        if (target == 0 && p.length() == n) {
            list.add(p);
//            System.out.print(p + " ");
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i, n, list);
        }
    }

    /**
     * Leetcode1155: Number of Dice Rolls With Target Sum
     * @param diceLeft
     * @param faces
     * @param remaining
     * @return
     */
    private static int dp(int diceLeft, int faces, int remaining) {
        if (diceLeft == 0) return remaining == 0 ? 1 : 0;
        if (remaining < 0) return 0;
        if (memo[diceLeft][remaining] != null) return memo[diceLeft][remaining];

        int ways = 0;
        for (int i = 1; i <= faces; i++) {
            ways = (ways + dp(diceLeft - 1, faces, remaining - i)) % MOD;
        }

        memo[diceLeft][remaining] = ways;
        return ways;
    }
}
