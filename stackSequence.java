package backjoon.BOJ;

import java.util.ArrayList;
import java.util.Scanner;

//1874
public class stackSequence {
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>(); //���� list
		ArrayList<Integer> list2 = new ArrayList<Integer>(); //�������� Ȯ���ϴ� list
		ArrayList<String> listTotal = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		boolean success = true;
		int n = sc.nextInt();
		int i, j, k=0;
		for(i=0; i<n; i++){
			list.add(sc.nextInt());
		}
		int value=1;
		for(j=0; j<n*2; j++){
			if(list2.isEmpty() == true){
				list2.add(value++);
				listTotal.add("+");
			}else{
				if(list2.get(list2.size()-1) < list.get(k)){
					list2.add(value++);
					listTotal.add("+");
				}else if(list2.get(list2.size()-1) == list.get(k)){
//					System.out.println("list2.get(list2.size()-1: "+list2.get(list2.size()-1));
					list2.remove(list2.size()-1);
					k++;
					listTotal.add("-");
				}else{
					success = false;
					break;
				}
			}
		}
//		System.out.println("listTotal.size(): "+listTotal.size());
		if(success == true && list2.isEmpty() == true && value == n+1 && j == n*2){
			for(i=0; i<n*2; i++){
				System.out.println(listTotal.get(i));
			}
		}else{
			System.out.println("NO");
		}
	}
}
