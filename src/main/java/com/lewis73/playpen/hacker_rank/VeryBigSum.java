package com.lewis73.playpen.hacker_rank;

import java.util.Scanner;
import java.util.stream.LongStream;

public class VeryBigSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(LongStream.of(arr).sum());
    }
}
