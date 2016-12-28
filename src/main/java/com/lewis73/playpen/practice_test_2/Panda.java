package com.lewis73.playpen.practice_test_2;

import java.util.HashSet;
import java.util.Set;

// Practice Test 2; Question 7
public class Panda {

    String name;
    Panda(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (! (obj instanceof Panda)) {
            return false;
        }
        Panda other = (Panda) obj;
        return this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public static void main(String[] args) {
        Set s = new HashSet<>();
        s.add(new Panda("Bao Bao"));
        s.add(new Panda("Mei Xiang"));
        s.add(new Panda("Bao Bao"));
        System.out.println(s.size());
    }
}
