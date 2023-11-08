package com.company;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int[] result = new int[b];

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
                result1[] = result[i] * result[i + j + 1];
                System.out.print(result1[j + i] + " ");
            }

        }
//        System.out.println();
//        for (int u = 0; u < 10; u++)
//            System.out.print(result1[u] + " ");
        }
    }



