package org.example.dsa.recursion.subset;

import java.util.HashSet;
import java.util.Set;

public class ICE {

    public static Set<Character> unq = new HashSet<>();

    public static void main(String[] args) {
//        String str = "dabbcabcd";
        String str = "aab";
        for (char ch : str.toCharArray()) {
            unq.add(ch);
        }
        System.out.println(unq);

        int min = str.length();
        Set<Character> check;

        for (int i = 0; i < str.length(); i++) {
            check = new HashSet<>();
            for (int j = i; j < str.length(); j++) {
                check.add(str.charAt(j));
                if (check.size() == unq.size()) {
                    int subStrLen = j - i + 1;
                    if(min > subStrLen) {
                        min = subStrLen;
                    }
                }
            }
        }

        System.out.println(min);
    }

}
