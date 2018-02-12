package backjoon.BOJ;

import java.util.Scanner;

//2920
public class scale {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i;
		int scale=0; //0: ascending, 1: descending, 2: mixed
		int[] input = new int[8];
		for(i=0; i<input.length; i++){
			input[i] = sc.nextInt();
		}
		if(input[0] < input[1]){
			scale=0;
		}else{
			scale=1;
		}
		for(i=1; i<input.length-1; i++){
			if(scale==0){
				if(input[i+1] < input[i]){
					scale=2;
					break;
				}
			}else{
				if(input[i] < input[i+1]){
					scale=2;
					break;
				}
			}
		}
		if(scale==0){
			System.out.println("ascending");
		}else if(scale==1){
			System.out.println("descending");
		}else{
			System.out.println("mixed");
		}
	}
}
