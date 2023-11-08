package com.company;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
//        System.out.println("printing 1D array and 2D array");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int[] result = new int[b];
//        int sum=0;
//        for(int n=0;n<b;n++){
//            sum +=n;
//        }
        for(int j=0;j<b;j++ ){
            result[j]=sc.nextInt();  // taking input from the user
        }
//        System.out.println();
       /* for(int u=0;u<10;u++){
            System.out.print(result[u]+" ");
        }*/                   // extra code

        int s=0;// total number of pairs  can be formed using given input
        for(int k=0;k<=b;k++){
            s+=k;
        }
        System.out.println(s);









        int[] result1 =new int[s];
        for(int i=0;i<4;i++){
            for(int j=0;j<4-i;j++){
                result1[j+i] =result[i]*result[i+j+1];
                System.out.print(result1[j+i]+" ");
            }
        }










        for(int u=0;u<10;u++){
            System.out.print(result1[u]+" ");
        }   // extra code
//        int max = result1[0];
//        for (int i = 1; i < result1.length; i++) {
//            if (result1[i] > max) {
//                max= result1[i];
//            }
//        }
        System.out.println(" calculating product of each number stored in result1");
//        System.out.println(max +" max value");
//        System.out.println();
//        for(int u=0;u<10;u++){
//            System.out.print(result1[u]+" ");
//        }
//        System.out.println("");
//            System.out.println(max);
//        int pairs=0;
//        for(int k=0;k<result1.length;k++) {
//            if (max > result1[k]) {
//                pairs +=1;
//            }
//                System.out.print(result1[k]+" ");
//        }
//        System.out.println(pairs);


    }
}







