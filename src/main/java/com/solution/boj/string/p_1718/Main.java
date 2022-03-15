package com.solution.boj.string.p_1718;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/1718
 * 암호
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.nextLine().toCharArray();
        char[] cry = sc.next().toCharArray();

        char[] result = new char[input.length];
        for (int i = 0; i < input.length; i++) {
            if (input[i] == ' ') {
                result[i] = ' ';
            } else {
                int value = (input[i] + 'z') - (cry[i % cry.length]);
                if (value >= 'a' && value <= 'z') {
                    result[i] = (char) value;
                } else {
                    result[i] = (char) (value - 26);
                }
            }
        }
        System.out.println(result);

    }
}
