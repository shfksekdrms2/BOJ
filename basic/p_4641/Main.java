package backjoon.BOJ.basic.p_4641;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/4641
 * Doubles
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String[] str = sc.nextLine().split(" ");
			if (str[0].equals("-1")) {
				break;
			}
			int cnt = 0;
			for (int i = 0; i < str.length - 1; i++) {
				int value = Integer.parseInt(str[i]);
				for (int j = 0; j < str.length - 1; j++) {
					if (Integer.parseInt(str[j]) == value * 2) {
						cnt++;
						break;
					}
				}
			}
			System.out.println(cnt);
		}

	}
}
