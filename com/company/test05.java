package com.company;

import java.util.ArrayList;
import java.util.*;

public class test05 {
    public static void main(String[] args) {
        int[] n={1,2,3,4,5,6};
        int sum=0;
        for(int i=0;i<n.length-2;i++){
            for(int j=i+1;j<n.length-1;j++){
                for(int k=j+1;k<n.length;k++){
                    sum=n[i]+n[j]+n[k]; // sum of three numers
                    System.out.print(sum+" ");
                }
            }
        }
//        for(int i=0;i<n.length-3;i++){
//            for(int j=i+1;j<n.length-2;j++){
//                for(int k=j+1;k<n.length-1;k++){
//                    for(int m=0;m<n.length;m++){
//                    sum=n[i]+n[j]+n[k] +n[m]; // sum of three numers
//                    System.out.print(sum+" ");}
//                }
//            }
//        }

    }
}
