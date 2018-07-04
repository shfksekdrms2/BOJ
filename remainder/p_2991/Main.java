package backjoon.BOJ.remainder.p_2991;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/2991
 * 사나운 개
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		for (int i = 0; i < 3; i++) {
			int input = sc.nextInt();
			int result = (input % (a + b)) - a;
			int attack = 0;
			if (result <= 0) {
				if(result != -a){
					attack++;
				}
			}
			result = (input % (c + d)) - c;
			if (result <= 0) {
				if(result != -c){
					attack++;
				}
			}
			System.out.println(attack);
		}

	}
}
