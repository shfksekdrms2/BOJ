package backjoon.BOJ.BFS.p_1389;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/1389
 * 케빈 베이컨의 6단계 법칙
 */
public class Main {
	static int[][] relation;
	static boolean[] bool;;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		relation = new int[n][n];
		bool = new boolean[n];
		int m = sc.nextInt();

		int row, col;
		for (int i = 0; i < m; i++) {
			row = sc.nextInt() - 1;
			col = sc.nextInt() - 1;
			relation[row][col] = relation[col][row] = 1;
		}

		long minRelation = Integer.MAX_VALUE;
		int number = 0;
		long result;
		for (int i = 0; i < n; i++) {
			if (minRelation > (result = sumBFS(relation, i))) {
				number = i + 1;
				minRelation = result;
			}
		}
		System.out.println(number);
	}

	private static long sumBFS(int[][] relation, int start) {
		long sum = 0;
		for (int i = 0; i < relation.length; i++) {
			if (start == i) {
				continue;
			}
			sum += BFS(relation, start, i);
		}
		return sum;
	}

	private static long BFS(int[][] relation, int start, int dest) {
		Queue<Pair> queue = new LinkedList<Pair>();
		queue.add(new Pair(start, 0));
		Arrays.fill(bool, false);
		bool[start] = true;
		long sum = 0;

		while (!queue.isEmpty()) {
			int currPosition = queue.peek().getPosition();
			sum = queue.poll().getSum();
			for (int i = 0; i < relation.length; i++) {
				if (i == currPosition) {
					continue;
				}
				if (relation[currPosition][i] == 1 && bool[i] == false) {
					queue.add(new Pair(i, sum + 1));
					bool[i] = true;
					if (i == dest) {
						queue.clear();
						break;
					}
				}
			}
		}

		return sum + 1;
	}
}

class Pair {
	private int position;
	private long sum;

	Pair(int position, long sum) {
		this.position = position;
		this.sum = sum;
	}

	public int getPosition() {
		return position;
	}

	public long getSum() {
		return sum;
	}

}
