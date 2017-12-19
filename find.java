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
		move[0] = -1;
		for(i=0; i<findArr.length; i++){
			str += findArr[i];
			prefix = "";
			suffix = "";
			for(j=0; j<str.length()/2; j++){
				prefix += str.charAt(j);
				suffix = str.charAt(str.length()-j-1) + suffix;
//				System.out.println("prefix: "+prefix);
//				System.out.println("suffix: "+suffix);
//
//				for(int k=0; k<move.length; k++){
//					System.out.print(move[k]+" ");
//				}
//				System.out.println();
//				System.out.println("-------------");
				if(prefix.equals(suffix)){
//					System.out.println("i: "+i);
//					System.out.println("success");
					//move 배열에 prefix와 suffix의 최대 경계값에 대한 길이 입력
					move[i+1] = prefix.length();
					break;
				}
			}
		}
//		System.out.println("move.length: "+ move.length);
//		for(i=0; i<move.length; i++){
//			System.out.print(move[i]+" ");
//		}
		boolean findStr = true;
		LinkedList<Integer> list = new LinkedList<>();
		for(i=0; i<arr.length-findArr.length+1;){
			findStr = true;
			for(j=0; j<findArr.length; j++){
//				System.out.println("arr["+(i+j)+"]: "+ arr[i+j]);
//				System.out.println("findArr["+j+"]: "+ findArr[j]);
				if(arr[i+j] != findArr[j]){
					//틀린 경우 위치 이동
					i += j-move[j];
//					System.out.println("before move["+j+"]: "+move[j]);
					findStr = false;
					break;
				}
			}
			if(findStr == true){
//				System.out.println("after move["+j+"]: "+move[j]);
				//다맞은 경우에 1칸 이동
				list.add(i+1);
				//맞은 경우 위치 이동
				i += j-move[j];
			}
//			System.out.println("-------------------");
		}
		System.out.println(list.size());
		for(i=0; i<list.size(); i++){
			System.out.print(list.get(i)+" ");
		}
		
	}
}
