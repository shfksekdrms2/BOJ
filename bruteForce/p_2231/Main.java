package backjoon.BOJ.bruteForce.p_2231;

import java.util.Scanner;

//2231
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int value, sum = 0;

		for (int i = 1; i <= n; i++) {
			value = i;
			sum = 0;
			while (value != 0) {
				sum += (value % 10);
				value /= 10;
			}
			sum += i;
			if (sum == n) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
	}
}
