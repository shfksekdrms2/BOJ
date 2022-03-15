package com.solution.boj.string.p_11586;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/11586
 * 지영 공주님의 마법 거울
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] arr = new char[n][n];
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine().toCharArray();
        }

        int state = sc.nextInt();

        currentArr(arr, state);
    }

    private static String printArr(char[][] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    private static char[][] copyArr(char[][] arr, int state) {
        char[][] copyArr = new char[arr.length][arr[0].length];

        if (state == 3) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    copyArr[i][j] = arr[arr.length - i - 1][j];
                }
            }
        } else if (state == 2) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    copyArr[i][j] = arr[i][arr[i].length - j - 1];
                }
            }
        }

        return copyArr;
    }

    private static void currentArr(char[][] arr, int state) {
        char[][] copyArr = new char[arr.length][arr[0].length];

        if (state == 1) {
            copyArr = arr;
        } else {
            copyArr = copyArr(arr, state);
        }
        System.out.println(printArr(copyArr));
    }
}
