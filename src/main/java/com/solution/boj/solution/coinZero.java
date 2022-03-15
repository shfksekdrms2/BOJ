package com.solution.boj.solution;

import java.util.Scanner;

//11047
public class coinZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int i;
        int arr[] = new int[n];
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int copyK = k;
        int cnt = 0;
        for (i = n - 1; i >= 0; i--) {
            if (copyK / arr[i] >= 0) {
                cnt += copyK / arr[i];
                copyK = copyK % arr[i];
            }
            if (copyK == 0) {
                break;
            }
        }
        System.out.println(cnt);
    }
}
