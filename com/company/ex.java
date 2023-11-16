package com.company;

import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many numbers are you going to enter");
        int b = sc.nextInt();
        int[] result = new int[b];
        System.out.println("enter those numbers");
        for (int j = 0; j < b; j++) {
            result[j] = sc.nextInt();  // taking input from the user
        }
        int s = 0;// total number of pairs  can be formed using given input
        for (int k = 0; k <= b; k++) {
            s += k; // upgrading the value of s
        }
        System.out.println(s);
        int[] result1 = new int[s];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                if (i == 0) {
                    for (int k = 0; k == j; k++) {
                        result1[k] = result[i] * result[i + j + 1];// sum of two consecutive numbers
                        System.out.println(result1[k]);
                    }
//                } else if (i == 1) {
//                    for (int k = 4; k == j; k++) {
//                        result1[k] = result[i] * result[i + j + 1];
//                    }
//                } else if (i == 2) {
//                    for (int l = 7; l == j; l++) {
//                        result1[l] = result[i] * result[i + j + 1];
//                    }
//                } else if (i == 3) {
//                    for (int m = 9; m == j; m++) {
//                        result1[m] = result[i] * result[i + j + 1];
//                    }
//                }
            }


        }
//        System.out.println();
//        for (int v:result1) {
//            System.out.print(v+" ");}

    }
}}



