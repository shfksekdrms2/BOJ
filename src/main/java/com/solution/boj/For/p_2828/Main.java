package backjoon.BOJ.For.p_2828;

import java.util.Scanner;

/*
 *	https://www.acmicpc.net/problem/2828
 *	사과 담기 게임 
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int j = sc.nextInt();

		int start = 1;
		int end = start + m - 1;

		int move = 0;
		int moveCnt = move;
		for (int i = 0; i < j; i++) {
			int input = sc.nextInt();
			if (input >= start && input <= end) {
				move = 0;
			} else if (input > end) {
				move = input - end;
				start += move;
				end += move;
			} else if (input < start) {
				move = start - input;
				start -= move;
				end -= move;
			}
			moveCnt += move;
		}
		System.out.println(moveCnt);
	}
}
