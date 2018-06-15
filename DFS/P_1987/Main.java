package backjoon.BOJ.DFS.P_1987;

import java.util.ArrayList;
import java.util.Scanner;

import jdk.nashorn.internal.runtime.regexp.joni.constants.OPSize;

/*
 * https://www.acmicpc.net/problem/1987
 * 알파벳
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

		// for (int i = 0; i < row; i++) {
		// for (int j = 0; j < col; j++) {
		// System.out.print(arr[i][j] + " ");
		// }
		// System.out.println();
		// }

		ArrayList<Character> list = new ArrayList<>();
		list.add(arr[0][0]);
		System.out.println(DFS(arr, list, 0, 0, 1));

	}

	static int maxValue = 1;
	static int[][] position = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

	private static int DFS(char[][] arr, ArrayList<Character> list, int row, int col, int cnt) {

		maxValue = Integer.max(maxValue, cnt);
		for (int i = 0; i < position.length; i++) {
			int nextRow = row + position[i][0];
			int nextCol = col + position[i][1];
			if (!isOutOfArrayLength(arr, nextRow, nextCol) && !list.contains(arr[nextRow][nextCol])) {
				list.add(arr[nextRow][nextCol]);
				DFS(arr, list, nextRow, nextCol, cnt + 1);
				list.remove(list.indexOf(arr[nextRow][nextCol]));
			}
		}
		return maxValue;
	}

	private static boolean isOutOfArrayLength(char[][] arr, int nextRow, int nextCol) {
		return (arr.length <= nextRow || 0 > nextRow || arr[0].length <= nextCol || 0 > nextCol);
	}
}
