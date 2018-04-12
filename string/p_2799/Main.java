package backjoon.BOJ.string.p_2799;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/2799
 * 블라인드
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();

		char[][] arr = new char[5 * m + 1][5 * n + 1];

		for (int i = 0; i < 5 * m + 1; i++) {
			arr[i] = sc.next().toCharArray();
		}

		int[] result = new int[5];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				int position = 0;
				for (int k = 0; k < 4; k++) {
					if (arr[5 * i + 1 + k][5 * j + 1] == '*') {
						position++;
					} else {
						result[position]++;
						break;
					}
				}
				if (position == 4) {
					result[position]++;
				}
			}
		}

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}

	}
}
