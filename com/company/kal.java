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
//different type of for loop
//        String SC[] ={"deepak","sameer","nishant"};
//        for(String ac :SC){
//            System.out.print(ac+" ");
//        }



        //StringBuilder making a new String
      /*  StringBuilder sb = new StringBuilder();
        sb.append(1);
        sb.append(0);
        sb.append(0);

        String result =sb.toString();
        System.out.println(result);*/


        //printing Stars
//        for(int i=0;i<7;i++){
//            for(int a=i;a<=10-a;a++){System.out.print(" ");}
//            for(int n=0;n<i;n++){System.out.print("* ");}
//            System.out.println(" ");
//        }
}}
