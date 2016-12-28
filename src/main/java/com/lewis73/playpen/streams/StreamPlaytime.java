package com.lewis73.playpen.streams;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.joining;

/**
 * From JavaOne talk: A Few Hidden Treasures in Java 8
 * https://youtu.be/GphO9fWhlAg
 */
public class StreamPlaytime {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Jerry", "Jane", "Jack");
        System.out.println(names.stream().collect(joining(", ")));
        System.out.println(names.stream().map(String::toUpperCase).collect(joining(", ")));
    }
}
