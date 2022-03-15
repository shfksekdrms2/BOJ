package backjoon.BOJ.LinkedList.p_1406;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/1406
 *  에디터
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		ArrayList<Character> list = new ArrayList<Character>();
		int testCase = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		int index = list.size() - 1;
		for (int i = 0; i < testCase; i++) {
			String cmd = sc.next();
			switch (cmd) {
				case "L":
					if (index > list.size() - 1) {
						index = list.size() - 1;
					}
					index--;
					break;
				case "D":
					if (index < 0) {
						index = 0;
					}
					index++;
					break;
				case "B":
					if (index >= 0) {
						list.remove(index);
					}
					index--;
					break;
				case "P":
					if (index < 0) {
						index = -1;
					}
					index++;
					if (index > list.size()) {
						index = list.size();
					}
					char value = sc.next().charAt(0);
					list.add(index, value);
					break;
				default:
					break;
			}
		}
		for (Character character : list) {
			System.out.print(character);
		}

	}
}
