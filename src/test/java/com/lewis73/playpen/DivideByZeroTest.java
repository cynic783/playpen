package com.lewis73.playpen;

import org.junit.Test;

import static org.junit.Assert.*;

public class DivideByZeroTest {

    @Test(expected = ArithmeticException.class)
    public void numeratorAndDenominatorIntZero() {
        int num1 = 0;
        int num2 = 0;
        int num1DivNum2 = num1 / num2;
    }

    @Test
    public void numeratorAndDenominatorDoubleZero() {
        double num1 = 0d;
        double num2 = 0d;
        double num1DivNum2 = num1 / num2;
        assertTrue(Double.isNaN(num1DivNum2));
    }

    @Test
    public void numeratorIntZeroAndDenominatorDoubleZero() {
        int num1 = 0;
        double num2 = 0d;
        double num1DivNum2 = num1 / num2;
        assertTrue(Double.isNaN(num1DivNum2));
    }

    @Test
    public void numeratorDoubleZeroAndDenominatorIntZero() {
        double num1 = 0d;
        int num2 = 0;
        double num1DivNum2 = num1 / num2;
        assertTrue(Double.isNaN(num1DivNum2));
    }

    @Test
    public void numeratorIntNonZeroAndDenominatorIntZero() {
        int num1 = 1;
        double num2 = 0d;
        double num1DivNum2 = num1 / num2;
        assertTrue(Double.isInfinite(num1DivNum2));
    }

    @Test
    public void numeratorDoubleNonZeroAndDenominatorDoubleZero() {
        double num1 = 1d;
        double num2 = 0d;
        double num1DivNum2 = num1 / num2;
        assertTrue(Double.isInfinite(num1DivNum2));
    }

    @Test
    public void numeratorDoubleNonZeroAndDenominatorIntZero() {
        double num1 = 1d;
        int num2 = 0;
        double num1DivNum2 = num1 / num2;
        assertTrue(Double.isInfinite(num1DivNum2));
    }

    @Test
    public void numeratorIntNonZeroAndDenominatorDoubleZero() {
        int num1 = 1;
        double num2 = 0d;
        double num1DivNum2 = num1 / num2;
        assertTrue(Double.isInfinite(num1DivNum2));
    }
}
