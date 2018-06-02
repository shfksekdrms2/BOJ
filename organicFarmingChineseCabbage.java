package backjoon.BOJ;

import java.util.Scanner;
//1012
public class organicFarmingChineseCabbage {
	static int[] result;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		result = new int[t];
		int m,n,k;
		int a, b;
		int i, j, positionX, positionY;
		boolean check = false;
		for(i=0; i<t; i++){
			m = sc.nextInt();
			n = sc.nextInt();
			k = sc.nextInt();
			
			int[][] arr = new int[m][n];
			int[][] visit = new int[m][n];
			
			for(j=0; j<k; j++){
				a=sc.nextInt();
				b=sc.nextInt();
				arr[a][b] = 1;
			}
			for(positionX=0; positionX<arr.length; positionX++){
				for(positionY=0; positionY<arr[i].length; positionY++){
					dfs(arr, visit, i, positionX, positionY, check);
					check=false;
				}
			}
		}
		for(i=0; i<t; i++){
//			System.out.println("result: "+result[i]);
			System.out.println(result[i]);
		}
	}
	
	static public void dfs(int[][] arr, int visit[][], int t, int positionX, int positionY, boolean check){
		if(visit[positionX][positionY]==1){
			return;
		}
		visit[positionX][positionY]=1;
		if(arr[positionX][positionY]==1){
//			System.out.println("positionX: "+positionX+" positionY: "+positionY);
			if(check == false){
				result[t]++;
				check = true;
			}
			//����
			if((positionY+1) < arr[t].length && arr[positionX][positionY+1]==1){
//				System.out.println("right");
				dfs(arr, visit, t, positionX, positionY+1, check);
			}
			//�Ʒ�
			if((positionX+1) < arr.length && arr[positionX+1][positionY]==1){
//				System.out.println("bottom");
				dfs(arr, visit, t, positionX+1, positionY, check);
			}
			//����
			if((positionY-1) >= 0 && arr[positionX][positionY-1]==1){
//				System.out.println("left");
				dfs(arr, visit, t, positionX, positionY-1, check);
			}
			//��
			if((positionX-1) >= 0 && arr[positionX-1][positionY]==1){
//				System.out.println("top");
				dfs(arr, visit, t, positionX-1, positionY, check);
			}
		}
	}
}
