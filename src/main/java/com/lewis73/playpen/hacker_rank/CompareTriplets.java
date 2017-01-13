package com.lewis73.playpen.hacker_rank;

import java.util.Scanner;
import java.util.stream.IntStream;

public class CompareTriplets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] alice = new int[3];
        int [] bob = new int[3];
        IntStream.range(0, 3).forEach(i-> alice[i] = in.nextInt());
        IntStream.range(0, 3).forEach(i-> bob[i] = in.nextInt());
        int [] result = new CompareTriplets().doWork(alice, bob);
        System.out.println(result[0] + " " + result[1]);
    }

    int [] doWork(int [] alice, int [] bob) {
        int [] toReturn = new int [2];
        toReturn[0] = IntStream.range(0, 3).map(i1 -> alice[i1] - bob[i1] > 0 ? 1 : 0).sum();
        toReturn[1] = IntStream.range(0, 3).map(i -> bob[i] - alice[i] > 0 ? 1 : 0).sum();
        return toReturn;
    }
}
