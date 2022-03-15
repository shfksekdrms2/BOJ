package com.solution.boj.sort.p_1431;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/1431
 * 시리얼 번호
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }
        Collections.sort(list, new mySort());

        for (String str : list) {
            System.out.println(str);
        }
    }
}

class mySort implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() != o2.length()) {
            return o1.length() - o2.length();
        } else {
            int[] sum = new int[2];
            for (int i = 0; i < o1.length(); i++) {
                if (o1.charAt(i) >= '1' && o1.charAt(i) <= '9') {
                    sum[0] += (int) o1.charAt(i) - 48;
                }
                if (o2.charAt(i) >= '1' && o2.charAt(i) <= '9') {
                    sum[1] += (int) o2.charAt(i) - 48;
                }
            }
            if (sum[0] != sum[1]) {
                return sum[0] - sum[1];
            } else {
                for (int i = 0; i < o1.length(); i++) {
                    if (o1.charAt(i) != o2.charAt(i)) {
                        return o1.charAt(i) - o2.charAt(i);
                    }
                }
            }
        }
        return 0;
    }

}