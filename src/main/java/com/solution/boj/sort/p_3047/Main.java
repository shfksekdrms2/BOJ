package com.solution.boj.sort.p_3047;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/3047
 * ABC
 */
public class Main {
    static final int length = 3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);

        char[] print = sc.next().toCharArray();
        for (int i = 0; i < length; i++) {
            switch (print[i]) {
                case 'A':
                    System.out.print(list.get(0) + " ");
                    break;
                case 'B':
                    System.out.print(list.get(1) + " ");
                    break;
                case 'C':
                    System.out.print(list.get(2) + " ");
                    break;
            }
        }
    }
}
