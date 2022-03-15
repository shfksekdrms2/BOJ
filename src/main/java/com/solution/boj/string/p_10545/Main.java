package com.solution.boj.string.p_10545;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/10545
 * 뚜기뚜기 메뚜기
 */
public class Main {
    public static char[][] str = {{' '}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'},
            {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt() - 1;
        }

        char[] input = sc.next().toCharArray();
        String result = "";
        int i, j, k = 0, l, m;
        int beforeNumber = Integer.MAX_VALUE;
        for (i = 0; i < input.length; i++) {

            boolean find = false;
            for (j = 0; j < str.length && !find; j++) {
                for (k = 0; k < str[j].length && !find; k++) {
                    if (input[i] == str[j][k]) {
                        find = true;
                    }
                }
            }
            find = false;
            for (m = 0; m < arr.length && !find; m++) {
                if (arr[m] == j - 1) {
                    if (beforeNumber == m - 1) {
                        result += "#";
                    }
                    for (l = 0; l <= k - 1; l++) {
                        result += (m + 1);
                    }
                    find = true;
                    beforeNumber = m - 1;
                }
            }
        }
        System.out.println(result);
    }
}
