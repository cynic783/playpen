package com.lewis73.playpen.hacker_rank;

import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        boolean isWeird = new Conditionals().isWeird(n);
        System.out.println(isWeird ? "Weird" : "Not Weird");
    }

    boolean isWeird(int n) {
        if (n < 1 || n > 100) {
            throw new IllegalArgumentException("n must be between 1 and 100, inclusive");
        }

        //If n is odd, Weird
        //If n is even and in the inclusive range of 2 to 5, Not Weird
        //If n is even and in the inclusive range of 6 to 20, Weird
        //If n is even and greater than 20, Not Weird
        if (n % 2 == 1) {
            return true;
        } else if (n >= 2 && n <= 5) {
            return false;
        } else if (n >= 6 && n <= 20) {
            return true;
        } else if (n > 20) {
            return false;
        }

        return false;
    }
}
