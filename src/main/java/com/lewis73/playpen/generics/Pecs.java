package com.lewis73.playpen.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * tl;dr: "PECS" is from the collection's point of view.
 * If you are only pulling items from a generic collection, it is a producer and you should use extends;
 * if you are only stuffing items in, it is a consumer and you should use super.
 * If you do both with the same collection, you shouldn't use either extends or super.
 */
public class Pecs {

    public static void main(String[] args) {
        consumerSuper(new ArrayList<Integer>());
        consumerSuper(new ArrayList<Number>());
        consumerSuper(new ArrayList<Object>());

//        consumerExtends(new ArrayList<Number>());
        consumerExtends(new ArrayList<Integer>());
//        consumerExtends(new ArrayList<Double>());

        producerSuper(new ArrayList<Object>());
        producerSuper(new ArrayList<Number>());
        producerSuper(new ArrayList<Integer>());

//        producerExtends(new ArrayList<Object>());
//        producerExtends(new ArrayList<Number>());
        producerExtends(new ArrayList<Integer>());
    }

    private static void producerSuper(List<? super Integer> list) {
        Object o = list.get(0);
//        Number n = list.get(0);
//        Integer i = list.get(0);
    }

    private static void producerExtends(List<? extends Integer> list) {
        Object o = list.get(0);
        Number n = list.get(0);
        Integer i = list.get(0);
    }

    private static void consumerSuper(List<? super Integer> list) {
//        list.add(new Object());
//        list.add(asNumber(new Integer(5)));
        list.add(new Integer(5));
    }

    // XXX upper-bounded generics are immutable
    private static void consumerExtends(List<? extends Integer> list) {
//        list.add(new Object());
//        list.add(asNumber(new Integer(5)));
//        list.add(new Integer(5));
    }

    public static <T> void copy(List<? extends T> src, List<? super T> dest) {
        for (int i = 0; i < src.size(); i++) {
            T t = src.get(i);
            dest.set(i, t);
        }
    }

    private static Number asNumber(Integer i) {
        return i;
    }
}
