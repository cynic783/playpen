package com.lewis73.playpen.generics;

import java.util.List;

/**
 * tl;dr: "PECS" is from the collection's point of view.
 * If you are only pulling items from a generic collection, it is a producer and you should use extends;
 * if you are only stuffing items in, it is a consumer and you should use super.
 * If you do both with the same collection, you shouldn't use either extends or super.
 */
class Pecs {

    <T> void copy(List<? extends T> producer, List<? super T> consumer) {
        for (int i = 0; i < producer.size(); i++) {
            T t = producer.get(i);
            if (i < consumer.size()) {
                consumer.set(i, t);
            } else {
                consumer.add(t);
            }
        }
    }

    <T> void copyExact(List<T> producer, List<T> consumer) {
        for (int i = 0; i < producer.size(); i++) {
            T t = producer.get(i);
            if (i < consumer.size()) {
                consumer.set(i, t);
            } else {
                consumer.add(t);
            }
        }
    }
}
