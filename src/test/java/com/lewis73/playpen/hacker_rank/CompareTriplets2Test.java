package com.lewis73.playpen.hacker_rank;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CompareTriplets2Test {

    CompareTriplets2 testSubject = new CompareTriplets2();

    @Test
    public void degenerate() {
        List<Integer> expected = Arrays.asList(0, 0);
        List<Integer> alice = Arrays.asList(0, 0, 0);
        List<Integer> bob = Arrays.asList(0, 0, 0);
        assertThat(testSubject.doWork(alice, bob), is(expected));
    }

    @Test
    public void happyAlice() {
        List<Integer> expected = Arrays.asList(1, 0);
        List<Integer> alice = Arrays.asList(1, 0, 0);
        List<Integer> bob = Arrays.asList(0, 0, 0);
        assertThat(testSubject.doWork(alice, bob), is(expected));
    }

    @Test
    public void happyBob() {
        List<Integer> expected = Arrays.asList(1, 1);
        List<Integer> alice = Arrays.asList(1, 0, 0);
        List<Integer> bob = Arrays.asList(0, 1, 0);
        assertThat(testSubject.doWork(alice, bob), is(expected));
    }

    @Test
    public void another() {
        List<Integer> expected = Arrays.asList(2, 1);
        List<Integer> alice = Arrays.asList(1, 0, 1);
        List<Integer> bob = Arrays.asList(0, 2, 0);
        assertThat(testSubject.doWork(alice, bob), is(expected));
    }
}