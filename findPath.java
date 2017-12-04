package backjoon;

import java.util.Scanner;

//11403
public class findPath {
	static int n;
	static int[][] visitCheck;
	static int[][] a;
	static int[][] visit;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int i, j;
		a = new int[n][n];
		visitCheck = new int[n][n];
		visit = new int[n][n];
		
		for(i=0; i<n; i++){
			for(j=0; j<n; j++){
				a[i][j] = sc.nextInt();
			}
		}
		i=0;
		int position;
		for(i=0; i<n; i++){
			position=i;
			dfs(i, position);
		}
		for(i=0; i<n; i++){
			for(j=0; j<n; j++){
				System.out.print(visitCheck[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	public static void dfs(int i,int position){
		int j;
//		System.out.println("i: "+i+" position: "+position);
		for(j=0; j<n; j++){
			if(a[position][j] == 1){
//				System.out.println("i: "+i+" position: "+position + " j: "+j);
				if(visitCheck[i][j] != 1){
					visitCheck[i][j] = 1;
					if(i!=j)
						dfs(i, j);
				}
			}
		}
	}
}
