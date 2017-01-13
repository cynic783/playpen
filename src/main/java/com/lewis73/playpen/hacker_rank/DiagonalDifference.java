package com.lewis73.playpen.hacker_rank;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(new DiagonalDifference().diagonalDifference(arr));
    }

    int diagonalDifference(int [][] arr) {
        int n = arr.length;

        int primarySum = 0;
        int secondarySum = 0;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if (i == j) {
                    primarySum += arr[i][i];
                    secondarySum += arr[i][n - 1 - i];
                }
            }
        }

        return Math.abs(primarySum - secondarySum);
    }
}
