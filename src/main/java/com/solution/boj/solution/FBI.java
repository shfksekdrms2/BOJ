package com.solution.boj.solution;

import java.util.Scanner;

//2857
public class FBI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int i, j;
        String[] str = new String[n];
        String findStr = "FBI";
        for (i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        boolean exist = false;
        for (i = 0; i < n; i++) {
            for (j = 0; j < str[i].length() - findStr.length() + 1; j++) {
                if (str[i].substring(j, j + findStr.length()).equals(findStr)) {
                    System.out.print((i + 1) + " ");
                    exist = true;
                    break;
                }
            }
        }
        if (exist == false) {
            System.out.println("HE GOT AWAY!");
        }
    }
}
