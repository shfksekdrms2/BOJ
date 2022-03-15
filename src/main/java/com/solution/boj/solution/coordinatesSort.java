package com.solution.boj.solution;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//11650
public class coordinatesSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        int x, y;
        int[][] arr = new int[n][2];
        for (i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            arr[i][0] = x;
            arr[i][1] = y;
        }
        Arrays.sort(arr, new mySort());
        for (i = 0; i < n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }

    static class mySort implements Comparator<int[]> {
        @Override
        public int compare(int[] o1, int[] o2) {
            // TODO Auto-generated method stub
            if (o1[0] > o2[0]) {
                return 1;
            } else if (o1[0] < o2[0]) {
                return -1;
            } else {
                if (o1[1] > o2[1]) {
                    return 1;
                } else if (o1[1] < o2[1]) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
}
