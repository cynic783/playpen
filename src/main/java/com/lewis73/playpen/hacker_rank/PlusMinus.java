package com.lewis73.playpen.hacker_rank;

import java.util.*;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int pos = 0;
        int neg = 0;
        int zero = 0;
        for (int i = 0; i < n; i++) {
            int m = in.nextInt();
            if (m == 0) {
                zero++;
            } else if (m > 0) {
                pos++;
            } else {
                neg++;
            }
        }
        double dPos = pos / (double) n;
        double dNeg = neg / (double) n;
        double dZero = zero / (double) n;
        System.out.printf("%.5f\n%.5f\n%.5f", dPos, dNeg, dZero);
    }
}
