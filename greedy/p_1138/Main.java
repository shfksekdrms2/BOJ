package backjoon.BOJ.greedy.p_1138;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/1138
 * 한 줄로 서기
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] remember = new int[N];
		for (int i = 0; i < N; i++)
			remember[i] = sc.nextInt();

		LinkedList<Integer> seq = new LinkedList<Integer>();
		for (int i = N - 1; i >= 0; i--) {
			seq.add(remember[i], i + 1);
		}
		for (Integer i : seq)
			System.out.print(i + " ");
		System.out.println();
	}

}
