package backjoon.BOJ.string.p_2987;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/2897
 * 몬스터 트럭
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		char[][] map = new char[row][col];
		int[] cnt = new int[5];

		sc.nextLine();
		for (int i = 0; i < row; i++) {
			map[i] = sc.nextLine().toCharArray();
		}

		for (int i = 0; i < map.length - 1; i++) {
			for (int j = 0; j < map[i].length - 1; j++) {
				findParkingAreaCnt(map, cnt, i, j);
			}
		}
		printCnt(cnt);
	}

	private static void printCnt(int[] cnt) {
		for (int i = 0; i < cnt.length; i++) {
			System.out.println(cnt[i]);
		}
	}

	static int[][] parkingArea = { { 0, 0 }, { 1, 0 }, { 1, 1 }, { 0, 1 } };

	private static void findParkingAreaCnt(char[][] map, int[] cnt, int startRow, int startCol) {
		int parkingCar = 0;
		for (int i = 0; i < parkingArea.length; i++) {
			int nextRow = startRow + parkingArea[i][0];
			int nextCol = startCol + parkingArea[i][1];
			if (map[nextRow][nextCol] == '#') {
				return;
			} else if (map[nextRow][nextCol] == 'X') {
				parkingCar++;
			}
		}
		cnt[parkingCar]++;
	}
}
