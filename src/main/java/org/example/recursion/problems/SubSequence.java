package org.example.recursion.problems;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        String target = "abc";
        System.out.println("Subset for " + target);
        subSeq(target, "");
        System.out.println("With return type as list: " + subSeqWithList(target, ""));
        System.out.println("With return type as list: " + subSeqAsciiWithList(target, ""));
    }

    private static void subSeq(String src, String res) {
        if (src.isEmpty()) {
            System.out.println(res);
            return;
        }

        char ch = src.charAt(0);

        subSeq(src.substring(1), res + ch);
        subSeq(src.substring(1), res);
    }

    private static ArrayList<String> subSeqWithList(String src, String res) {
        if (src.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            if (!res.isEmpty()) list.add(res);
            return list;
        }

        char ch = src.charAt(0);

        ArrayList<String> left = subSeqWithList(src.substring(1), res + ch);
        ArrayList<String> right = subSeqWithList(src.substring(1), res);

        left.addAll(right);
        return left;
    }

    private static ArrayList<String> subSeqAsciiWithList(String src, String res) {
        if (src.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            if (!res.isEmpty()) list.add(res);
            return list;
        }

        char ch = src.charAt(0);

        ArrayList<String> first = subSeqAsciiWithList(src.substring(1), res + ch);
        ArrayList<String> second = subSeqAsciiWithList(src.substring(1), res);
        ArrayList<String> third = subSeqAsciiWithList(src.substring(1), res + (ch + 0));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
