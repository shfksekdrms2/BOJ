package src.main.java.com.solution.boj.graph.p_1890;

import java.util.Scanner;

//1890
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		boolean[][] visit = new boolean[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println((findJumpCnt(arr, 0, 0, visit)));
	}

	static boolean isOutOfArraySize(int[][] arr, int row, int col) {

		return (row < 0 || row >= arr.length || col < 0 || col >= arr[0].length);
	}

	static int findJumpCnt(int[][] arr, int row, int col, boolean[][] visit) {
		int cnt = 0;
		if (row == arr.length - 1 && col == arr[row].length - 1) {
			return 1;
		}
		// move down
		if (!isOutOfArraySize(arr, row + arr[row][col], col)) {
			cnt += findJumpCnt(arr, row + arr[row][col], col, visit);
		}

		// move right
		if (!isOutOfArraySize(arr, row, col + arr[row][col])) {
			cnt += findJumpCnt(arr, row, col + arr[row][col], visit);
		}

		return cnt;
	}
}
