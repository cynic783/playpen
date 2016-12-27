package com.lewis73.playpen.generics;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.*;

public class PecsTest {
    private Pecs testSubject = new Pecs();

    @Test
    public void happy() {
        List<Integer> src = Arrays.asList(1, 2, 3);
        List<Object> observed = new LinkedList<>();
        testSubject.copy(src, observed);
        assertThat(observed, hasSize(3));
        assertThat(observed, contains(1, 2, 3));
    }

    @Test
    public void happy2() {
        List<Integer> src = Arrays.asList(1, 2, 3);
        List<Number> observed = new LinkedList<>();
        testSubject.copy(src, observed);
        assertThat(observed, hasSize(3));
        assertThat(observed, contains(1, 2, 3));
    }

//    @Test
//    public void sad3() {
//        List<Integer> src = Arrays.asList(1, 2, 3);
//        List<Number> observed = new LinkedList<>();
//        testSubject.copyExact(src, observed);
//        assertThat(observed, hasSize(3));
//        assertThat(observed, contains(1, 2, 3));
//    }
}