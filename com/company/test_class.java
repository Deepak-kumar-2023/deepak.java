
package com.company;
import java.io.*;
import java.util.*;

public class test_class {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() +B.length());
        if(A.length()<B.length()){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        String firstLetterCapitalized = A.substring(0,1).toUpperCase()+A.substring(1);
        String firstLetterCapitalized1 = B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.print(firstLetterCapitalized+" ");
        System.out.println(firstLetterCapitalized1);
    }
}



