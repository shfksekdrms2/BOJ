package com.solution.boj.string.p_1120;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/1120
 * 문자열
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] a = sc.next().toCharArray();
		char[] b = sc.next().toCharArray();

		int resultCnt = Integer.MAX_VALUE;
		for (int i = 0; i <= b.length - a.length; i++) {
			int cnt = 0;
			for (int j = i; j < a.length + i; j++) {
				if (a[j - i] != b[j]) {
					cnt++;
				}
			}
			resultCnt = Integer.min(resultCnt, cnt);
		}

		System.out.println(resultCnt);
	}
}
