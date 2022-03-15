package com.solution.boj.solution;

import java.util.Scanner;

//1110
public class plusCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int value = input;
        int unit;
        int sum;
        int cnt = 0;
        while (true) {
            cnt++;
            sum = (value / 10) + (value % 10);
            unit = (value % 10) * 10;
            unit += sum % 10;
            value = unit;
            if (input == value) {
                break;
            }
        }
        System.out.println(cnt);
    }
}
