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
		boolean isSurprisingString;

		StringBuilder sb = new StringBuilder();
		while ((input = br.readLine()) != null) {
			if (input.equals("*")) {
				break;
			}
			inputChar = input.toCharArray();
			isSurprisingString = true;

			ArrayList<String> list = new ArrayList<>();
			for (int i = 1; i < inputChar.length && isSurprisingString; i++) {
				for (int j = 0; j < inputChar.length - i && isSurprisingString; j++) {
					if (list.contains(String.valueOf(inputChar[j]) + String.valueOf(inputChar[j + i]))) {
						isSurprisingString = false;
						break;
					}
					list.add(String.valueOf(inputChar[j]) + String.valueOf(inputChar[j + i]));
				}
				list.clear();
			}

			if (isSurprisingString) {
				sb.append(input + " is surprising.\n");
			} else {
				sb.append(input + " is NOT surprising.\n");
			}
		}
		System.out.println(sb.toString());
	}
}
