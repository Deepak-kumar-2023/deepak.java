package com.company;
import java.util.*;
public class game01 {
    public static void main(String[] args) {
//        System.out.println("please enter a number");
//         Scanner sc = new Scanner(System.in);
//         int n =sc.nextInt();
//         int i;
//         int sum =0;
//         for(i=0;i<n;i++){
//             sum +=i;
//             System.out.println(i);
//         }
//             System.out.println(sum);
////        System.out.println(sum); public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
          int  a = in.nextInt();
          int b = in.nextInt();
          int  n = in.nextInt();
            System.out.println("loop in");
        for(int j=0;j<=n;j++ ){
            a +=  2^j * b;

            System.out.println(a);
        }

        }
            System.out.println("loop out");
    }
}
