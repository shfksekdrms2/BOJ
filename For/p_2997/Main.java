package backjoon.BOJ.For.p_2997;

import java.util.Arrays;
import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/2997
 * 네번째 수
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int result = 0;
		if (arr[1] - arr[0] == arr[2] - arr[1]) {
			result = arr[2] + arr[2] - arr[1];
		} else if (arr[1] - arr[0] == (arr[2] - arr[1]) * 2) {
			result = arr[0] + arr[2] - arr[1];
		} else if ((arr[1] - arr[0]) * 2 == arr[2] - arr[1]) {
			result = arr[1] + arr[1] - arr[0];
		}
		System.out.println(result);
	}
}
