package backjoon.BOJ.DAC.p_1780;

import java.util.Scanner;

//1780
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				arr[i][j] = sc.nextInt();
		}

		int[] result = new int[3];
		findPaperCnt(arr, result, 0, arr[0].length, 0, arr.length);

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	static void findPaperCnt(int[][] arr, int[] result, int startRow, int endRow, int startCol, int endCol) {
		System.out.println("startRow: " + startRow + " endRow: " + endRow + " startCol: " + startCol + " endCol: " + endCol);
		if (endRow == startRow + 1) {
			result[arr[startRow][startCol] + 1]++;
			return;
		}

		boolean notSearchSameValue = true;
		int firstValue = arr[startRow][startCol];
		for (int i = startRow; i < endRow; i++) {
			for (int j = startCol; j < endCol; j++) {
				if (firstValue != arr[i][j]) {
					notSearchSameValue = false;
				}
			}
		}

		if (notSearchSameValue) {
			result[arr[startRow][startCol] + 1]++;
		} else {
			System.out.println("test");
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					findPaperCnt(arr, result, (endRow / 3) * i, (endRow / 3) * (i + 1), (endCol / 3) * j, (endCol / 3) * (j + 1));
				}
			}
		}
	}
}
