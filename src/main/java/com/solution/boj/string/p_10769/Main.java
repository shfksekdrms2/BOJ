package com.solution.boj.string.p_10769;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/10769
 * 행복한지 슬픈지
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String happy = ":-)";
        String unHappy = ":-(";

        int[] cnt = new int[2];
        for (int i = 0; i < input.length() - 2; i++) {
            String subString = input.substring(i, i + 3);
            if (happy.equals(subString)) {
                cnt[0]++;
            }
            if (unHappy.equals(subString)) {
                cnt[1]++;
            }
        }

        if (cnt[0] == 0 && cnt[1] == 0) {
            System.out.println("none");
        } else if (cnt[0] > cnt[1]) {
            System.out.println("happy");
        } else if (cnt[0] < cnt[1]) {
            System.out.println("sad");
        } else {
            System.out.println("unsure");
        }

    }
}
