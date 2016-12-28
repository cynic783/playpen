package com.lewis73.playpen.streams;

import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;

public class IntStreamPractice {
    public static void main(String[] args) {
        System.out.println(IntStream.range(0, 10).mapToObj(String::valueOf).collect(joining(", ")));
    }
}
