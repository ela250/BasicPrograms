package com.BasicCoreprograms;

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum =sum + 1.0 / i;
            System.out.println("The sum of the first " + i + " terms of the harmonic series is:" +sum);
        }

    }
}
