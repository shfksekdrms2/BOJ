package com.solution.boj.string.p_5586;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/5586
 * JOI와 IOI
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        int[] result = new int[2];
        for (int i = 0; i < input.length() - 2; i++) {
            String str = input.substring(i, i + 3);
            if (str.equals("JOI")) {
                result[0]++;
            }

            if (str.equals("IOI")) {
                result[1]++;
            }
        }

        for (int i : result) {
            System.out.println(i);
        }

    }
}
