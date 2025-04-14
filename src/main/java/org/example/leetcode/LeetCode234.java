package org.example.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode234 {
    public static void main(String[] args) {
//        ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1, null))));
        ListNode head = new ListNode(1, new ListNode(0, new ListNode(1, null)));
        System.out.println(isPalindrome(head));
    }

    public static boolean isPalindrome(ListNode head) {
        Deque<Integer> stack = new ArrayDeque<>();
        while (head != null) {
            if (!stack.isEmpty() && stack.peek() == head.val) {
                stack.pop();
            } else {
                stack.push(head.val);
            }
            head = head.next;
            System.out.println("### " + stack);
        }

        return stack.isEmpty();
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}