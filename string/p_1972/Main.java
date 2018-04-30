package backjoon.BOJ.string.p_1972;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 * https://www.acmicpc.net/problem/1972
 * 놀라운 문자열
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		char[] inputChar;

		boolean isSurprisingString = true;
		while ((input = br.readLine()) != null) {
			if (input.equals("*")) {
				break;
			}
			inputChar = input.toCharArray();

			int between = 1;
			ArrayList<String> list = new ArrayList<>();
			for (int i = 0; i < inputChar.length - 2 && isSurprisingString; i++) {
				for (int j = 0; j < inputChar.length - between && isSurprisingString; j++) {
					if (list.contains("" + inputChar[j] + inputChar[j + between])) {
						isSurprisingString = false;
						break;
					}
					list.add("" + inputChar[j] + inputChar[j + between]);
				}
				between++;
				list.clear();
			}

			if (isSurprisingString) {
				System.out.println(input + " is surprising.");
			} else {
				System.out.println(input + " is NOT surprising.");
			}
		}

	}
}
