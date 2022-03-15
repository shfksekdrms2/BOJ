package com.solution.boj.string.p_5555;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/5555
 * 반지
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str = sc.next().toCharArray();
        int n = sc.nextInt();

        int cnt = 0;
        int i, j;
        while (n-- > 0) {
            char[] input = sc.next().toCharArray();
            for (i = 0; i < input.length; i++) {
                for (j = 0; j < str.length; j++) {
                    if (str[j] != input[(i + j) % input.length]) {
                        break;
                    }
                }

                if (j == str.length) {
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
