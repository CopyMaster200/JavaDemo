package org.example.dsa.recursion.subset;

public class SkipString {
    public static void main(String[] args) {
        String str = "baacapplede";
        System.out.println(skip(str));
        StringBuilder pro = new StringBuilder();
        skip(str, pro);
        System.out.println(pro);

        System.out.println(skipApple(str));

        String appInApple = "appdayanappleapp";
        System.out.println(skipAppNotApple(appInApple));
    }

    private static String skip(String str) {
        if (str.isBlank()) return "";

        if (str.startsWith("apple")) {
            return skip(str.substring(5));
        } else {
            return str.charAt(0) + skip(str.substring(1));
        }
    }

    private static void skip(String unProcessed, StringBuilder processed) {
        if (unProcessed.isEmpty()) return;

        if (unProcessed.startsWith("apple")) {
            skip(unProcessed.substring(5), processed);
        } else {
            processed.append(unProcessed.charAt(0));
            skip(unProcessed.substring(1), processed);
        }
    }

    private static String skipApple(String unProcessed) {
        if (unProcessed.isEmpty()) return "";

        if (unProcessed.startsWith("apple")) {
            return skipApple(unProcessed.substring(5));
        } else {
            return unProcessed.charAt(0) + skipApple(unProcessed.substring(1));
        }
    }

    private static String skipAppNotApple(String unProcessed) {
        if (unProcessed.isEmpty()) return "";

        if (unProcessed.startsWith("app") && !unProcessed.startsWith("apple")) {
            return skipAppNotApple(unProcessed.substring(3));
        } else {
            return unProcessed.charAt(0) + skipAppNotApple(unProcessed.substring(1));
        }
    }
}
