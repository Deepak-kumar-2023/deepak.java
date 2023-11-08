package com.company;
import java.util.*;
public class kal {
    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        int  a = in.nextInt();
//        int b = in.nextInt();
//        int  n = in.nextInt();


//        for(int x=0;x<n;x++ ){
//        double j =  Math.pow(2,x);
//            a +=  j * b;
//            System.out.println(a);
//    }
//        int sum = 5^5;
//        System.out.println(sum);
//        double j =  Math.pow(2,2);
//        System.out.println();

    Scanner sc = new Scanner(System.in);
//    int t=in.nextInt();
    int t=sc.nextInt();

       for(int i=0;i<t;i++){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        for(int x=0;x<n;x++ ){
            double j =  Math.pow(2,x);
            a +=  j * b;
            System.out.print(a+" ");
        }
           System.out.println(" ");
//        sc.close();
    }
}}
