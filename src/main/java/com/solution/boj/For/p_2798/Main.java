package backjoon.BOJ.For.p_2798;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/2798
 * 블랙잭
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int first = 0;
		int second = 0;
		int third = 0;
		int maxNumber = Integer.MIN_VALUE;
		for (int i = 0; i < n - 2; i++) {
			first = arr[i];
			for (int j = i + 1; j < n - 1; j++) {
				second = arr[j];
				for (int k = j + 1; k < n; k++) {
					third = arr[k];
					if (first + second + third <= m) {
						maxNumber = Integer.max(maxNumber, first + second + third);
					}
				}
			}
		}

		System.out.println(maxNumber);

	}
}
