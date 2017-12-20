package backjoon.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

//1786
public class find {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		char[] arr =  br.readLine().toCharArray();
		char[] findArr = br.readLine().toCharArray();
		int[] move = new int[findArr.length];
		int i, j=0;
		for(i = 1; i< move.length; i++){ 
			//중간 부분 뛰어넘는 단계
			while(j > 0 && findArr[i] != findArr[j]){
				j = move[j-1];
			}
			if(findArr[i] == findArr[j]){
				move[i] = ++j; 
			}
		}
		j=0;
		LinkedList<Integer> list = new LinkedList<>();
		for(i=0; i<arr.length; i++){
			//중간 부분 뛰어넘는 단계
			while(j>0 && arr[i] != findArr[j]){
				j = move[j-1];
			}
			if(arr[i] == findArr[j]){ 
				if(j==findArr.length-1){ 
					list.add(i-findArr.length+2); 
					j = move[j]; 
				}else{ 
					j++; 
				} 
			}
		}

		System.out.println(list.size());
		for(i=0; i<list.size(); i++){
			System.out.print(list.get(i)+" ");
		}
		
	}
}
