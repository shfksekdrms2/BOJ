package com.solution.boj.sort.p_2959;

import java.util.Arrays;
import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/2959
 * 거북이
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[4];

        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }

        Arrays.sort(input);
        System.out.println(input[0] * input[2]);
    }
}
