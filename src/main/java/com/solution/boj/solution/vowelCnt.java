package com.solution.boj.solution;

import java.util.Scanner;

//10987
public class vowelCnt {
    public static void main(String[] args) {
        String[] str = new String[]{"a", "e", "i", "o", "u"};
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int i, j;
        int cnt = 0;

        for (i = 0; i < input.length(); i++) {
            for (j = 0; j < str.length; j++) {
                if (input.substring(i, i + 1).equals(str[j])) {
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}