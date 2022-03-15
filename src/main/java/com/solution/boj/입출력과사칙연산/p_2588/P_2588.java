package com.solution.boj.입출력과사칙연산.p_2588;

import java.util.Scanner;

public class P_2588 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Integer a = Integer.parseInt(sc.next());
        String[] b = sc.next().split("");

        int sum = 0;
        for (int i = b.length - 1; i >= 0; i--) {
            int intB = Integer.parseInt(b[i]);

            sum += (a * intB * Math.pow(10, b.length - 1 - i));
            System.out.println(a * intB);
        }

        System.out.println(sum);
    }
}
