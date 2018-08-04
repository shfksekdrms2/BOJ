package backjoon.BOJ.For.p_2992;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/2992
 * 크면서 작은 수
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int x = sc.nextInt();
		char[] charX = sc.next().toCharArray();
		int minOfMax = Integer.MAX_VALUE;

		int[] values = new int[factorial(charX.length)];

		allValues(values, charX, 0, charX.length);
	}

	private static void allValues(int[] values, char[] charX, int index, int length) {
		
		String str = "";
		for(int i=0; i<length; i++){
			str += charX[i];
		}
	}

	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		}
		return factorial(n - 1) * n;
	}
}
