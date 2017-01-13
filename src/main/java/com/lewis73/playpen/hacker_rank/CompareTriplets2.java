package com.lewis73.playpen.hacker_rank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CompareTriplets2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> alice = IntStream.range(0, 3).map(i -> in.nextInt()).boxed().collect(Collectors.toList());
        List<Integer> bob = IntStream.range(0, 3).map(i -> in.nextInt()).boxed().collect(Collectors.toList());
        List<Integer> result = new CompareTriplets2().doWork(alice, bob);
        System.out.println(result.get(0) + " " + result.get(1));
    }

    List<Integer> doWork(List<Integer> alice, List<Integer> bob) {
        List<Integer> toReturn = new ArrayList<>();
        toReturn.add(IntStream.range(0, 3).map(i -> alice.get(i) - bob.get(i) > 0 ? 1 : 0).sum());
        toReturn.add(IntStream.range(0, 3).map(i -> bob.get(i) - alice.get(i) > 0 ? 1 : 0).sum());
        return toReturn;
    }
}
