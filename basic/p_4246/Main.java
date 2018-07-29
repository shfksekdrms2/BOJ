package backjoon.BOJ.basic.p_4246;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/4246
 * To and Fro
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			String str = sc.next();
			char[][] arr = new char[str.length() / n][n];
			for (int i = 0; i < arr.length; i = i + 2) {
				arr[i] = str.substring(i * n, (i + 1) * n).toCharArray();
			}
			for (int i = 1; i < arr.length; i = i + 2) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = str.substring((i + 1) * n - 1 - j, (i + 1) * n - j).charAt(0);
				}
			}

			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < arr.length; j++) {
					sb.append(arr[j][i]);
				}
			}
			System.out.println(sb.toString());
		}

	}
}
