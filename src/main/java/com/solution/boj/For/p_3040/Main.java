package backjoon.BOJ.For.p_3040;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/3040
 * 백설 공주와 일곱 난쟁이
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[9];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i <= arr.length - 7; i++) {
			list.add(arr[i]);
			findDwarfs(arr, i, arr[i], list);
			list.remove(list.indexOf(arr[i]));
		}
	}

	private static void findDwarfs(int[] arr, int index, int sum, ArrayList<Integer> list) {
		if (list.size() == 7 && sum == 100) {
			for (Integer integer : list) {
				System.out.println(integer);
			}
		}

		for (int i = index + 1; i < arr.length; i++) {
			if (sum + arr[i] <= 100) {
				list.add(arr[i]);
				findDwarfs(arr, i, sum + arr[i], list);
				list.remove(list.indexOf(arr[i]));
			}
		}
	}
}
