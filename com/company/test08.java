package com.company;

import java.util.Scanner;

public class test08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1D array advanced");

        int game = sc.nextInt();
        for (int i = 0; i < game; i++) {
            int unit = sc.nextInt();
            int leap = sc.nextInt();
            int[] binary = new int[unit];
            for (int j = 0; j < unit; j++) {binary[j] = sc.nextInt();}


            // first condition sare element zero hai ki nahi
            for (int k = 0; k < unit; k++) {
                //condition 1st
                int count = binary[0];
                for (int m = 0; m < unit; m++) {count = count + binary[m];}
                if (count == 0) {System.out.println("yes1");break;}


                //condition 2nd



                }

            }

        }

    }



