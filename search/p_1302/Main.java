package backjoon.BOJ.search.p_1302;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/1302
 * 베스트셀러
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		HashMap<String, Integer> hm = new HashMap<>();

		for (int i = 0; i < n; i++) {
			String input = sc.next();
			if (hm.containsKey(input)) {
				int value = hm.get(input);
				hm.put(input, value + 1);
			} else {
				hm.put(input, 1);
			}
		}

		ArrayList<String> list = new ArrayList<>(hm.keySet());
		Collections.sort(list);
		int maxValue = Integer.MIN_VALUE;
		String result = "";
		for (int i = 0; i < hm.size(); i++) {
			if (maxValue < hm.get(list.get(i))) {
				result = list.get(i);
				maxValue = hm.get(list.get(i));
			}
		}
		System.out.println(result);

	}

}
