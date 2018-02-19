package backjoon.BOJ.For.p_11720;

import java.util.Scanner;

//11720
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] str = sc.nextLine().split("");

		int sum = 0;
		for (int i = 0; i < str.length; i++) {
			sum += Integer.parseInt(str[i]);
		}
		System.out.println(sum);
	}
}
