package com.lewis73.playpen.hacker_rank;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ArraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(IntStream.of(arr).sum());
    }
}
