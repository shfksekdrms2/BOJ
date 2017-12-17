package backjoon.BOJ;

import java.util.Arrays;
import java.util.Scanner;

//1026
public class treasure {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int i;
		for(i=0; i< n; i++){
			a[i] = sc.nextInt();
		}
		for(i=0; i< n; i++){
			b[i] = sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		int result = 0;
		for(i=0; i<n; i++){
			result += (a[n-i-1]*b[i]);
		}
		System.out.println(result);
	}
}
