package backjoon.BOJ.DFS.p_2583;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/2583
 * 영역 구하기
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int col = sc.nextInt();
		int row = sc.nextInt();
		int k = sc.nextInt();
		int[][] arr = new int[row][col];
		while (k-- > 0) {
			int startRow = sc.nextInt();
			int startCol = sc.nextInt();
			int endRow = sc.nextInt();
			int endCol = sc.nextInt();

			// System.out.println("startRow: " + startRow + " startCol: " +
			// startCol + " endRow: " + endRow + " endCol: " + endCol);
			for (int i = startRow; i < endRow; i++) {
				for (int j = startCol; j < endCol; j++) {
					arr[i][j] = 1;
				}
			}
		}
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-----------");
		
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (arr[i][j] == 0) {
					list.add(findAreaRange(arr, i, j) + 1);
				}
			}
		}
		
		for (Integer integer : list) {
			System.out.print(integer+" ");
		}



	}

	final static int[][] position = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

	private static int findAreaRange(int[][] arr, int row, int col) {

		System.out.println("row: "+row+" col: "+col);
		arr[row][col] = 1;
		int result = 1;
		for (int i = 0; i < position.length; i++) {
			int nextRow = row + position[i][0];
			int nextCol = col + position[i][1];
			if (!isOutOfArrayIndex(arr, nextRow, nextCol)) {
				if (arr[nextRow][nextCol] == 1) {
					result = findAreaRange(arr, nextRow, nextCol) + 1;
				}
			}
		}

		return result;
	}

	private static boolean isOutOfArrayIndex(int[][] arr, int row, int col) {
		return (row < 0 || row >= arr.length || col < 0 || col >= arr[0].length);
	}
}
