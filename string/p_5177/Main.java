package backjoon.BOJ.string.p_5177;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/5177
 * 출력 형식이 잘못되었습니다.
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();

		String[] expression = { "(", ")", ".", ",", ":" };
		for (int i = 0; i < n; i++) {
			String input1 = sc.nextLine();
			String input2 = sc.nextLine();

			// 소문자 변경
			input1 = input1.toLowerCase();
			input2 = input2.toLowerCase();

			// 여는 괄호 변경
			input1 = input1.replaceAll("\\[", "(");
			input1 = input1.replaceAll("\\{", "(");
			input2 = input2.replaceAll("\\[", "(");
			input2 = input2.replaceAll("\\{", "(");
			// 닫는 괄호 변경
			input1 = input1.replaceAll("\\]", ")");
			input1 = input1.replaceAll("\\}", ")");
			input2 = input2.replaceAll("\\]", ")");
			input2 = input2.replaceAll("\\}", ")");

			// 세미콜롱 변경
			input1 = input1.replaceAll(";", ",");
			input2 = input2.replaceAll(";", ",");

			// 양쪽 공백 제거
			input1 = input1.trim();
			input2 = input2.trim();

			for (int j = 0; j < input1.length() - 1; j++) {
				for (int k = 0; k < expression.length; k++) {
					if (input1.substring(j, j + 1).equals(expression[k])) {
						System.out.println("input1 enter k: "+k);
						String befor = input1.substring(0, j);
						String after = input1.substring(j + 1, input1.length());
//						if (j > 0) {
							input1 = befor + " " + expression[k] + " " + after;
//						}
							
					}
				}
			}

			// 연속되는 공백 제거
//			while (input1.contains("  ")) {
//				input1 = input1.replaceAll("  ", " ");
//			}
//			while (input2.contains("  ")) {
//				input2 = input2.replaceAll("  ", " ");
//			}

			System.out.println("input1: " + input1);
			System.out.println("input2: " + input2);
			if (input1.equals(input2)) {
				System.out.println("Data Set " + (i + 1) + ": equal");
			} else {
				System.out.println("Data Set " + (i + 1) + ": not equal");
			}
			System.out.println("----------------");

		}
	}
}
