package backjoon.BOJ.DFS.p_11724;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/11724
 * 연결 요소의 개수
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		boolean[] visited = new boolean[n + 1];

		for (int i = 0; i < n + 1; i++) {
			list.add(new ArrayList<>());
		}

		while (m-- > 0) {
			int u = sc.nextInt();
			int v = sc.nextInt();

			list.get(u).add(v);
			list.get(v).add(u);
		}

		int result = 0;
		for (int i = 1; i < n + 1; i++) {
			if (!visited[i]) {
				DFS(visited, list, i);
				result++;
			}
		}
		System.out.println(result);
	}

	private static void DFS(boolean[] visited, ArrayList<ArrayList<Integer>> list, int start) {
		visited[start] = true;

		for (int i = 0; i < list.get(start).size(); i++) {
			if (!visited[list.get(start).get(i)]) {
				DFS(visited, list, list.get(start).get(i));
			}
		}
	}
}
