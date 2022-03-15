package backjoon.BOJ.BFS.p_7562;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/7562
 * 나이트 이동
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();

		while (testCase-- > 0) {
			int length = sc.nextInt();
			boolean[][] arr = new boolean[length][length];
			int currRow = sc.nextInt();
			int currCol = sc.nextInt();
			int destRow = sc.nextInt();
			int destCol = sc.nextInt();

			System.out.println(BFS(arr, currRow, currCol, destRow, destCol));
		}

	}

	static int[][] position = { { 1, 2 }, { 2, 1 }, { 2, -1 }, { 1, -2 }, { -1, -2 }, { -2, -1 }, { -2, 1 }, { -1, 2 } };

	private static int BFS(boolean[][] arr, int currRow, int currCol, int destRow, int destCol) {

		int moveCnt = 0;
		Queue<Pair> queue = new LinkedList<>();
		queue.add(new Pair(currRow, currCol, 0));
		arr[currRow][currCol] = true;
		if (currRow == destRow && currCol == destCol) {
			return moveCnt;
		}

		while (!queue.isEmpty()) {
			int row = queue.peek().getRow();
			int col = queue.peek().getCol();
			moveCnt = queue.poll().getMoveCnt();
			for (int i = 0; i < position.length; i++) {
				int nextRow = row + position[i][0];
				int nextCol = col + position[i][1];
				if (!isArrayOutOfLength(arr, nextRow, nextCol) && arr[nextRow][nextCol] == false) {
					if (nextRow == destRow && nextCol == destCol) {
						queue.clear();
						break;
					}
					queue.add(new Pair(nextRow, nextCol, moveCnt + 1));
					arr[nextRow][nextCol] = true;
				}
			}
		}

		return moveCnt + 1;
	}

	private static boolean isArrayOutOfLength(boolean[][] arr, int row, int col) {
		return (arr.length <= row || row < 0 || col < 0 || col >= arr[0].length);
	}
}

class Pair {
	private int row;
	private int col;
	private int moveCnt;

	Pair(int row, int col, int moveCnt) {
		this.row = row;
		this.col = col;
		this.moveCnt = moveCnt;
	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}

	public int getMoveCnt() {
		return moveCnt;
	}

}
