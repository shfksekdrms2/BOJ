package com.solution.boj.solution;

import java.util.Scanner;

//2941
public class croatiaAlphabet {
    static String[] str = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        boolean find = false;
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            find = false;
            for (int j = 0; j < str.length; j++) {
                if (i + str[j].length() <= input.length()) {
                    if (str[j].equals(input.substring(i, i + str[j].length()))) {
                        result++;
                        i += str[j].length() - 1;
                        find = true;
                        break;
                    }
                }
            }
            if (!find) {
                result++;
            }
        }
        System.out.println(result);
    }
}
