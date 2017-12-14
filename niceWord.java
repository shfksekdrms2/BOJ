package backjoon.BOJ;

import java.util.Scanner;
import java.util.Stack;

//3986
public class niceWord {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i, j;
		String str="";
		int cnt=0;
		Stack<String> stack = new Stack<>();
		for(i=0; i<n; i++){
			stack.clear();
			str = sc.next();
			for(j=0; j<str.length(); j++){
				if(stack.isEmpty()){
					stack.add(str.substring(j, j+1));
				}else{
					if(stack.get(stack.size()-1).equals(str.substring(j, j+1))){
						stack.remove(stack.size()-1);
					}else{
						stack.add(str.substring(j, j+1));
					}
				}
			}
			if(stack.isEmpty()){
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
