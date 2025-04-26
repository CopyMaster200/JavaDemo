package org.example.dsa.recursion.subset;

import java.util.ArrayList;
import java.util.List;

public class SubSequence {
    public static void main(String[] args) {
        subSeq("", "abc");

        System.out.println("\n" + subSeqToList("", "abc"));

        List<String> list = new ArrayList<>();
        subSeqToList("", "abc", list);
        System.out.println(list);

        List<String> ascii = new ArrayList<>();
        subSeqASCII("", "abc", ascii);
        System.out.println(ascii);
    }

    private static void subSeq(String pro, String unPro) {
        if (unPro.isEmpty()) {
            System.out.print(pro + " ");
            return;
        }

        char ch = unPro.charAt(0);
        subSeq(pro, unPro.substring(1));
        subSeq(pro + ch, unPro.substring(1));
    }

    private static List<String> subSeqToList(String pro, String unPro) {
        List<String> list = new ArrayList<>();
        if (unPro.isEmpty()) {
            list.add(pro);
            return list;
        }

        char ch = unPro.charAt(0);
        list.addAll(subSeqToList(pro, unPro.substring(1)));
        list.addAll(subSeqToList(pro + ch, unPro.substring(1)));
        return list;
    }

    private static void subSeqToList(String pro, String unPro, List<String> list) {
        if (unPro.isEmpty()) {
            list.add(pro);
            return;
        }
        char ch = unPro.charAt(0);
        subSeqToList(pro, unPro.substring(1), list);
        subSeqToList(pro + ch, unPro.substring(1), list);
    }

    private static void subSeqASCII(String pro, String unPro, List<String> list) {
        if (unPro.isEmpty()) {
            list.add(pro);
            return;
        }
        char ch = unPro.charAt(0);
        subSeqASCII(pro, unPro.substring(1), list);
        subSeqASCII(pro + ch, unPro.substring(1), list);
        subSeqASCII(pro + (ch + 0), unPro.substring(1), list);
    }
}
