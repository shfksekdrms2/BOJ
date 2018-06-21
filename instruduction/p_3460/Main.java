package backjoon.BOJ.instruduction.p_3460;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/3460
 * 이진수
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();

		while (testCase-- > 0) {
			int n = sc.nextInt();
			ArrayList<Integer> result = new ArrayList<>();
			while (n > 1) {
				int remain = n % 2;
				result.add(remain);
				n /= 2;
			}
			result.add(1);

			for (int i = 0; i < result.size(); i++) {
				if (result.get(i) == 1) {
					System.out.print(i + " ");
				}
			}
		}
	}
}
