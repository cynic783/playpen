package com.lewis73.playpen.practice_test_2;

import java.util.Set;
import java.util.TreeSet;

public class T2Q1 {
    public static void main(String[] args) {
        Set points = new TreeSet();
        points.add(7);
        points.add(5);
        points.add(-4);
        points.add(6);
        for (Object point: points) {
            System.out.print(point);
        }
    }
}
