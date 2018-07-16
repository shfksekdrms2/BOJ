package backjoon.BOJ.For.p_8974;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/8974
 * 희주의 수학시험
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();

		int index = 1;
		int sum = 0;

		for (int i = 1; i <= end; i++) {
			for (int j = 0; j < i; j++) {
				if (index >= start && index <= end) {
					sum += i;
				}
				index++;
			}
		}
		System.out.println(sum);
	}
}
