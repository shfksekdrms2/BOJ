package backjoon.BOJ;

import java.util.Scanner;

//3613
public class javaVSc {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char[] input = sc.next().toCharArray();
		int i;
		String result="";
		boolean error =  true;
		int cnt[] = new int[2];
		for(i=0; i<input.length; i++){
			if(input[i] == '_'){
				i++;
				input[i] -= 32; 
				error = false;
				cnt[0] = 1;
			}else if(input[i] >= 'A' && input[i] <= 'Z'){
				result += "_";
				input[i] += 32;
				error = false;
				cnt[1] = 1;
			}
			result += input[i];
		}
		if(cnt[0] + cnt[1] == 2){
			error = true;
		}
		if(error == false){
			if(result.substring(0, 1).equals("_") || result.substring(result.length()-1, result.length()).equals("_") 
					|| (result.substring(0, 1).charAt(0) >= 'A' && result.substring(0, 1).charAt(0) <= 'Z')){
				System.out.println("Error!");
			}else{
				for(i=0; i<result.length(); i++){
					if((result.substring(i, i+1).charAt(0) >= 'A' && result.substring(i, i+1).charAt(0) <= 'Z') ||
							result.substring(i, i+1).charAt(0) >= 'a' && result.substring(i, i+1).charAt(0) <= 'z'){
						error = false;
					}else{
						error = true;
					}
				}
				if(error == false){
					System.out.println(result);
				}else{
					System.out.println("Error!");
				}
			}
		}else{
			System.out.println("Error!");
		}
	}
}
