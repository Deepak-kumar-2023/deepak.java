package com.company;
import java.util.*;
public class palindrom {
    public static void main(String[] args) {
//        String str = "A man, a plan, a canal, Panama";
        Scanner sc= new Scanner(System.in);
        String A = sc.next();

        boolean isPalindrome = isPalindrome(A);
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
    public static boolean isPalindrome(String str) {
        // Remove non-alphanumeric characters and convert to lowercase
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the original string is equal to its reverse
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}


