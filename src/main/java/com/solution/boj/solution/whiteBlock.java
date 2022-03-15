package com.solution.boj.solution;

import java.util.Scanner;

//1100
public class whiteBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int i, j;
        int cnt = 0;
        for (i = 0; i < 8; i++) {
            str = sc.next();
            for (j = 0; j < 8; j++) {
                if ((j + i) % 2 == 0) {
                    if (str.substring(j, j + 1).equals("F")) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
