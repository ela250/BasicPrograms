package com.BasicCoreprograms;

public class FlipCoin {
    public static void main(String[] args) {
        int Number_of_Times_to_FliptheCoin = 7;
        double value;
        for (int i = 1; i <= 7; i++) {
            double coincheck = Math.random();
            if (coincheck < 0.5) {
                value = coincheck;
                double percentage = value /Number_of_Times_to_FliptheCoin * 100;
                System.out.println("Tail appears" + percentage);
            } else {
                value = coincheck;
                double percentage = value /Number_of_Times_to_FliptheCoin * 100;
                System.out.println(" Head appears" + percentage);
            }

        }
    }

}
