package com.lewis73.playpen.arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        Queue<String> queue = arrayDeque;
        Deque<String> deque = arrayDeque;
    }
}
