package com.solution.boj.p_11022;

import java.util.Scanner;

public class P_11022 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < length; i++) {
            String[] s = sc.nextLine().split(" ");
            int a = Integer.valueOf(s[0]);
            int b = Integer.valueOf(s[1]);

            System.out.println("Case #" + (i + 1) + ": " + a + " + " + b + " = " + (a + b));
        }
    }
}
