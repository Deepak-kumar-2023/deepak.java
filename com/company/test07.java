package com.company;

import java.util.Scanner;

public class test07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] s = {2, 1, 3, 5, 3, 3, 5, 5, 7, 2, 3, 3};
        int count = 1;
        for (int i = 0; i < s.length; i++) {
            for (int j = i + 1; j < s.length; j++) {

                if (s[i] == s[j]) {
                    count++;
                    System.out.print(i + "" + j + " ");
                }
            }
        }
        System.out.println(count);

    }
}


