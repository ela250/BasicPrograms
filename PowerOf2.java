package com.BasicCoreprograms;
import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        int  sum = 1;
        Scanner scan = new Scanner(System.in);    // This statement will capture the user input
        System.out.println("Enter the ^N value :");
        int power = scan.nextInt();                   //Captured input would be stored in inputValue

        if (power > 31) {                        // Logic to print the powers of two
            System.out.println("Value of number should be less then 31");
            return;
        } else {
                for (int i = 1; i <= power; i++) {
                sum = sum * 2;
               }
              System.out.println("2^N value is :" +sum);
        }
    }
}
