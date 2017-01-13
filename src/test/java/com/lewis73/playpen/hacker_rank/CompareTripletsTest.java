package com.lewis73.playpen.hacker_rank;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CompareTripletsTest {

    CompareTriplets testSubject = new CompareTriplets();

    @Test
    public void degenerate() {
        int [] expected = new int [] {0, 0};
        int [] alice = new int [] {0, 0, 0};
        int [] bob = new int [] {0, 0, 0};
        assertThat(testSubject.doWork(alice, bob), is(expected));
    }

    @Test
    public void happyAlice() {
        int [] expected = new int [] {1, 0};
        int [] alice = new int [] {1, 0, 0};
        int [] bob = new int [] {0, 0, 0};
        assertThat(testSubject.doWork(alice, bob), is(expected));
    }

    @Test
    public void happyBob() {
        int [] expected = new int [] {1, 1};
        int [] alice = new int [] {1, 0, 0};
        int [] bob = new int [] {0, 1, 0};
        assertThat(testSubject.doWork(alice, bob), is(expected));
    }

    @Test
    public void another() {
        int [] expected = new int [] {2, 1};
        int [] alice = new int [] {1, 0, 1};
        int [] bob = new int [] {0, 1, 0};
        assertThat(testSubject.doWork(alice, bob), is(expected));
    }
}