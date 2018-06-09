package backjoon.BOJ.BFS.p_1389;

import java.util.ArrayList;
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
		bool = new boolean[relation.length];
		int m = sc.nextInt();

		for (int i = 0; i < m; i++) {
			int row = sc.nextInt() - 1;
			int col = sc.nextInt() - 1;
			relation[row][col] = relation[col][row] = 1;
		}

		int minRelation = Integer.MAX_VALUE;
		int number = 0;
		int result;
		for (int i = 0; i < m; i++) {
			if (minRelation > (result = sumBFS(relation, i))) {
				number = i + 1;
				minRelation = result;
			}
		}
		System.out.println(number);

	}

	private static int sumBFS(int[][] relation, int start) {
		int sum = 0;
		for (int i = 0; i < relation.length; i++) {
			if (start == i) {
				continue;
			}
			sum += BFS(relation, start, i);
		}
		return sum;
	}

	private static int BFS(int[][] relation, int start, int dest) {
		Queue<Pair> queue = new LinkedList<Pair>();
		queue.add(new Pair(start, 0));
		Arrays.fill(bool, false);
		bool[start] = true;
		int sum = 0;

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
	private int sum;

	Pair(int position, int sum) {
		this.position = position;
		this.sum = sum;
	}

	public int getPosition() {
		return position;
	}

	public int getSum() {
		return sum;
	}

}
