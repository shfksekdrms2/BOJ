package backjoon.BOJ.dynamic.p_11052;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/11052
 * 붕어빵 판매하기
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] result = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		result[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			result[i] = arr[i];
			for (int j = 0; j < i; j++) {
				result[i] = Integer.max(result[i], result[j] + result[i - j - 1]);
			}
		}

		System.out.println(result[n - 1]);
	}
}
