package org.example.dsa.recursion.subset;

import java.util.stream.Collectors;

public class SubSetPractice {
    public static void main(String[] args) {
        String str = "baccad";
        char target = 'a';
        System.out.println(removeTargetUsingStream(str, target));
        System.out.println(removeTarget(str, target));
        System.out.println(removeTargetRecursion(str, target, 0));
    }

    private static String removeTargetUsingStream(String str, char target) {
        return str.chars().mapToObj(c -> (char) c)
                .filter(c -> c != target)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    private static String removeTarget(String str, char target) {
        StringBuilder sb = new StringBuilder();
        for (Character ch : str.toCharArray()) {
            if (ch != target) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    private static String removeTargetRecursion(String str, char target, int index) {
        if (index == str.length()) return "";
        if (str.charAt(index) != target) {
            return str.charAt(index) + removeTargetRecursion(str, target, index + 1);
        } else {
            return removeTargetRecursion(str, target, index + 1);
        }
    }
}
