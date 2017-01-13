package com.lewis73.playpen.hacker_rank;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ArithmeticTest {
    Arithmetic testSubject;

    @Before
    public void before() {
        testSubject = new Arithmetic();
    }

    @Test
    public void hackerRankTestCase1() {
        assertThat(testSubject.getTotalCost(12, 20, 8), is(15));
    }

    @Test
    public void happy() {
        assertThat(testSubject.getTotalCost(10, 10, 10), is(12));
    }
}