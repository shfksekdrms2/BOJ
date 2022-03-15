package com.solution.boj.solution;

import java.util.Scanner;

//1371
public class bestOfBestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        int[] arr = new int[26];
        int i;
        while (sc.hasNextLine()) {
            input = sc.nextLine();
            for (i = 0; i < input.length(); i++) {
                if (!input.substring(i, i + 1).equals(" ")) {
                    arr[(int) input.substring(i, i + 1).charAt(0) - 97]++;
                }
            }
        }
        sc.close();
        int maxValue = Integer.MIN_VALUE;
        for (i = 0; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == maxValue) {
                System.out.print((char) (i + 97));
            }
        }
    }
}
