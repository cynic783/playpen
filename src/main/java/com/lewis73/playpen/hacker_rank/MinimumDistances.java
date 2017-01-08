package com.lewis73.playpen.hacker_rank;


import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MinimumDistances {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int answer = new MinimumDistances().doWork(arr);
        System.out.println(answer);

    }

    int doWork(int [] arr) {
        return doWorkFunctionalBetter(arr);
    }

    int doWorkFunctional(int [] arr) {
        Map<Integer, List<Integer>> occurrences = IntStream.range(0, arr.length).boxed().collect(Collectors.groupingBy(i -> arr[i]));
        final AtomicInteger ret = new AtomicInteger(-1);
        occurrences.entrySet().forEach(entry -> {
            int dist = minDist(entry.getValue());
            if (dist != -1) {
                if (ret.get() == -1 || dist < ret.get()) {
                    ret.set(dist);
                }
            }
        });
        return ret.get();
    }

    int doWorkFunctionalBetter(int [] arr) {
        Map<Integer, List<Integer>> occurrences = IntStream.range(0, arr.length).boxed().collect(Collectors.groupingBy(i -> arr[i]));
        OptionalInt min = occurrences.entrySet().stream().map(e -> minDist(e.getValue())).mapToInt(Integer::intValue).filter(i -> i != -1).min();
        return min.orElse(-1);
    }

    int doWorkImperative(int [] arr) {
        Map<Integer, List<Integer>> occurrences = IntStream.range(0, arr.length).boxed().collect(Collectors.groupingBy(i -> arr[i]));

        int ret = -1;
        for (Map.Entry<Integer, List<Integer>> entry : occurrences.entrySet()) {
            int dist = minDist(entry.getValue());
            if (dist != -1) {
                if (ret == -1 || dist < ret) {
                    ret = dist;
                }
            }
        }

        return ret;
    }

    int minDist(List<Integer> nums) {
        return minDistFunctional(nums);
    }

    int minDistImperative(List<Integer> nums) {
        Collections.sort(nums);
        int ret = -1;
        for (int i = 1, len = nums.size(); i < len; i++) {
            Integer prev =  nums.get(i - 1);
            Integer next =  nums.get(i);
            int dist = next - prev;
            if (ret == -1 || dist < ret) {
                ret = dist;
            }
        }
        return ret;
    }

    int minDistFunctional(List<Integer> nums) {
        Collections.sort(nums);
        return IntStream.range(1, nums.size()).map(i -> nums.get(i) - nums.get(i - 1)).min().orElse(-1);
    }
}
