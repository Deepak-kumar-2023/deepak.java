package com.company;

import java.util.Scanner;

public class test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] d;
        try {
            d = new int[a];
            d[0] = a;
            for (int i = 1; i < a; i++) {
                int c = a % i;
                d[i] = c;
            }
//            for (int i = 0; i < a; i++) {
//                System.out.print(d[i] + " ");
//            }
            System.out.println();
            if (a == 2 || a == 3) {
                System.out.println("prime");
            }
            for (int g = 2; g < a; g++) {
                if (d[g] == 0) {
                    System.out.print("not prime ");
                    break;
                }
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
