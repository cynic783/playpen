package com.lewis73.playpen.hacker_rank;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MinimumDistancesImperative {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int answer = new MinimumDistancesImperative().doWork(arr);
        System.out.println(answer);

    }

    int doWork(int [] arr) {
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
}
