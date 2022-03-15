package com.solution.boj.sort.p_1818;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/1818
 * 책정리
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        ArrayList<Integer> books = new ArrayList<>();

        for (int i = 0; i < cnt; i++) {
            books.add(sc.nextInt());
        }

        int result = 0;
        for (int i = 0; i < cnt; i++) {
            if (books.get(i) == i + 1) {
                continue;
            }
            books.add(i, books.remove(books.indexOf(i + 1)));
            result++;
        }
        System.out.println(result);
    }
}
