package backjoon.BOJ.graph.p_10451;

import java.util.Scanner;

//10451
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		while(testCase-- > 0){
			int N = sc.nextInt();
			int[] arr = new int[N];
			boolean[] visit = new boolean[N];
			int cnt=0;
			
			for(int i=0; i<N; i++){
				arr[i] = sc.nextInt();
			}
			
			for(int i=0; i<N; i++){
				if(visit[i] == false){
					cnt++;
					checkPermutationCycle(arr, visit, i);
				}
			}
			System.out.println(cnt);
		}
	}

	private static void checkPermutationCycle(int[] arr, boolean[] visit, int i) {
		if(visit[i] == true){
			return;
		}
		
		visit[i] = true;
		checkPermutationCycle(arr, visit, arr[i]-1);
	}
}
