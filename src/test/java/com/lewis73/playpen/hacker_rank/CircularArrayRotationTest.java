package com.lewis73.playpen.hacker_rank;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CircularArrayRotationTest {
    CircularArrayRotation testSubject;

    @Before
    public void before() {
        testSubject = new CircularArrayRotation();
    }

    @Test
    public void hackerRankExample() throws Exception {
        assertThat(testSubject.solve(3, 2, 3, new int [] {1, 2, 3}, new int [] {0, 1, 2}), is(new int [] {2, 3, 1}));
    }

    @Test(expected = NullPointerException.class)
    public void sad1() throws Exception {
        testSubject.solve(0, 0, 0, new int [] {}, null);
    }

    @Test(expected = NullPointerException.class)
    public void sad2() throws Exception {
        testSubject.solve(0, 0, 0, null, new int [] {});
    }

    @Test(expected = IllegalArgumentException.class)
    public void sad3() throws Exception {
        testSubject.solve(-1, 0, 0, new int [] {}, new int [] {});
    }

    @Test(expected = IllegalArgumentException.class)
    public void sad4() throws Exception {
        testSubject.solve(0, -1, 0, new int [] {}, new int [] {});
    }

    @Test(expected = IllegalArgumentException.class)
    public void sad5() throws Exception {
        testSubject.solve(0, 0, -1, new int [] {}, new int [] {});
    }

    @Test(expected = IllegalArgumentException.class)
    public void sad6() throws Exception {
        testSubject.solve(1, 0, 0, new int [] {}, new int [] {});
    }

    @Test(expected = IllegalArgumentException.class)
    public void sad7() throws Exception {
        testSubject.solve(0, 0, 1, new int [] {}, new int [] {});
    }

    @Test(expected = IllegalArgumentException.class)
    public void sad8() throws Exception {
        testSubject.solve(0, 0, 0, new int [] {0}, new int [] {});
    }

    @Test(expected = IllegalArgumentException.class)
    public void sad9() throws Exception {
        testSubject.solve(0, 0, 0, new int [] {}, new int [] {0});
    }

    @Test
    public void hackerRankTestCase7() throws IOException {
        Path inputPath = Paths.get("/Users/dan/projects/playpen/circularArrayRotationTestCase7Input.txt");
        Path expectedOutputPath = Paths.get("/Users/dan/projects/playpen/circularArrayRotationTestCase7Output.txt");
        try (InputStream input = Files.newInputStream(inputPath, StandardOpenOption.READ)) {
            List<Integer> observed = testSubject.solve(input);
            List<Integer> expected = Files.lines(expectedOutputPath).map(Integer::parseInt).collect(Collectors.toList());
            assertThat(expected, is(observed));
        }
    }
}