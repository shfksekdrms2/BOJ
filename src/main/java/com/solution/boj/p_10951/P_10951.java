package com.solution.boj.p_10951;

import java.util.Scanner;

/**
 * 10951
 *
 * @Author: jsj0828
 **/
public class P_10951 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String s = sc.nextLine();
            String[] split = s.split(" ");
            int value = Integer.valueOf(split[0]) + Integer.valueOf(split[1]);
            System.out.println(value);
        }

    }
}
