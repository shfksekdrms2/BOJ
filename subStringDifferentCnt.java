package backjoon.BOJ;

import java.util.HashSet;
import java.util.Scanner;

//11478
public class subStringDifferentCnt {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String str = "";
		int i, j;
		
		HashSet<String> hs = new HashSet<>();
		
		for(i=0; i<input.length(); i++){
			str = "";
			for(j=i; j<input.length(); j++){
				str += input.charAt(j);
				hs.add(str);
//				System.out.println("str: "+ str);
			}
//			System.out.println("-------------");
		}
		System.out.println(hs.size());
	}
}
