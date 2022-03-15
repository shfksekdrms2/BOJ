package backjoon.BOJ.array.p_1159;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/1159
 * 농구 경기
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] arr = new char[26];
		for (int i = 0; i < n; i++) {
			String input = sc.next();
			arr[input.charAt(0) - 97]++;
		}

		boolean success = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 5) {
				System.out.print((char) (i + 97));
				success = true;
			}
		}

		if (!success) {
			System.out.println("PREDAJA");
		}

	}
}
