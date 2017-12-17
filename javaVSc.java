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
				//연속으로 _ 가 들어 왔을경우에 대한 예외
				if(i+1 < input.length){
					i++;
					input[i] -= 32; 
					error = false;
					cnt[0] = 1;
				}else{
					error = true;
					break;
				}
			}else if(input[i] >= 'A' && input[i] <= 'Z'){
				result += "_";
				input[i] += 32;
				error = false;
				cnt[1] = 1;
			}
			result += input[i];
		}
		//혼합의 경우 체크
		if(cnt[0] + cnt[1] == 2){
			error = true;
		}
		if(error == false){
			//처음이  _ 인 경우
			//처음이 대문자로 시작하는 경우
			if(result.substring(0, 1).equals("_") || 
					(result.substring(0, 1).charAt(0) >= 'A' && result.substring(0, 1).charAt(0) <= 'Z')){
				System.out.println("Error!");
			}else{
				//문자가 소/대문자, _ 인 경우인지 체크
				for(i=0; i<result.length(); i++){
					if((result.substring(i, i+1).charAt(0) >= 'A' && result.substring(i, i+1).charAt(0) <= 'Z') ||
							result.substring(i, i+1).charAt(0) >= 'a' && result.substring(i, i+1).charAt(0) <= 'z' ||
							result.substring(i, i+1).charAt(0) >= '_'){
						error = false;
					}else{
						error = true;
						break;
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
