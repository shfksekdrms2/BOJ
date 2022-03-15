package backjoon.BOJ.For.p_2783;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/2783
 * 삼각 김밥
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		int testCase = sc.nextInt();

		double minValue = Float.MAX_VALUE;
		minValue = Double.min(minValue, (x1 / y1) * 1000);
		for (int i = 0; i < testCase; i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			minValue = Double.min(minValue, (x / y) * 1000);
		}
		System.out.printf("%.2f", minValue);
	}
}
