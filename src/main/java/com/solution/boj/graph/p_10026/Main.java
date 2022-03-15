package src.main.java.com.solution.boj.graph.p_10026;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/10026
 * 적록 색약
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[][] arrNormal = new char[n][n];
		char[][] arrDisabled = new char[n][n];
		boolean[][] visitNormal = new boolean[n][n];
		boolean[][] visitDisabled = new boolean[n][n];
		char[] input;

		for (int i = 0; i < n; i++) {
			input = sc.next().toCharArray();
			for (int j = 0; j < n; j++) {
				arrNormal[i][j] = input[j];

				if (input[j] == 'G') {
					arrDisabled[i][j] = 'R';
				} else {
					arrDisabled[i][j] = input[j];
				}
			}
		}

		int normalCnt = 0;
		int disabledCnt = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!visitNormal[i][j]) {
					findAreaCnt(arrNormal, visitNormal, arrNormal[i][j], i, j);
					normalCnt++;
				}

				if (!visitDisabled[i][j]) {
					findAreaCnt(arrDisabled, visitDisabled, arrDisabled[i][j], i, j);
					disabledCnt++;
				}
			}
		}
		System.out.println(normalCnt + " " + disabledCnt);
	}

	static int[][] direction = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

	private static void findAreaCnt(char[][] arr, boolean[][] visit, char findChar, int row, int col) {
		visit[row][col] = true;

		for (int i = 0; i < direction.length; i++) {
			int nextRow = row + direction[i][0];
			int nextCol = col + direction[i][1];
			if (!outOfArrayLength(arr, nextRow, nextCol) && !visit[nextRow][nextCol] && arr[nextRow][nextCol] == findChar) {
				findAreaCnt(arr, visit, findChar, nextRow, nextCol);
			}
		}
	}

	private static boolean outOfArrayLength(char[][] arr, int nextRow, int nextCol) {
		return (nextRow >= arr.length || nextRow < 0 || nextCol >= arr[0].length || nextCol < 0);
	}
}
