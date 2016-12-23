package com.lewis73.playpen;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class FiniteStreamsTest {

    List<String> list = Arrays.asList("monkey", "2", "chimp");
    Predicate<String> pred = x -> Character.isLetter(x.charAt(0));

    @Test
    public void anyMatch() {
        assertTrue(list.stream().anyMatch(pred));
    }

    @Test
    public void allMatch() {
        assertFalse(list.stream().allMatch(pred));
    }

    @Test
    public void noneMatch() {
        assertFalse(list.stream().noneMatch(pred));
    }

    @Test
    public void forEach() {
        StringBuilder sb = new StringBuilder();
        list.stream().forEach(sb::append);
        assertEquals("monkey2chimp", sb.toString());
    }

    @Test
    public void forEachJoiner() {
        StringJoiner stringJoiner = new StringJoiner(",");
        list.forEach(stringJoiner::add);
        assertEquals("monkey,2,chimp", stringJoiner.toString());
    }

    @Test
    public void forEachJoiner2() {
        assertEquals("monkey,2,chimp", list.stream().collect(Collectors.joining(",")));
    }
}
