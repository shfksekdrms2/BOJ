package backjoon;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

//7469
public class numberRangeOfK {
	static class tree{
		private int x, y;
		tree(int x, int y){
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
	static class treeSort implements Comparator<tree>{
		@Override
		public int compare(tree o1, tree o2) {
			// TODO Auto-generated method stub
			if(o1.getX() > o2.getX()){
				return 1;
			}else if(o1.getX() < o2.getX()){
				return -1;
			}else{
				return 0;
			}
		}
	}
	static LinkedList<tree> list;
	static int n;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int m = sc.nextInt();
		list = new LinkedList<>();
		int i;
		for(i=0; i<n; i++){
			list.add(new tree(sc.nextInt(), i+1));
		}
		Collections.sort(list, new treeSort());
		int a,b,k;
		for(i=0; i<m; i++){
			a = sc.nextInt();
			b = sc.nextInt();
			k = sc.nextInt();
			Q(a, b, k);
		}
	}
	static void Q(int i, int j, int k){
		int cnt=0, a;
		for(a=0; a<n; a++){
			if(list.get(a).getY() >= i && list.get(a).getY() <= j){
				cnt++;
				if(cnt == k){
					System.out.println(list.get(a).getX());
					break;
				}
			}
		}
	}
}
