package com.company;

import java.util.Scanner;

public class greatest_number {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int array = sc.nextInt();
//        int[] numbers = new int[array];
//        for (int j = 0; j < array; j++) {
//            numbers[j] = sc.nextInt();
//        }
//        int max = numbers[0];
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] > max) {
//                max = numbers[i];
//            }
//        }
//        System.out.println("" + max);
//         Sample array


        int[] numbers = {10, 5, 8, 20, 15, 25};

        // Initialize the maximum value with the first element of the array
        int max = numbers[0];

        // Iterate through the array to find the maximum value
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println(max);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
            }
        }

        // Print the maximum value


    }




