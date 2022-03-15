package com.solution.boj.solution;

import java.util.Scanner;

//1128
public class fibonacciKnapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        long[][] arr = new long[n][2];

        for (i = 0; i < n; i++) {
            arr[i][0] = sc.nextLong();
            arr[i][1] = sc.nextLong();
        }
        long c = sc.nextLong();
        long[] sum = new long[n];
        if (arr[0][0] <= c) {
            sum[0] = arr[0][1];
        } else {
            System.out.println(0);
            return;
        }
        if (n > 1 && arr[1][0] <= c) {
            sum[1] = arr[1][1];
        } else {
            System.out.println(arr[0][1]);
            return;
        }

        if (n > 2) {
            for (i = 2; i < n; i++) {
                if (arr[i][0] <= c) {
                    if (arr[i - 2][1] + arr[i - 1][1] < arr[i][1]) {
                        sum[i] = arr[i][1];
                    } else {
                        sum[i] = arr[i - 2][1] + arr[i - 1][1];
                    }
                } else {
                    break;
                }
            }
            if (sum[i - 1] > sum[i - 2]) {
                System.out.println(sum[i - 1]);
            } else {
                System.out.println(sum[i - 2]);
            }
        } else {
            if (arr[0][0] + arr[1][0] <= c) {
                System.out.println(arr[0][1] + arr[1][1]);
            } else {
                if (sum[1] > sum[0] && arr[1][0] < c) {
                    System.out.println(sum[1]);
                } else if (sum[1] <= sum[0] && arr[0][0] < c) {
                    System.out.println(sum[0]);
                } else {
                    System.out.println(0);
                }
            }
        }
    }
}
