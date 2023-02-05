package com.BasicCoreprograms;

import java.util.Scanner;

public class LargestAmongThreeNumbers {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the Three values :");
        int value1 = number.nextInt();
        int value2 = number.nextInt();
        int value3 = number.nextInt();
        if (value1 > value2 && value1 > value3) {
            System.out.println(value1 + "is the Largest");
        } else if (value2 > value1 && value2 > value3) {
            System.out.println(value2 + "is the Largest");
        } else {
            System.out.println(value3 + "is the Largest");
        }
    }



}
