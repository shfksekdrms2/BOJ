package backjoon.BOJ.dynamic.p_9095;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/9095
 * 1, 2, 3 더하기
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();

		int[] arr = new int[12];
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;

		for (int i = 4; i <= 11; i++) {
			arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
		}

		while (testCase-- > 0) {
			int n = sc.nextInt();
			System.out.println(arr[n]);
		}
	}
}
