package com.company;

import java.util.Scanner;

public class series {
    public static void main(String[] args) throws Exception{
//        System.out.println("printing fibonachi series");
        Scanner sc = new Scanner(System.in);

int count =0;
        char a = ' ';
        char b = '!';
        char c = '?';
        char d = ',';
        char e = '.';
        char f = '_';
        char g = '@';
     String h = "'";
        String name = "He is a very very good boy, isn't he?";
        System.out.println(name.length());
        for (int i = 0; i < name.length(); i++) {

            if (name.charAt(i) == b) {
                System.out.println();
                i++;
                count=count+1;
            }
               if (name.charAt(i) == h.charAt(0)) {
                   System.out.println();
                  i=i+1;
                   count=count+1;
               }
            if (name.charAt(i) == a) {
                System.out.println();
                i++;
                count= count+1;
            }
               if (name.charAt(i) == c) {
                   System.out.println();
                i++;
                   count=count+1;
               }
               if (name.charAt(i) == d) {
                   System.out.println();
                   i++;
                   count=count+1;
                   if (name.charAt(i) == a) {
//                       System.out.println();
                       i++;
//                       count= count+1;
                   }
               }
               if (name.charAt(i) == e) {
                   System.out.println();
                   i++;
                   count=count+1;
               }
              if (name.charAt(i) == f) {
                  System.out.println();
                  i++;
                  count=count+1;
              }
               if (name.charAt(i) == g) {
                   System.out.println();
                   i++;
                   count=count+1;
               }


     if(i<37){
            System.out.print(name.charAt(i));}
        }
        System.out.println();
        System.out.println(count);
    }
}
