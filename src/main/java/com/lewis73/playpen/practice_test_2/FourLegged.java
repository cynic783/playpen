package com.lewis73.playpen.practice_test_2;

// Practice Test 2; Question 8
public class FourLegged {
    String walk = "walk,";
    public void walk() {
        System.out.println(walk);
    }
    static class BabyRhino extends FourLegged {
        String walk = "toddle,";
    }
    public static void main(String[] args) {
        FourLegged f = new BabyRhino();
        BabyRhino b = new BabyRhino();
        f.walk();
        b.walk();
    }
}
