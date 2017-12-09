package backjoon.BOJ;

import java.util.Scanner;

//5585
public class change {
	static int[] change = {500, 100, 50, 10, 5, 1};
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		input = 1000 - input;
		int i;
		int cnt=0;
		for(i=0; i<change.length; i++){
			if(input/change[i] > 0){
				cnt += input/change[i];
				input = input%change[i];
			}
		}
		System.out.println(cnt);
	}
}
