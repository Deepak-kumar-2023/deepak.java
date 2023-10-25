package com.company;
import java.util.*;
public class fibonacci {
//    public static void main(String[] args) {
//        System.out.println("introducing fibonacci series");
//        Scanner sc=new Scanner(System.in);

//        public class FibonacciSeries {
            public static void main(String[] args) {
                int n = 10; // Change this to the number of Fibonacci terms you want to generate
                int[] fibonacciSeries = new int[n];

                fibonacciSeries[0] = 0;
                fibonacciSeries[1] = 1;

                for (int i = 2; i < n; i++) {
                    fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
                }

                System.out.println("Fibonacci Series up to " + n + " terms:");
                for (int i = 0; i < n; i++) {
                    System.out.print(fibonacciSeries[i] + " ");
                }
            }
        }




