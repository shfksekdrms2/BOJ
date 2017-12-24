package backjoon.BOJ;

import java.util.Scanner;

//6581
public class html {
	static String br = "<br>";
	static String hr = "<hr>";
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
//		String input;
		String[] inputArr;
		String output="";
		int i, j, k=0;
//		while(sc.hasNextLine()){
		for(j=0; j<12; j++){
//			input = sc.nextLine();
			inputArr = sc.nextLine().split("");			
			for(i=0; i<inputArr.length; i++){
				if(inputArr[i].equals(br)){
					output += "\n";
//					k=0;
					continue;
				}else if(inputArr[i].equals(hr)){
					output += "\n--------------------------------------------------------------------------------";
//					k=80;
					continue;
				}
				
//				String token = 
				if(k/80 >= 1){
					output += "\n";
				}
				output += input.substring(i, i+1);
				k++;
			}
			
//		}
		}
		
		
		System.out.print(output);
	}
}
