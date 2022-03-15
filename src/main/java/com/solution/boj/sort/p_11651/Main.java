package com.solution.boj.sort.p_11651;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/11651
 * 좌표 정렬하기 2
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Pair> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Pair(sc.nextInt(), sc.nextInt()));
        }

        Collections.sort(list, new mySort());
        for (Pair pair : list) {
            System.out.println(pair.getLeft() + " " + pair.getRight());
        }
    }
}

class mySort implements Comparator<Pair> {

    public int compare(Pair o1, Pair o2) {
        if (o1.getRight() != o2.getRight()) {
            return o1.getRight() - o2.getRight();
        } else {
            return o1.getLeft() - o2.getLeft();
        }
    }
}

class Pair {
    private int left;
    private int right;

    Pair(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }
}