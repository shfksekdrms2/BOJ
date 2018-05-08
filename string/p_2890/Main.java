package backjoon.BOJ.string.p_2890;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/2890
 * 카약
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();

		ArrayList<Pair> list = new ArrayList<>();

		for (int i = 0; i < row; i++) {
			char[] input = sc.next().toCharArray();
			int position = 0;

			while (true) {
				if (input[position] == 'S' || input[position] == '.') {
					position++;
					continue;
				}
				if (input[position] == 'F') {
					break;
				}
				list.add(new Pair(Character.getNumericValue(input[position]) - 1, col - position));
				break;
			}
		}

		Collections.sort(list, new mySort());
		int[] result = new int[9];
		int beforeIndex = 0;
		for (int i = 0; i < list.size(); i++) {
			if (i != 0) {
				if (list.get(i).getValue() == list.get(i - 1).getValue()) {
					result[list.get(i).getNumber()] = beforeIndex + 1;
				} else {
					beforeIndex++;
					result[list.get(i).getNumber()] = beforeIndex + 1;
				}
			} else {
				result[list.get(i).getNumber()] = i + 1;
			}
		}

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}

class mySort implements Comparator<Pair> {
	@Override
	public int compare(Pair o1, Pair o2) {
		return o1.getValue() - o2.getValue();
	}
}

class Pair {
	private int number;
	private int value;

	Pair(int number, int value) {
		this.number = number;
		this.value = value;
	}

	public int getNumber() {
		return number;
	}

	public int getValue() {
		return value;
	}

}
