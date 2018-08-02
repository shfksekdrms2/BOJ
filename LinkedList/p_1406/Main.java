package backjoon.BOJ.LinkedList.p_1406;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/1406
 *  에디터
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		LinkedList<Character> list = new LinkedList<>();
		int testCase = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		int index = arr.length;
		for (int i = 0; i < testCase; i++) {
			String cmd = sc.next();
			switch (cmd) {
				case "L":
					if (index != 0) {
						index--;
					}
					break;
				case "D":
					if (index != arr.length) {
						index++;
					}
					break;
				case "B":
					if (index != 0) {
						list.remove(index);
						index--;
					}
					break;
				case "P":
					char valuse = sc.next().charAt(0);

					break;
				default:
					break;
			}
		}

		// for (Character character : list) {
		// System.out.println(character);
		// }

	}
}
