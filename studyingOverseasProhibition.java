package backjoon.BOJ;

import java.util.Scanner;

//2789
public class studyingOverseasProhibition {
	public static void main(String[] args){
		String[] arr = {"C","A","M", "B","R","I","D","G","E"};
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int i;
		for(i=0; i<arr.length; i++){
			input = input.replaceAll(arr[i], "");
		}
		System.out.println(input);
	}
}
