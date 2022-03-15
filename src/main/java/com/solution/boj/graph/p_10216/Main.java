package src.main.java.com.solution.boj.graph.p_10216;

import java.util.Scanner;

//10216
public class Main {
	static final int MAX = 5001;
	static int[][] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();

		while (testCase-- > 0) {
			arr = new int[MAX][MAX];
			boolean[][] checkArr = new boolean[MAX][MAX];
			boolean[][] visit = new boolean[MAX][MAX];
			int N = sc.nextInt();
			int[] row = new int[N];
			int[] col = new int[N];
			for (int i = 0; i < N; i++) {
				row[i] = sc.nextInt();
				col[i] = sc.nextInt();
				arr[row[i]][col[i]] = sc.nextInt();
				checkArr(row[i], col[i], arr[row[i]][col[i]], checkArr);
			}

			int cnt = 0;
			for (int i = 0; i < N; i++) {
				if (checkArr[row[i]][col[i]] == true && visit[row[i]][col[i]] == false) {
					checkVisitArr(checkArr, visit, row[i], col[i]);
					cnt++;
				}
			}
			System.out.println(cnt);

		}
	}

	private static void checkVisitArr(boolean[][] checkArr, boolean[][] visit, int row, int col) {
		visit[row][col] = true;
		for (int i = 0; i < position.length; i++) {
			int afterRow = row + position[i][0];
			int afterCol = col + position[i][1];
			if (!isOutOfArrayIndex(afterRow, afterCol) && checkArr[afterRow][afterCol] == true && visit[afterRow][afterCol] == false) {
				checkVisitArr(checkArr, visit, afterRow, afterCol);
			}
		}
	}

	static int[][] position = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };

	private static void checkArr(int row, int col, int r, boolean[][] checkArr) {
		checkArr[row][col] = true;
		for (int i = 0; i < position.length; i++) {
			changeCheckArr(row + position[i][0], col + position[i][1], r - 1, checkArr, i);
		}
	}

	private static void changeCheckArr(int row, int col, int r, boolean[][] checkArr, int direction) {
		if (r < 0) {
			return;
		}
		if (!isOutOfArrayIndex(row, col)) {
			checkArr[row][col] = true;
			changeCheckArr(row + position[direction][0], col + position[direction][1], r - 1, checkArr, direction);
		}
	}

	private static boolean isOutOfArrayIndex(int row, int col) {
		return row < 0 || row >= arr.length || col < 0 || col >= arr[0].length;
	}
}
