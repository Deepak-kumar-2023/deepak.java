package com.company;

public class reversingTheString {
    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }  public static String reverseString(String str) {
        // Create a StringBuilder and append the characters of the original string in reverse order
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        // Convert the StringBuilder back to a String
        return reversed.toString();
    }
}

