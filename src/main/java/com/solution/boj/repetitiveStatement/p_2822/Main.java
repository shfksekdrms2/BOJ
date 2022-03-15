package backjoon.BOJ.repetitiveStatement.p_2822;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/2822
 * 점수 계산
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Pair> list = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			if (i < 5) {
				list.add(new Pair(sc.nextInt(), i + 1));
				continue;
			}
			Collections.sort(list, new mySort());
			int input = sc.nextInt();
			if (list.get(0).getValue() < input) {
				list.remove(0);
				list.add(new Pair(input, i + 1));
			}
		}
		Collections.sort(list, new mySortIndex());
		int sum = 0;
		int[] index = new int[5];
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i).getValue();
			index[i] = list.get(i).getIndex();
		}
		System.out.println(sum);
		for (int i : index) {
			System.out.print(i + " ");
		}
	}
}

class mySortIndex implements Comparator<Pair> {

	@Override
	public int compare(Pair o1, Pair o2) {
		return o1.getIndex() - o2.getIndex();
	}
}

class mySort implements Comparator<Pair> {

	@Override
	public int compare(Pair o1, Pair o2) {
		return o1.getValue() - o2.getValue();
	}
}

class Pair {
	private int value;
	private int index;

	Pair(int value, int index) {
		this.value = value;
		this.index = index;
	}

	public int getIndex() {
		return index;
	}

	public int getValue() {
		return value;
	}

}
