package com.company;
import java.util.*;
public class sorting {
    public static void main(String[] args) {
//        System.out.println("bubble sorting");
//        System.out.println("how many numbers");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int[] a = new int[b];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int c;
        for(int n=0;n<a.length;n++){
            for(int j=0;j<a.length-1-n;j++){
                if(a[j]>a[j+1]){
                    c=a[j];
                    a[j]=a[j+1];
                    a[j+1]=c;
                }
            }
        }
        for (int v:a) {
            System.out.print(v+" ");
        }

    }
}
