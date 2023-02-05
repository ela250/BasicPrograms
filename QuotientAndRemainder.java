package com.BasicCoreprograms;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the number");
        double value = number.nextDouble();
        System.out.println("Enter the dividend number :");
        double dividend = number.nextDouble();
        double Quotient ;
        double Remainder ;
        Quotient = value /dividend;
        Remainder = value %dividend;
        System.out.println("quotient of "+value + "is "+Quotient);
        System.out.println("Remainder of "+value +"is" +Remainder);
    }

}
