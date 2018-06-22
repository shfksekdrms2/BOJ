package backjoon.BOJ.basic.p_15552;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * https://www.acmicpc.net/problem/15552
 * 빠른 A+B
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer();
		while (testCase-- > 0) {
			String[] str = br.readLine().split(" ");
			sb.append(Integer.parseInt(str[0]) + Integer.parseInt(str[1]) + "\n");
		}
		System.out.println(sb.toString());
	}
}
