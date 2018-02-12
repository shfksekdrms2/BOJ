package backjoon.BOJ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class wordSort {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		int i;
		MySort sort = new MySort();
		for(i=0; i<n; i++){
			str[i] = sc.next();
		}
		Arrays.sort(str, sort);
		
		System.out.println(str[0]);
		for(i=1; i<str.length; i++){
			if(!str[i].equals(str[i-1])){
				System.out.println(str[i]);
			}
		}
	}
	public static class MySort implements Comparator<String>{
		
		@Override
		public int compare(String o1, String o2) {
			if(o1.length() < o2.length()){
				return -1;
			}else if(o1.length() > o2.length()){
				return 1;
			}else{
				char[] firstChar = o1.toCharArray();
				char[] secondChar = o2.toCharArray();
				int i;
				for(i=0; i<firstChar.length; i++){
					if(firstChar[i] < secondChar[i]){
						return -1;
					}else if(firstChar[i] > secondChar[i]){
						return 1;
					}
				}
				return 0;
			}
		}
	}
}
