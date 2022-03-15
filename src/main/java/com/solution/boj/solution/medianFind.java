package com.solution.boj.solution;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

//2696
public class medianFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        LinkedList<Integer> list;
        LinkedList<Integer> listCopy;
        int i, j;
        int size;
        int cnt;
        for (i = 0; i < t; i++) {
            list = new LinkedList<>();
            listCopy = new LinkedList<>();
            cnt = 0;
            size = sc.nextInt();
            for (j = 0; j < size; j++) {
                list.add(sc.nextInt());
                if (j % 2 == 0) {
                    Collections.sort(list);
                    listCopy.add(list.get((j + 1) / 2));
                    cnt++;
                }
            }
            System.out.println(cnt);
            for (j = 0; j < cnt; j++) {
                if (j != 0 && j % 10 == 0) {
                    System.out.println();
                }
                System.out.print(listCopy.get(j) + " ");
            }
            System.out.println();
        }
    }
}
