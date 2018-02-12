package backjoon.BOJ;

import java.util.Arrays;
import java.util.Scanner;

//2217
public class rope {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int max=0;
		int n = sc.nextInt();
		int i;
		int arr[] = new int[n];
		
		for(i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		for(i=0; i<n; i++){
			if(max < arr[i]*(n-i)){
				max = arr[i]*(n-i);
			}
		}
		System.out.println(max);
	}
}
