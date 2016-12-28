package com.lewis73.playpen.practice_test_2;

import java.util.HashMap;
import java.util.Map;

public class T2Q13 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, null);

        map.merge(1, 3, (a,b) -> null);
        map.merge(3, 3, (a,b) -> null);

        System.out.println(map);
    }
}
