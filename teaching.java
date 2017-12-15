package backjoon.BOJ;

import java.util.Scanner;
//1062
public class teaching {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String[] arr = new String[n];
		int i;
		int cnt=0;
		int kCopy = k;
		for(i=0; i<n; i++){
			k=kCopy;
			arr[i] = sc.next();
			arr[i] = arr[i].replaceAll("a", "");
			arr[i] =  arr[i].replaceAll("n", "");
			arr[i] = arr[i].replaceAll("t", "");
			arr[i] = arr[i].replaceAll("i", "");
			arr[i] = arr[i].replaceAll("c", "");
//			System.out.println("arr[i]: "+arr[i]);
			k -= 5;
			while(!arr[i].equals("") && k > 0){
				arr[i] = arr[i].replaceAll(arr[i].substring(0, 1), "");
				k--;
//				System.out.println("arr[i]: "+arr[i]);
			}
//			System.out.println("k: "+k);
			if(k >=0 && arr[i].equals("")){
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
