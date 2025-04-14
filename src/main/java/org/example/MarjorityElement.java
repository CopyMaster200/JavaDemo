package org.example;

import java.util.HashMap;
import java.util.Map;

public class MarjorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElementFor(arr));
    }

    private static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int count = 0;
            if (map.containsKey(num)) {
                count = map.get(num);
            }
            map.put(num, count + 1);
        }
        System.out.println(map);
        int max = 0, maxNum = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (max < entry.getValue()) {
                max = entry.getValue();
                maxNum = entry.getKey();
            }
        }

        return maxNum;
    }

    public static int majorityElementFor(int[] nums) {
        Integer ans = null;
        int count = 0;

        for (final int num : nums) {
            if (count == 0)
                ans = num;
            count += num == ans ? 1 : -1;
        }

        return ans;
    }
}
