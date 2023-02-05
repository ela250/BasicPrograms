package com.BasicCoreprograms;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the Twovalues :");
        int value1 = number.nextInt();
        int value2 = number.nextInt();

        int temp = value1;
        value1 = value2;
        value2 = temp;
        System.out.println("After  swapping : value1 =" +value1+ ", value2 = "+value2);
    }
}
