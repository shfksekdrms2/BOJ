package backjoon.BOJ;

import java.util.LinkedList;
import java.util.Scanner;

//1786
public class find {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.nextLine().toCharArray();
		char[] findArr = sc.nextLine().toCharArray();
		int[] move = new int[findArr.length+1];
		int i, j;
		String str = "";
		String prefix = "";
		String suffix = "";
		for(i=0; i<findArr.length; i++){
			str += findArr[i];
			prefix = "";
			suffix = "";
			for(j=0; j<str.length()/2; j++){
				prefix += str.charAt(j);
				suffix = str.charAt(str.length()-j-1) + suffix;
				if(prefix.equals(suffix)){
					move[i+1] = prefix.length();
					break;
				}
			}
		}
		int cnt=0;
		boolean findStr = true;
		LinkedList<Integer> list = new LinkedList<>();
		for(i=0; i<arr.length-findArr.length+1;i++){
			findStr = true;
			for(j=0; j<findArr.length; j++){
				if(arr[i+j] != findArr[j]){
					if(move[j] == 0){
						i += j-move[j];
					}else{
						i += j-move[j]-1;
					}
					findStr = false;
					break;
				}
			}
			if(findStr == true){
				cnt++;
				list.add(i+1);
			}
		}
		System.out.println(cnt);
		for(i=0; i<list.size(); i++){
			System.out.print(list.get(i)+" ");
		}
		
	}
}
