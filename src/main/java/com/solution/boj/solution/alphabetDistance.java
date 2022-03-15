package com.solution.boj.solution;

import java.util.Scanner;

//5218
public class alphabetDistance {
    public static void main(String[] srgs) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i, j;
        String result = "";
        String[] str;
        for (i = 0; i < t; i++) {
            result = "";
            str = new String[2];
            str[0] = sc.next();
            str[1] = sc.next();
            for (j = 0; j < str[0].length(); j++) {
                if ((int) str[0].substring(j, j + 1).charAt(0) < (int) str[1].substring(j, j + 1).charAt(0)) {
                    result += " " + ((int) str[1].substring(j, j + 1).charAt(0) - (int) str[0].substring(j, j + 1).charAt(0));
                } else if ((int) str[0].substring(j, j + 1).charAt(0) > (int) str[1].substring(j, j + 1).charAt(0)) {
                    result += " " + ((int) str[1].substring(j, j + 1).charAt(0) - (int) str[0].substring(j, j + 1).charAt(0) + 26);
                } else {
                    result += " 0";
                }
            }
            System.out.println("Distances:" + result);
        }
    }
}
