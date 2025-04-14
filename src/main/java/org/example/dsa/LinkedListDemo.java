package org.example.dsa;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("A", "B", "C", "D"));
        linkedList.addFirst("X");
        linkedList.addLast("Y");

        System.out.println(linkedList);

        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println(linkedList);
    }
}
