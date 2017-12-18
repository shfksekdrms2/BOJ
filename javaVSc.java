package backjoon.BOJ;

import java.util.Scanner;

//3613
public class javaVSc {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char[] input = sc.next().toCharArray();
		int i;
		String result="";
		boolean error =  false;
		int cnt[] = new int[2];
		//처음, 마지막이  _ 인 경우
		//처음이 대문자로 시작하는 경우
		if(input[0] == '_' || 
				input[input.length-1] == '_' ||
				(input[0] >= 'A' && input[0] <= 'Z')){
			System.out.println("Error!");
			return;
		}
		for(i=0; i<input.length; i++){
			if(input[i] == '_'){
				//연속으로 _ 가 들어 왔을경우에 대한 예외
				//_ 다음에 소문자가 오지 않을 경우에 대한 예외
				if(input[i+1] != '_' &&
						(input[i+1] >= 'a' && input[i+1] <= 'z')){
					i++;
					input[i] -= 32; 
					cnt[0] = 1;
				}else{
					error = true;
					break;
				}
			}else if(input[i] >= 'A' && input[i] <= 'Z'){
				result += "_";
				input[i] += 32;
				cnt[1] = 1;
			}
			result += input[i];
		}
		//혼합의 경우 체크
		if(cnt[0] + cnt[1] == 2){
			error = true;
		}
		if(error == false){
			System.out.println(result);
		}else{
			System.out.println("Error!");
		}
	}
}
