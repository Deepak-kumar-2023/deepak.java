package com.company;

import java.io.*;
import java.util.*;

public class kira {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
//        name.length();
//        B.length();
//        System.out.println( B.length());
//        System.out.println( name.length());dhru
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() +B.length());
        if(A.length()>B.length()){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.print(A);
        System.out.println(B);
    }
}



