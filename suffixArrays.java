package backjoon.BOJ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//11656
public class suffixArrays {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String[] str = new String[input.length()];
		int i;
		for(i=0; i<input.length(); i++){
			str[i] = input.substring(i, input.length());
		}
		Arrays.sort(str, new mySort());
		for(i=0; i<input.length(); i++){
			System.out.println(str[i]);
		}
	}
	static class mySort implements Comparator<String>{
		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			char[] char1 = o1.toCharArray();
			char[] char2 = o2.toCharArray();
			int i;
			int length = (o1.length() > o2.length() ? o2.length():o1.length());
			boolean same = false;
			for(i=0; i<length; i++){
				if(char1[i] == char2[i]){
					same=true;
					continue;
				}else{
					same=false;
					break;
				}
			}
			if(same == true){
				return (o1.length() < o2.length() ? -1:1);
			}else{
				return (int)char1[i] - (int)char2[i];
			}
		}
	}
}
