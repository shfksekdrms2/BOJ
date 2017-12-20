package backjoon.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

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
		ArrayList<Integer> arrayList = new ArrayList<>();
		for(i=0; i<arr.length; i++){
			//중간 부분 뛰어넘는 단계
			while(j>0 && arr[i] != findArr[j]){
				j = move[j-1];
			}
			if(arr[i] == findArr[j]){ 
				if(j==findArr.length-1){ 
					arrayList.add(i-findArr.length+2); 
					j = move[j]; 
				}else{ 
					j++; 
				} 
			}
		}

		System.out.println(arrayList.size());
		for(i=0; i<arrayList.size(); i++){
			System.out.print(arrayList.get(i)+" ");
		}
		
	}
}
