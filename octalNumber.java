package backjoon.BOJ;

import java.util.Scanner;

//2998
public class octalNumber {
	static String[][] exam = {{"000","0"}, 
								{"001", "1"}, 
								{"010", "2"}, 
								{"011", "3"},
								{"100", "4"}, 
								{"101", "5"}, 
								{"110", "6"}, 
								{"111", "7"}};
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int i, j;
		for(i=0; i<input.length()%3; i++){
			input = "0"+input;
		}
		char[] inputChar = input.toCharArray();
		String str="";
		String result="";
		for(i=0; i<inputChar.length; i++){
			str += inputChar[i];
			if(i%3 != 0){
				if(str.length()%3 == 0){
					for(j=0; j<exam.length; j++){
						if(exam[j][0].equals(str)){
							result += exam[j][1];
							break;
						}
					}
					str = "";
				}
			}
		}
		System.out.println(result);
	}
}
