package com.BasicCoreprograms;

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the number:");
        int value = number.nextInt();
        for (int i =2 ;i <= value ; i++){
            if (value % i==0){
                System.out.println(i);
                value = value/i;

            }
        }
        System.out.println();
    }
}
