package com.lewis73.playpen.hacker_rank;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MinimumDistancesFunctionalTest {

    MinimumDistancesFunctional testSubject = new MinimumDistancesFunctional();

    @Test
    public void happyDegenerate() {
        assertThat(testSubject.doWork(new int [] {1, 1}), is(1));
    }

    @Test
    public void happyExample() {
        assertThat(testSubject.doWork(new int [] {7, 1, 3, 4, 1, 7}), is(3));
    }

    @Test
    public void happyDanMadeUp() {
        assertThat(testSubject.doWork(new int [] {1, 2, 1, 3, 2}), is(2));
    }

    @Test
    public void happyDanMadeUpEasy() {
        assertThat(testSubject.doWork(new int [] {1, 2, 1}), is(2));
    }

    @Test
    public void sadNoIntegers() {
        assertThat(testSubject.doWork(new int[]{}), is(-1));
    }
}