package com.lewis73.playpen.hacker_rank;

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
        int totalCost = new Arithmetic().getTotalCost(mealCost, tipPercent, taxPercent);


        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }

    int getTotalCost(double mealCost, int tipPercent, int taxPercent) {
        // Write your calculation code here.
        double tip = mealCost * (tipPercent / 100d);
        double tax = mealCost * (taxPercent / 100d);
        double dTotalCost = mealCost + tip + tax;
        // cast the result of the rounding operation to an int and save it as totalCost
        return (int) Math.round(dTotalCost);
    }
}
