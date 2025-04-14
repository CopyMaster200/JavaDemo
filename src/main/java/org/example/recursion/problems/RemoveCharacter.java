package org.example.recursion.problems;

public class RemoveCharacter {
    public static void main(String[] args) {
        String str = "bcapplecad", res = "";
        char target = 'a';
        String skipWord = "apple";
        System.out.println("Result using result string: " + remove(str, res, target));
        System.out.println("Result using only source string: " + remove(str, target));
        System.out.println("skip " + skipWord + " from string " + str + ": " + skipAword(str, skipWord));
        System.out.println("skip " + skipWord + " from string " + str + ": " + skipAppNotApple(str, skipWord));
    }

    private static String remove(String str, String res, char target) {
        if (str.isEmpty())
            return res;

        if (str.charAt(0) != target) {
            res += str.charAt(0);
        }
        return remove(str.substring(1), res, target);
    }

    private static String remove(String str, char target) {
        if (str.isEmpty())
            return "";

        if (str.charAt(0) != target) {
            return str.charAt(0) + remove(str.substring(1), target);
        }
        return remove(str.substring(1), target);
    }

    private static String skipAword(String str, String target) {
        if (str.isEmpty())
            return "";

        if (str.startsWith(target)) {
            return skipAword(str.substring(target.length()), target);
        }
        return str.charAt(0) + skipAword(str.substring(1), target);
    }

    private static String skipAppNotApple(String str, String target) {
        if (str.isEmpty())
            return "";

        if (str.startsWith(target) && !str.startsWith("apple")) {
            return skipAppNotApple(str.substring(target.length()), target);
        }
        return str.charAt(0) + skipAppNotApple(str.substring(1), target);
    }
}
