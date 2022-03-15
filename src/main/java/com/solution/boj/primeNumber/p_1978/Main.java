package backjoon.BOJ.primeNumber.p_1978;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/1978
 * 소수 찾기
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int result = 0;
		int i;
		while (n-- > 0) {
			int input = sc.nextInt();

			for (i = 2; i < input; i++) {
				if (input % i == 0) {
					break;
				}
			}
			
			if (i == input) {
				result++;
			}
		}
		System.out.println(result);
	}
}
