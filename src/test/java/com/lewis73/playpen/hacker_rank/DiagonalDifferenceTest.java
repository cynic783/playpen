package com.lewis73.playpen.hacker_rank;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DiagonalDifferenceTest {
    DiagonalDifference testSubject;

    @Before
    public void before() {
        testSubject = new DiagonalDifference();
    }

    @Test
    public void allOnes() {
        int [][] input = new int [][] {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };
        assertThat(testSubject.diagonalDifference(input), is(0));
    }

    @Test
    public void allZeros() {
        int [][] input = new int [][] {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        assertThat(testSubject.diagonalDifference(input), is(0));
    }

    @Test
    public void happy() {
        int [][] input = new int [][] {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        assertThat(testSubject.diagonalDifference(input), is(2));
    }
}