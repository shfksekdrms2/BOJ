package backjoon.BOJ.For.p_3035;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/3035
 * 스캐너
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int zr = sc.nextInt();
		int zc = sc.nextInt();

		sc.nextLine();
		char[][] arr = new char[r][c];
		for (int i = 0; i < r; i++) {
			arr[i] = sc.nextLine().toCharArray();
		}

		char[][] result = new char[r * zr][c * zc];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				for (int k = 0; k < zr; k++) {
					for (int l = 0; l < zc; l++) {
						result[i * zr + k][j * zc + l] = arr[i][j];
					}
				}
			}
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}

	}
}
