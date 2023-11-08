package com.company;
import java.util.*;
public class lexicographically {
    public static void main(String[] args) {
        System.out.println("printing lexocographically");
//        Scanner sc = new Scanner(System.in);
        String A = "a";
        String B = "b";
//.compareTo-->two different String ke beech me compare karta hai each charecter ki ascii value ko compare karke.
        int result = A.compareTo(B);//a ka ascii value kam hai isliye -1;
        int result2 =B.compareTo(A); //b ka ascii value jyada hai isliye +1;

        System.out.println(result);
        System.out.println(result2);
//        if (result <= 0) {
//            System.out.println("Yes");
//        } else if (result > 0) {
//            System.out.println("No");
//        }



    }

}