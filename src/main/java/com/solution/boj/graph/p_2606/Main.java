package src.main.java.com.solution.boj.graph.p_2606;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//2606
public class Main {
	static boolean[] visit;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int computerCnt = sc.nextInt();
		int networkCnt = sc.nextInt();
		int[][] arr = new int[computerCnt][computerCnt];
		visit = new boolean[computerCnt];

		while (networkCnt-- > 0) {
			int row = sc.nextInt() - 1;
			int col = sc.nextInt() - 1;
			arr[row][col] = 1;
			arr[col][row] = 1;
		}

		System.out.println(findVirusComputerCnt(arr, 0));
	}

	static int findVirusComputerCnt(int[][] arr, int startRow) {
		Queue<Integer> queue = new LinkedList<>();
		int cnt = 0;
		queue.add(startRow);
		visit[startRow] = true;

		while (!queue.isEmpty()) {
			int row = queue.poll();

			for (int i = 0; i < arr[row].length; i++) {
				if (visit[i] == false && arr[row][i] == 1) {
					queue.add(i);
					visit[i] = true;
					cnt++;
				}
			}

		}

		return cnt;
	}
}
