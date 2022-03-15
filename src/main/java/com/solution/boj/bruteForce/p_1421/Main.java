package backjoon.BOJ.bruteForce.p_1421;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/1421
 * 나무꾼 이다솜
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int w = sc.nextInt();
		int[] input = new int[n];

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			input[i] = sc.nextInt();
			max = Integer.max(max, input[i]);
		}

		System.out.println(calcMaxCost(input, c, w, max));

	}

	private static int calcMaxCost(int[] input, int c, int w, int max) {

		int beforCnt = 0, cnt = 0;
		int result = Integer.MIN_VALUE;
		System.out.println("max: " + max);
		for (int i = 1; i <= max; i++) {
			cnt = 0;
			for (int j = 0; j < input.length; j++) {
				beforCnt = cnt;
				cnt += input[j] / i;
			}
			System.out.println("cnt: " + cnt);
			if (i * w - c > 0) {
				System.out.println("enter");
				result = Integer.max(result, cnt * (i * w - c));
			}
		}

		return result;
	}
}
