package com.solution.boj.solution;

import java.util.Scanner;

//5622
public class dial {
    static int[] cho = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    static char[][] dial = {{'!'}, {'A', 'B', 'C'}, {'D', 'E', 'F'},
            {'G', 'H', 'I'}, {'J', 'K', 'L'}, {'M', 'N', 'O'},
            {'P', 'Q', 'R', 'S'}, {'T', 'U', 'V'}, {'W', 'Y', 'X', 'Z'}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.next().toCharArray();

        int result = 0;
        for (int i = 0; i < input.length; i++) {
            for (int k = 0; k < dial.length; k++) {
                for (int j = 0; j < dial[k].length; j++) {
                    if (input[i] == dial[k][j]) {
                        result += cho[k];
                    }
                }
            }
        }
        System.out.println(result + input.length);
    }
}
