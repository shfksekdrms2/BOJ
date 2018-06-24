package backjoon.BOJ.basic.p_4659;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/4659
 * 비밀번호 발음하기
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String input = sc.nextLine();
			if (input.equals("end")) {
				break;
			}

			if (!checkVowel(input)) {
				print(input, false);
			} else if (!checkContinueVowel(input)) {
				print(input, false);
			} else if (!checkContinue(input)) {
				print(input, false);
			} else {
				print(input, true);
			}

		}
	}

	// 모음
	static char[] check = { 'a', 'e', 'i', 'o', 'u' };

	private static boolean checkContinue(String input) {
		for (int i = 1; i < input.length(); i++) {
			if (input.substring(i - 1, i).equals(input.substring(i, i + 1))) {
				if (input.substring(i, i + 1).equals("e") || input.substring(i, i + 1).equals("o")) {
					continue;
				}
				return false;
			}
		}
		return true;
	}

	private static boolean checkContinueVowel(String input) {
		int[] cnt = new int[2];
		boolean vowel = false;
		for (int i = 0; i < input.length(); i++) {
			vowel = false;
			for (int j = 0; j < check.length; j++) {
				if (input.substring(i, i + 1).equals("" + check[j])) {
					cnt[1]++;
					cnt[0] = 0;
					vowel = true;
					break;
				}
			}
			if (vowel == false) {
				cnt[1] = 0;
				cnt[0]++;
			}
			if (cnt[0] == 3 || cnt[1] == 3) {
				return false;
			}
		}
		return true;
	}

	private static void print(String input, boolean isBoolean) {
		if (isBoolean) {
			System.out.println("<" + input + "> is acceptable.");
		} else {
			System.out.println("<" + input + "> is not acceptable.");
		}
	}

	private static boolean checkVowel(String input) {
		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < check.length; j++) {
				if (input.substring(i, i + 1).equals("" + check[j])) {
					return true;
				}
			}
		}
		return false;
	}
}
