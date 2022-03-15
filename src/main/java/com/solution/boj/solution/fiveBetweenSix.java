package com.solution.boj.solution;

import java.util.Scanner;

//2864
public class fiveBetweenSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = new String[2];
        input[0] = sc.next();
        input[1] = sc.next();
        String[] minStr = new String[2];
        String[] maxStr = new String[2];

        int i, j;
        for (i = 0; i < input.length; i++) {
            minStr[i] = "";
            maxStr[i] = "";
            for (j = 0; j < input[i].length(); j++) {
                String str = input[i].substring(j, j + 1);
                if (str.equals("5") || str.equals("6")) {
                    minStr[i] += "5";
                    maxStr[i] += "6";
                } else {
                    minStr[i] += str;
                    maxStr[i] += str;
                }
            }
        }
        System.out.print((Integer.parseInt(minStr[0]) + Integer.parseInt(minStr[1]))
                + " " + (Integer.parseInt(maxStr[0]) + Integer.parseInt(maxStr[1])));
    }
}
