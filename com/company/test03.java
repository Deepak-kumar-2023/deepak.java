package com.company;

public class test03 {
    public static void main(String[] args) {
//        int [][] a =new int[3][3];    //type one 2D array diclairation
//        a [0][0]=5;
//        a [0][1]=4;
//        a [0][2]=5;
//        a [1][0]=6;
//        a [1][1]=8;
//        a [1][2]=9;
//        a [2][0]=10;
//        a [2][2]=2;
//        a [2][2]=1;

//        int[][] b ={{1,2,3,5,6,7},{4,5,6,7,8,9},{7,8,9}}; //type two array declairation
        char [][] n = new char[5][];
        n[0]=new char[4];
        n[1]=new char[1];
        n[2]=new char[4];
        n[3]=new char[1];
        n[4]=new char[4];

        n [0][0]='E';
        n [0][1]='E';
        n [0][2]='E';
        n [0][3]='E';
n[1][0]='E';

        n [2][0]='E';
        n [2][1]='E';
        n [2][2]='E';
        n [2][3]='E';
n[3][0]='E';
        n [4][0]='E';
        n [4][1]='E';
        n [4][2]='E';
        n [4][3]='E';
        for(int i=0;i<n.length;i++){
            for(int j=0;j<n[i].length;j++){
                System.out.print(n[i][j]+" ");
            }
            System.out.println();
        }

    }
}
