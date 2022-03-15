package src.main.java.com.solution.boj.graph.p_3184;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/3184
 * 양
 */
public class Main {
	static int sheep = 0;
	static int wolf = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		char[][] arr = new char[row][col];
		boolean[][] visit = new boolean[row][col];

		for (int i = 0; i < row; i++) {
			arr[i] = sc.next().toCharArray();
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == '#') {
					visit[i][j] = true;
				}
			}
		}

		int totalSheepCnt = 0;
		int totalWolfCnt = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (visit[i][j] == false) {
					compareSheepAndWolf(arr, visit, i, j);
//					System.out.println("row: " + i + " col: " + j);
//					System.out.println("sheep: " + sheep + " wolf: " + wolf);
					if (sheep <= wolf) {
						totalWolfCnt += wolf;
					} else {
						totalSheepCnt += sheep;
					}
					sheep = 0;
					wolf = 0;
				}
			}
		}
		System.out.println(totalSheepCnt + " " + totalWolfCnt);
	}

	static int[][] direction = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

	private static void compareSheepAndWolf(char[][] arr, boolean[][] visit, int row, int col) {
		visit[row][col] = true;
		if (arr[row][col] == 'o') {
			sheep++;
		} else if (arr[row][col] == 'v') {
			wolf++;
		}
		for (int i = 0; i < direction.length; i++) {
			int nextRow = row + direction[i][0];
			int nextCol = col + direction[i][1];
			if (!outOfArrayLength(arr, nextRow, nextCol) && !visit[nextRow][nextCol]) {
				compareSheepAndWolf(arr, visit, nextRow, nextCol);
			}
		}
	}

	private static boolean outOfArrayLength(char[][] arr, int nextRow, int nextCol) {
		return (nextRow >= arr.length || nextRow < 0 || nextCol >= arr[0].length || nextCol < 0);
	}
}
