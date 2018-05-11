package backjoon.BOJ.dynamicBasic.p_11066;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/11066
 * 파일 합치기
 */
public class Main {
	final static int N = 501;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();

		while (testCase-- > 0) {
			int[][] dp = new int[N][N];
			int k = sc.nextInt();
			int[] arr = new int[k + 1];
			for (int i = 1; i <= k; i++) {
				arr[i] = sc.nextInt();
				for (int j = 1; j <= k; j++) {
					dp[i][j] = Integer.MAX_VALUE;
				}
			}
			System.out.println(findFileMergeMinCost(arr, dp, 1, k));
		}
	}

	private static int findFileMergeMinCost(int[] arr, int[][] dp, int start, int end) {
		if (start >= end) {
			return 0;
		}

		if (dp[start][end] != Integer.MAX_VALUE) {
			return dp[start][end];
		}

		int sum = isSum(arr, start, end);
		for (int i = start; i < end; i++) {
			dp[start][end] = Integer.min(findFileMergeMinCost(arr, dp, start, i) + findFileMergeMinCost(arr, dp, i + 1, end), dp[start][end]);
		}
		dp[start][end] += sum;

		return dp[start][end];
	}

	private static int isSum(int[] arr, int start, int end) {
		int result = 0;
		for (int i = start; i <= end; i++) {
			result += arr[i];
		}
		return result;
	}
}
