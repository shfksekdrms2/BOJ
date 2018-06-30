package backjoon.BOJ.preprocessing.p_2357;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/2357
 * 최소값과 최대값
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < m; i++) {
			int minValue = Integer.MAX_VALUE;
			int maxValue = Integer.MIN_VALUE;
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			for (int j = a; j <= b; j++) {
				minValue = Integer.min(minValue, arr[j]);
				maxValue = Integer.max(maxValue, arr[j]);
			}
			System.out.println(minValue + " " + maxValue);
		}
	}
}
