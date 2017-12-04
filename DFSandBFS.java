package backjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//1260
public class DFSandBFS {
	static int Arr[][];
	
	static int dfsVisit[];
	static int bfsVisit[];
	
	static int dfsRsult[];
	static int dfsRsultPosition=0;
	static int bfsRsult[];
	static int bfsRsultPosition=0;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int v = sc.nextInt();
		
		Arr = new int[n][n];
		dfsVisit = new int[n];
		bfsVisit = new int[n];
		dfsRsult = new int[n];
		bfsRsult = new int[n];
		
		int i, x, y;
		for(i=0; i<m; i++){
			x = sc.nextInt()-1;
			y = sc.nextInt()-1;
			Arr[x][y] = 1;
			Arr[y][x] = 1;
		}
		
		dfs(v-1, 0);
		for(i=0; i<dfsRsult.length; i++){
			System.out.print(dfsRsult[i]+" ");
		}
		System.out.println();
		
		bfs(v-1, 0);
		for(i=0; i<bfsRsult.length; i++){
			System.out.print(bfsRsult[i]+" ");
		}
	}
	static void bfs(int x, int y){
		Queue<Pair> queue = new LinkedList<>();
		queue.add(new Pair(x, y));
		bfsVisit[x] = 1;
		bfsRsult[bfsRsultPosition++] = x+1;
		int i;
		int positionX, positionY;
		while(queue.isEmpty() == false){
			positionX = queue.peek().getX();
			positionY = queue.peek().getY();
			queue.remove();
			for(i=0; i<Arr[x].length; i++){
				if(Arr[positionX][i] == 1){
					if(bfsVisit[i] != 1){
						queue.add(new Pair(i,  y));
						bfsVisit[i] = 1;
						bfsRsult[bfsRsultPosition++] = i+1;
					}
				}
			}
		}
	}
	
	static void dfs(int x, int y){
		dfsVisit[x] = 1;
		dfsRsult[dfsRsultPosition++]=x+1;
		int i;
		for(i=0; i<Arr[x].length; i++){
			if(Arr[x][i] == 1){
				if(dfsVisit[i] != 1){
					dfs(i, y);
				}
			}
		}
	}
	
	static class Pair{
		int x, y;
		Pair(int x, int y){
			this.x = x; 
			this.y = y;
		}
		
		public int getX() {
			return x;
		}
		
		public int getY() {
			return y;
		}
	}
}
