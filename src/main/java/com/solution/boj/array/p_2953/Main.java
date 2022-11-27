package com.solution.boj.array.p_2953;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/2953
 * 나는 요리사다
 */
public class Main {
	static int N = 5;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[N][N];
		int sum = 0;
		int maxValue = Integer.MIN_VALUE;
		int index = -1;
		for (int i = 0; i < N; i++) {
			sum = 0;
			for (int j = 0; j < N - 1; j++) {
				arr[i][j] = sc.nextInt();
				sum += arr[i][j];
			}
			if (maxValue < sum) {
				maxValue = sum;
				index = i + 1;
			}
		}
		System.out.println(index + " " + maxValue);
	}
}
