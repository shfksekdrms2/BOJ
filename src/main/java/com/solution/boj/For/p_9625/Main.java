package backjoon.BOJ.For.p_9625;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/9625
 * BABBA
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();

		int a = 1;
		int b = 0;
		int temp = b;
		for (int i = 0; i < k; i++) {
			temp = b;
			b += a;
			a = temp;
		}
		System.out.println(a + " " + b);
	}
}
