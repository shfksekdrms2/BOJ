package backjoon.BOJ.matrix.p_10830;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/10830
 * 행렬 제곱
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long b = sc.nextLong();

		long[][] arr = new long[n][n];
		long[][] copyArr1 = new long[n][n];
		long[][] copyArr2 = new long[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = copyArr1[i][j] = copyArr2[i][j] = sc.nextInt();
			}
		}

		for (long i = 0; i < b - 1; i++) {

			for (int m = 0; m < n; m++) {
				for (int o = 0; o < n; o++) {
					copyArr2[m][o] = copyArr1[m][o];
				}
			}

			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					long sum = 0;
					for (int l = 0; l < n; l++) {
						sum += copyArr2[j][l] * arr[l][k];
					}
					copyArr1[j][k] = sum % 1000;
				}
			}
		}

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sb.append(copyArr1[i][j] + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
