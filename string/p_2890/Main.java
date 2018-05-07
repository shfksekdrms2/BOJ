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
			System.out.println("list.get(" + i + ").getIndex(): " + list.get(i).getIndex() + " list.get(i).getValue(): " + list.get(i).getValue());
			// System.out.println("beforeIndex: "+beforeIndex);
			if (i != 0) {
				if (list.get(i).getValue() == list.get(i - 1).getValue()) {
					result[list.get(i).getIndex()] = list.get(beforeIndex).getIndex() + 1;
				} else {
					// System.out.println("enter");
					beforeIndex = i;
					result[list.get(i).getIndex()] = list.get(i).getIndex() + 1;
				}
			} else {
				beforeIndex = i;
				result[list.get(i).getIndex()] = list.get(i).getIndex() + 1;
			}

			// System.out.println("result["+list.get(i).getIndex()+"]: "+
			// result[list.get(i).getIndex()]);
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
	private int index;
	private int value;

	Pair(int index, int value) {
		this.index = index;
		this.value = value;
	}

	public int getIndex() {
		return index;
	}

	public int getValue() {
		return value;
	}

}
