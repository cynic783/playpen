package com.lewis73.playpen.static_overload;

public class Sub extends Base {
    void method() {
        System.out.println("method Sub");
    }
    static void staticMethod() {
        System.out.println("staticMethod Sub");
    }
    public static void main(String [] args) {
        Sub play = new Sub();
        play.method();
        play.staticMethod();
        Base base = play;
        base.method(); // participates in Polymorphism
        base.staticMethod(); // does NOT participate in Polymorphism
    }
}
