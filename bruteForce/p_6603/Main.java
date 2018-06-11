package backjoon.BOJ.bruteForce.p_6603;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/6603
 * 로또
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input;
		while ((input = sc.nextInt()) != 0) {
			int[] arr = new int[input];
			for (int i = 0; i < input; i++) {
				arr[i] = sc.nextInt();
			}
			findAndPrintTestCase(arr, input, new int[6], 0, 0);
			System.out.println();
		}
	}

	private static void findAndPrintTestCase(int[] arr, int input, int[] result, int index, int start) {
		if (arr.length - 6 == input) {
			print(result);
			return;
		}

		for (int i = start; i < arr.length; i++) {
			result[index] = arr[i];
			findAndPrintTestCase(arr, input - 1, result, index + 1, i + 1);
		}

	}

	private static void print(int[] result) {
		for (int i : result) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
