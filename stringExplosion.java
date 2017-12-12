package backjoon.BOJ;

import java.util.Scanner;

//9935
public class stringExplosion {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String boomStr = sc.next();
		int i, j=0;
		
		char[] result = new char[input.length()];
		for(i=1; i<=input.length(); i++){
			result[j++] = input.substring(i-1, i).charAt(0);
			if(j-boomStr.length() >= 0 && String.valueOf(result).substring(j-boomStr.length(), j).equals(boomStr)){
				j -= boomStr.length();
			}
			if(i == input.length()){
				for(int k=0; k<i-j; k++){
					result[j+k] = '\0';
				}
			}
		}
		
		if(String.valueOf(result).equals("")){
			System.out.println("FRULA");
		}else{
			System.out.println(result);
		}
	}
}
