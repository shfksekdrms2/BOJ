package backjoon.BOJ.string.p_2804;

import java.util.Arrays;
import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/2804
 * 크로스 워드 만들기
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] A = sc.next().toCharArray();
		char[] B = sc.next().toCharArray();
		int i = 0, j = 0;

		char[][] result = new char[B.length][A.length];
		for (i = 0; i < result.length; i++) {
			Arrays.fill(result[i], '.');
		}

		boolean check = true;
		for (j = 0; j < A.length; j++) {
			for (i = 0; i < B.length; i++) {
				if (B[i] == A[j]) {
					check = false;
					break;
				}
			}
			if (!check) {
				break;
			}
		}
		int col = j;
		int row = i;

		for (i = 0; i < result.length; i++) {
			result[i][col] = B[i];
		}

		for (j = 0; j < result[0].length; j++) {
			result[row][j] = A[j];
		}

		for (i = 0; i < result.length; i++) {
			for (j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j]);
			}
			if (i != result.length - 1) {
				System.out.println();
			}
		}
	}
}
