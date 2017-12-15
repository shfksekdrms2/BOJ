package backjoon.BOJ;

import java.util.Scanner;

//1937
public class greedyPanda {
	static int maxValue = Integer.MIN_VALUE;
	static int[][] arr;
	static int[][] maxSuviveCnt;
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i, j;
		arr = new int[n][n];
		maxSuviveCnt= new int[n][n];
		for(i=0; i<n; i++){
			for(j=0; j<n; j++){
				arr[i][j] = sc.nextInt();
				maxSuviveCnt[i][j] = 1;
			}
		}
		int cnt;
		for(i=0; i<n; i++){
			for(j=0; j<n; j++){
				cnt = maxSuviveCnt[i][j];
				maxSuvivePanda(i, j, cnt);
//				System.out.println("-----------");
//				for(int k=0; k<n; k++){
//					for(int z=0; z<n; z++){
//						System.out.print(maxSuviveCnt[k][z]+" ");
//					}
//					System.out.println();
//				}
			}
		}
		System.out.println(maxValue);
	}
	static boolean isRowCol(int row, int col){
		boolean result = false;
		if(row < arr.length && row >=0 && col < arr[0].length && col >=0){
			result = true;
		}
		return result;
	}
	static int[][] position = {{0,1},{1,0},{-1,0},{0,-1}};
	static void maxSuvivePanda(int row, int col, int cnt){
		int i;
		maxSuviveCnt[row][col] = cnt;
		if(maxValue < cnt){
			maxValue = cnt;
		}
//		System.out.println("row1: "+row+" col1: "+col+" cnt1: "+cnt);
		int x, y;
		for(i=0; i<position.length; i++){
			x = row+position[i][0];
			y = col+position[i][1];
			if(isRowCol(x, y)){
				if(arr[x][y] > arr[row][col]){
					if(maxSuviveCnt[x][y] < maxSuviveCnt[row][col]+1){
						maxSuvivePanda(x, y, cnt+1);
					}
				}
			}
		}
	}
}
