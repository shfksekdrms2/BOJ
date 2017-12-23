package backjoon.BOJ;

import java.util.Scanner;

//6581
public class html {
	static String br = "<br>";
	static String hr = "<hr>";
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input;
		String output="";
		int i, j;
		while(sc.hasNextLine()){
			input = sc.nextLine();
			for(i=0; i<input.length()-4; i++){
				if(input.substring(i, i+4).equals(br)){
					output += "\n";
					i=i+3;
				}else if(input.substring(i, i+4).equals(hr)){
					output += "--------------------------------------------------------------------------------";
					i=i+3;
				}else{
					output += input.substring(i, i+1);
				}
			}
			System.out.println(output);
		}
	}
}
