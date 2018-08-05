package backjoon.BOJ.For.p_1188;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/1188
 * 음식 평론가
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int divResult = m / n;
		if (divResult == 1) {
			System.out.println(divResult * n);
		} else if (divResult == 0) {
			System.out.println((divResult) * n);
		} else {
			System.out.println((divResult - 1) * n);
		}
	}
}
