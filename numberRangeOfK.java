package backjoon.BOJ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//7469
public class numberRangeOfK {
	static class mySort implements Comparator<int []>{
		@Override
		public int compare(int[] o1, int[] o2) {
			// TODO Auto-generated method stub
			if(o1[0] > o2[0]){
				return 1;
			}else if(o1[0] < o2[0]){
				return -1;
			}else{
				return 0;
			}
		}
	}
	static int n;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int m = sc.nextInt();
		int i;
		int[][] arr = new int[n][2];
		for(i=0; i<n; i++){
			arr[i][0] = sc.nextInt();
			arr[i][1] = i+1;
		}
		Arrays.sort(arr, new mySort());
		int a,b,k;
		for(i=0; i<m; i++){
			a = sc.nextInt();
			b = sc.nextInt();
			k = sc.nextInt();
			Q(a, b, k, arr);
		}
	}
	static void Q(int i, int j, int k, int[][] arr){
		int cnt=0, a;
		for(a=0; a<n; a++){
			if(arr[a][1] >= i && arr[a][1] <= j){
				cnt++;
				if(cnt == k){
					System.out.println(arr[a][0]);
					break;
				}
			}
		}
	}
}
