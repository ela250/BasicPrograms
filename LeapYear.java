package com.BasicCoreprograms;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the year :");
        int year = scanner.nextInt();  //getting input from user

        if ( year > 999){           // to check entered year is greater then 999
            System.out.println("Entered year is four digit value");
            if(year %100 != 0 && year % 400 == 0 && year%4 ==0){  // check year value meets every condition

                System.out.println( year +"is a leap year");
            }else{
                System.out.println(year+ "is not a leap year");
            }
        }else{
            System.out.println("Enter four digit value");
        }

    }

}
