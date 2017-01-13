package com.lewis73.playpen.hacker_rank;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MinimumDistancesFunctional {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int answer = new MinimumDistancesFunctional().doWork(arr);
        System.out.println(answer);

    }

    int doWork(int [] arr) {
        Map<Integer, List<Integer>> occurrences = IntStream.range(0, arr.length).boxed().collect(Collectors.groupingBy(i -> arr[i]));
        OptionalInt min = occurrences.entrySet().stream().map(e -> minDist(e.getValue())).mapToInt(Integer::intValue).filter(i -> i != -1).min();
        return min.orElse(-1);
    }

    int minDist(List<Integer> nums) {
        Collections.sort(nums);
        return IntStream.range(1, nums.size()).map(i -> nums.get(i) - nums.get(i - 1)).min().orElse(-1);
    }
}
