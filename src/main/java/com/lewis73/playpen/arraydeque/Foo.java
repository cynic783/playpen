package com.lewis73.playpen.arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by dan on 10/1/16.
 */
public class Foo {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        Queue<String> queue = arrayDeque;
        Deque<String> deque = arrayDeque;
    }
}
