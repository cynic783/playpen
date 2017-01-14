
package com.lewis73.playpen.hacker_rank;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CircularArrayRotation {

    public static void main(String[] args) {
        CircularArrayRotation instance = new CircularArrayRotation();
        List<Integer> answers = instance.solve(System.in);
        for (int answer : answers) {
            System.out.println(answer);
        }
    }

    List<Integer> solve(InputStream inputStream) {
        Scanner in = new Scanner(inputStream);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i < n; i++){
            a[i] = in.nextInt();
        }
        int [] m = new int [q];
        for(int j = 0; j < q; j++){
            m[j] = in.nextInt();
        }
        int [] answer = solve(n, k, q, a, m);
        List<Integer> toReturn = new ArrayList<>();
        for (int elem : answer) {
            toReturn.add(elem);
        }
        return toReturn;
    }

    int [] solve(int n, int k, int q, int [] a, int [] m) {
        Objects.requireNonNull(a, "a must not be null");
        Objects.requireNonNull(a, "m must not be null");
        if (n < 0) {
            throw new IllegalArgumentException("n must not be negative");
        }
        if (k < 0) {
            throw new IllegalArgumentException("k must not be negative");
        }
        if (q < 0) {
            throw new IllegalArgumentException("q must not be negative");
        }
        if (a.length != n) {
            throw new IllegalArgumentException("a length must = n");
        }
        if (m.length != q) {
            throw new IllegalArgumentException("m length must = q");
        }
        int [] rotatedPrev = new int [n];
        System.arraycopy(a, 0, rotatedPrev, 0, n);
        int [] rotated = new int[n];
        int nMinus1 = n - 1;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j == (nMinus1) ? 0 : j + 1] = rotatedPrev[j];
            }
            System.arraycopy(rotated, 0, rotatedPrev, 0, n);
        }
        int [] toReturn = new int[q];
        for (int i = 0; i < q; i++) {
            toReturn[i] = rotated[m[i]];
        }

        return toReturn;
    }
}
