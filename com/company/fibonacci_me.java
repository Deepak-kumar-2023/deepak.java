package com.company;
import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;
public class fibonacci_me {
    public static void main(String[] args) {
//        fibonacci series using array concept
//        System.out.println("printing fibonacci Series");
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int array[] =new int[a];
//        array[0]=0;
//        array[1]=1;
//        System.out.println("fobpnacci series upto: "+a+" terms");
//        for(int i=2;i<a;i++){
//            array[i]=array[i-1]+array[i-2];
//            System.out.print(array[i]+" ");


//        printing charecter of a String
        System.out.println("printing char of a string");
        int n=sc.nextInt();
       String a="deepak";
       try {
       for(int i=0;i<n;i++){
       char c =a.charAt(i);
        System.out.print(c+" ");
        }}
       catch (StringIndexOutOfBoundsException e) {
        System.out.println(e);
           }



    }}

