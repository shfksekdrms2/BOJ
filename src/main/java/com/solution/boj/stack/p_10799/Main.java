package com.solution.boj.stack.p_10799;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/10799
 * 쇠막대기
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> list = new ArrayList<>();
        char[] input = sc.next().toCharArray();

        int result = 0;
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] == '(' && input[i + 1] == ')') {
                result += list.size();
                i++;
                continue;
            }

            if (input[i] == '(') {
                list.add('(');
            }

            if (input[i] == ')') {
                result += 1;
                list.remove(list.size() - 1);
            }
        }
        if (list.size() == 1) {
            result++;
        }

        System.out.println(result);
    }
}
