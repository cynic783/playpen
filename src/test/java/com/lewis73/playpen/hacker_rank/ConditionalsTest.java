package com.lewis73.playpen.hacker_rank;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ConditionalsTest {
    Conditionals testSubject;

    @Before
    public void before() {
        testSubject = new Conditionals();
    }

    @Test(expected = IllegalArgumentException.class)
    public void isWeirdTooSmall() {
        assertThat(testSubject.isWeird(0), is(false));
    }

    @Test(expected = IllegalArgumentException.class)
    public void isWeirdTooBig() {
        assertThat(testSubject.isWeird(101), is(false));
    }

    @Test
    public void oddWeird() {
        assertThat(testSubject.isWeird(1), is(true));
    }

    @Test
    public void oddWeirdBig() {
        assertThat(testSubject.isWeird(33), is(true));
    }

    @Test
    public void even2to5NotWeird() {
        assertThat(testSubject.isWeird(2), is(false));
    }

    @Test
    public void even6to20Weird() {
        assertThat(testSubject.isWeird(6), is(true));
    }

    @Test
    public void evenOver20NotWeird() {
        assertThat(testSubject.isWeird(22), is(false));
    }

    @Test
    public void fourIsNotWeird() {
        assertThat(testSubject.isWeird(4), is(false));
    }

    @Test
    public void eighteenIsWeird() {
        assertThat(testSubject.isWeird(18), is(true));
    }
}