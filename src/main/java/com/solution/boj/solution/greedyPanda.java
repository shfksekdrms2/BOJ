package com.solution.boj.solution;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/1937
 * 욕심쟁이 판다
 */
public class greedyPanda {
    static int[][] arr;
    static int[][] maxSuviveCnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j;
        arr = new int[n][n];
        maxSuviveCnt = new int[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                maxSuviveCnt[i][j] = 1;
            }
        }

        int maxValue = Integer.MIN_VALUE;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                maxValue = Integer.max(maxSuvivePanda(i, j), maxValue);
            }
        }
        System.out.println(maxValue);
    }

    static boolean isOutOfArrayIndex(int row, int col) {
        return (row >= arr.length || row < 0 || col >= arr[0].length || col < 0);
    }

    static int[][] position = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

    static int maxSuvivePanda(int row, int col) {
        if (maxSuviveCnt[row][col] != 1) {
            return maxSuviveCnt[row][col];
        }

        int maxValue = 1;
        for (int i = 0; i < position.length; i++) {
            int nextRow = row + position[i][0];
            int nextCol = col + position[i][1];
            if (!isOutOfArrayIndex(nextRow, nextCol)) {
                if (arr[nextRow][nextCol] > arr[row][col]) {
                    maxValue = Integer.max(maxValue, maxSuvivePanda(nextRow, nextCol) + maxSuviveCnt[row][col]);
                }
            }
        }
        return maxSuviveCnt[row][col] = maxValue;
    }
}
