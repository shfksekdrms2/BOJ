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
				//�������� _ �� ��� ������쿡 ���� ����
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
		//ȥ���� ��� üũ
		if(cnt[0] + cnt[1] == 2){
			error = true;
		}
		if(error == false){
			//ó����  _ �� ���
			//ó���� �빮�ڷ� �����ϴ� ���
			if(result.substring(0, 1).equals("_") || 
					(result.substring(0, 1).charAt(0) >= 'A' && result.substring(0, 1).charAt(0) <= 'Z')){
				System.out.println("Error!");
			}else{
				//���ڰ� ��/�빮��, _ �� ������� üũ
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
