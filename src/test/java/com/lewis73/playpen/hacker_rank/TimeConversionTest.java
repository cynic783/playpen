package com.lewis73.playpen.hacker_rank;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TimeConversionTest {
    TimeConversion testSubject;

    @Before
    public void before() {
        testSubject = new TimeConversion();
    }

    @Test
    public void hackerRankExample() throws Exception {
        // Arrange
        // Act
        // Assert
        assertThat(testSubject.convert("07:05:45PM"), is("19:05:45"));
    }

    @Test
    public void sad() throws Exception {
        // Arrange
        // Act
        // Assert
        assertThat(testSubject.convert("alsdkf"), is(""));
    }

}