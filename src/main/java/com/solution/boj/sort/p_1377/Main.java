package com.solution.boj.sort.p_1377;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/1377
 * 버블 소트
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            list.add(arr[i]);
        }
        Arrays.sort(arr);

        // int result = 0;
        int i;
        for (i = 0; i < n; i++) {
            while (list.get(i) != arr[i]) {
                if (list.size() > i + 1) {
                    list.remove(i);
                    // result++;
                } else {
                    break;
                }
            }
            if (list.size() == i + 1) {
                break;
            }

        }
        // System.out.println(result + 1);
        System.out.println(n - i);

    }
}
