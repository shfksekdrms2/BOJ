package com.solution.boj.solution;

import java.util.Scanner;

//10808
public class alphabetCnt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int[] alphabet = new int[26];
        int i;
        for (i = 0; i < input.length(); i++) {
            alphabet[(int) input.charAt(i) - 97]++;
        }
        for (i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i] + " ");
        }
    }
}
