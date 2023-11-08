package com.company;
import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        //StringBuilder making a new String
//        StringBuilder sb = new StringBuilder();

        Scanner sc= new Scanner(System.in);
        try {
        int x= sc.nextInt();
            try{
              int  y= sc.nextInt();
              try{
                 int z=x/y;
                  System.out.println(z);
              }
              catch (Exception e){
                  System.out.println(e);
              }
            }
            catch (Exception e){
                System.out.println(e);
            }
        }catch (Exception e){
            System.out.println(e);
        }



    }
    }




