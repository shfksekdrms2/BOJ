package backjoon.BOJ;

import java.util.Scanner;
//10872
public class factorial {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;
		int result=1;
		for(i=n; i>=1; i--){
			result *= i;
		}
		System.out.println(result);
	}
}
