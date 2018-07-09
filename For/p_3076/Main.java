package backjoon.BOJ.For.p_3076;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/3076
 * 상근이의 체스판
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		char[][] arr = new char[row * a][col * b];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				for (int k = 0; k < a; k++) {
					for (int l = 0; l < b; l++) {
						if ((i + j) % 2 == 0) {
							arr[i * a + k][j * b + l] = 'X';
						} else {
							arr[i * a + k][j * b + l] = '.';
						}
					}
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
