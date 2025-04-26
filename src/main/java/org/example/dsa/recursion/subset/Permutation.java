package org.example.dsa.recursion.subset;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(perm("", "abc", list));
        System.out.println(list);

        System.out.println(permCount("","abc"));
    }

    private static int perm(String pro, String unPro, List<String> list) {
        if (unPro.isEmpty()) {
//            System.out.println(pro);
            list.add(pro);
            return 1;
        }

        char ch = unPro.charAt(0);
        int count = 0;

        for (int i = 0; i <= pro.length(); i++) {
            String first = pro.substring(0, i);
            String second = pro.substring(i);
            count += perm(first + ch + second, unPro.substring(1), list);
        }
        return count;
    }

    private static int permCount(String pro, String unPro) {
        if (unPro.isEmpty()) {
            return 1;
        }

        char ch = unPro.charAt(0);
        int count = 0;
        for (int i = 0; i <= pro.length(); i++) {
            String first = pro.substring(0, i);
            String second = pro.substring(i);
            count += permCount(first + ch + second, unPro.substring(1));
        }
        return count;
    }
}
