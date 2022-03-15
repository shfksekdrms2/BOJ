package backjoon.BOJ.parshing.p_1388;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/1388
 * 바닥 장식
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();

		char[][] arr = new char[row][col];
		for (int i = 0; i < row; i++) {
			arr[i] = sc.next().toCharArray();
		}
		boolean[][] isBoolean = new boolean[row][col];
		int result = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (isBoolean[i][j] == false) {
					DFS(arr, isBoolean, i, j, arr[i][j]);
					result++;
				}
			}
		}
		System.out.println(result);
	}

	static int[] colPosition = { 1, 0 };
	static int[] rowPosition = { 0, 1 };

	private static void DFS(char[][] arr, boolean[][] isBoolean, int row, int col, char value) {
		isBoolean[row][col] = true;
		// System.out.println("row: "+ row+" col: "+col + "value: "+ value);
		int length = rowPosition.length;
		for (int i = 0; i < length; i++) {
			int nextRow;
			int nextCol;
			if (value == '-') {
				nextRow = row + rowPosition[0];
				nextCol = col + rowPosition[1];
			} else {
				nextRow = row + colPosition[0];
				nextCol = col + colPosition[1];
			}
			if (!isOutOfArrayIndex(arr, nextRow, nextCol) && isBoolean[nextRow][nextCol] == false && arr[nextRow][nextCol] == value) {
				DFS(arr, isBoolean, nextRow, nextCol, value);
			}
		}

	}

	private static boolean isOutOfArrayIndex(char[][] arr, int row, int col) {
		return (arr.length <= row || row < 0 || col < 0 || col >= arr[0].length);
	}
}
