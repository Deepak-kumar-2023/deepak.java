package com.company;
import java.util.*;
public class java_SubString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
//        String myString = "Hello, World!";
//        char charToFind = 'o';

        // Using indexOf() to find the index of the first occurrence of the character
        int index = S.indexOf(start,end);
        System.out.println(index);
//        if (index != -1) {
//            System.out.println("Index of '" + start + "' in the string is: " + index);
//        } else {
//            System.out.println("Character '" + start + "' not found in the string.");
//        }
    }
}
