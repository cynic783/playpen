package com.lewis73.playpen.streams;

import java.util.stream.LongStream;

public class RangePractice {
    public static void main(String[] args) {
        LongStream.range(0, 5)
                .forEach(System.out::print);

        System.out.println();

        LongStream.rangeClosed(0, 5)
                .forEach(System.out::print);

    }
}
