package backjoon.BOJ.array.p_1773;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/1773
 * 폭죽쇼
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();

		boolean[] arr = new boolean[c + 1];
		int result = 0;
		while (n-- > 0) {
			int num = sc.nextInt();
			int i = 1;
			while (num * i <= c) {
				if (arr[i * num] == false) {
					arr[i * num] = true;
					result++;
				}
				i++;
			}
		}

		System.out.println(result);
	}
}
