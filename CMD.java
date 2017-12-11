package backjoon.BOJ;

import java.util.Scanner;

//1032
public class CMD {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i, j;
		String[][] str = new String[n][];
		for(i=0; i<n; i++){
			String arr = sc.next();
			str[i] = new String[arr.length()];
			str[i] = arr.split("");
		}
		String result = "";
		boolean success = true;
		for(i=0; i<str[0].length; i++){
			success = true;
			for(j=1; j<n; j++){
				if(!str[0][i].equals(str[j][i])){
					success = false;
				}
			}
			if(success == false){
				result += "?";
			}else{
				result += str[0][i];
			}
		}
		System.out.println(result);
	}
}
