package backjoon.BOJ.print.p_11721;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/11721
 * 열 개씩 끊어 출력하기
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		for (int i = 1; i <= input.length(); i++) {
			System.out.print(input.substring(i - 1, i));
			if (i % 10 == 0) {
				System.out.println();
			}
		}
	}
}
