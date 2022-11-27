package com.solution.boj.array.p_3052;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/3052
 * 나머지
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[42];
		for (int i = 0; i < 10; i++) {
			int input = sc.nextInt();
			arr[input % 42]++;
		}

		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 1) {
				result++;
			}
		}
		System.out.println(result);
	}
}
