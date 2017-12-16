package backjoon.BOJ;

import java.util.Scanner;

//1475
public class roomNumber {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		char[] input = sc.next().toCharArray();
		int i;
		for(i=0; i<input.length; i++){
			arr[(int)input[i]-48]++;
		}
		int maxValue = Integer.MIN_VALUE;
		int sixAndNine=0;
		for(i=0; i<arr.length; i++){
			if(i == 6 || i == 9){
				sixAndNine += arr[i];
			}else{
				if(maxValue < arr[i]){
					maxValue = arr[i];
				}
			}
		}
		if((sixAndNine+1)/2 < maxValue){
			System.out.println(maxValue);
		}else{
			System.out.println((sixAndNine+1)/2);
		}
	}
}
