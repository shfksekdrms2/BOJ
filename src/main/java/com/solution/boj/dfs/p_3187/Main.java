package backjoon.BOJ.DFS.p_3187;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/3187
 * 양치기 꿍
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
		boolean[][] visited = new boolean[row][col];

		Pair result = new Pair(0, 0);
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (arr[i][j] != '#' && visited[i][j] == false) {
					Pair pair = DFS(arr, visited, i, j, new Pair(0, 0));
					if (!(pair.getWolf() == 0 && pair.getSheep() == 0)) {
						if (pair.getWolf() >= pair.getSheep()) {
							result.setWolf(result.getWolf() + pair.getWolf());
						} else {
							result.setSheep(result.getSheep() + pair.getSheep());
						}
					}
				}
			}
		}
		System.out.println(result.getSheep() + " " + result.getWolf());

	}

	static int[][] position = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

	private static Pair DFS(char[][] arr, boolean[][] visited, int row, int col, Pair pair) {

		visited[row][col] = true;
		if (arr[row][col] == 'v') {
			pair.setWolf(pair.getWolf() + 1);
		} else if (arr[row][col] == 'k') {
			pair.setSheep(pair.getSheep() + 1);
		}
		for (int i = 0; i < position.length; i++) {
			int nextRow = row + position[i][0];
			int nextCol = col + position[i][1];
			if (!isOutOfArray(arr, nextRow, nextCol) && !visited[nextRow][nextCol] && arr[nextRow][nextCol] != '#') {
				DFS(arr, visited, nextRow, nextCol, pair);
			}
		}
		return pair;
	}

	private static boolean isOutOfArray(char[][] arr, int nextRow, int nextCol) {
		return (arr.length <= nextRow || nextRow < 0 || nextCol >= arr[0].length || nextCol < 0);
	}
}

class Pair {
	private int sheep;
	private int wolf;

	Pair(int sheep, int wolf) {
		this.sheep = sheep;
		this.wolf = wolf;
	}

	public int getSheep() {
		return sheep;
	}

	public void setSheep(int sheep) {
		this.sheep = sheep;
	}

	public void setWolf(int wolf) {
		this.wolf = wolf;
	}

	public int getWolf() {
		return wolf;
	}

}
