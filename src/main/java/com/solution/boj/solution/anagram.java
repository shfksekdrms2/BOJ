package com.solution.boj.solution;

import java.util.Scanner;

//1919
public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input1 = sc.next().toCharArray();
        char[] input2 = sc.next().toCharArray();
        int[][] cnt = new int[26][2];
        int i;
        for (i = 0; i < input1.length; i++) {
            cnt[input1[i] - 97][0]++;
        }
        for (i = 0; i < input2.length; i++) {
            cnt[input2[i] - 97][1]++;
        }
        int result = 0;
        for (i = 0; i < cnt.length; i++) {
            if (cnt[i][0] != cnt[i][1]) {
                result += Math.abs(cnt[i][0] - cnt[i][1]);
            }
        }
        System.out.println(result);
    }
}
