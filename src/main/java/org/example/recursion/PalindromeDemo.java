package org.example.recursion;

public class PalindromeDemo {

    public static void main(String[] args) {
        palindrome("abcba");
    }

    public static void palindrome(String a) {
        String b = "", str = a;

        for(int ptr=a.length()-1;ptr>=0;ptr--){
            b=b+a.charAt(ptr);
        }
        System.out.println(b);

        if(b.equals(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
