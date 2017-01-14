package com.lewis73.playpen.hacker_rank;

import java.util.Scanner;

public class Staircase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            for(int j=0; j<n; j++) {
                char c;
                if (j < (n - i - 1)) {
                    c = ' ';
                } else {
                    c = '#';
                }
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
