package backjoon.BOJ.search.p_1568;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/1568
 * 새
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int cnt = 1;
		int result = 1;
		int remain = n;
		while (true) {
			if (remain - cnt < 0) {
				cnt = 1;
			}
			remain -= cnt;
			
			if (remain == 0) {
				break;
			}
			cnt++;
			result++;
		}
		System.out.println(result);
	}
}
