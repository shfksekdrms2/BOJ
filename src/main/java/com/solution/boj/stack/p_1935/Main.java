package com.solution.boj.stack.p_1935;

import java.util.Scanner;
import java.util.Stack;

/*
 * https://www.acmicpc.net/problem/1935
 * 후위표기식2
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = sc.next().toCharArray();

        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }

        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '*' && arr[i] != '+' && arr[i] != '/' && arr[i] != '-') {
                stack.add((double) values[arr[i] - 'A']);
            } else {
                double value = 0;
                double firstValue = stack.pop();
                double secondValue = stack.pop();
                switch (arr[i]) {
                    case '*':
                        value = firstValue * secondValue;
                        break;
                    case '+':
                        value = firstValue + secondValue;
                        break;
                    case '/':
                        value = secondValue / firstValue;
                        break;
                    case '-':
                        value = secondValue - firstValue;
                        break;
                }
                stack.add(value);
            }
        }
        System.out.printf("%.2f", stack.pop());
    }
}
