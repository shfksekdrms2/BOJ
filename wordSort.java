package backjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

//1181
public class wordSort {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<MySort> list = new ArrayList<MySort>();
		int i;
		MySort sort;
		String input = "";
		for(i=0; i<n; i++){
			sort = new MySort();
			input = sc.next();
			sort.setWord(input);
			list.add(sort);
		}
		Collections.sort(list, new MySort());
		
		System.out.println(list.get(0).getWord());
		for(i=1; i<list.size(); i++){
			if(!list.get(i).getWord().equals(list.get(i-1).getWord())){
				System.out.println(list.get(i).getWord());
			}
		}
	}
	public static class MySort implements Comparator<MySort>{
		private String word;
		
		public String getWord() {
			return word;
		}

		public void setWord(String word) {
			this.word = word;
		}

		@Override
		public int compare(MySort o1, MySort o2) {
			String first = o1.getWord();
			String second = o2.getWord();
			if(first.length() < second.length()){
				return -1;
			}else if(first.length() > second.length()){
				return 1;
			}else{
				char[] firstChar = first.toCharArray();
				char[] secondChar = second.toCharArray();
				int i;
				for(i=0; i<firstChar.length; i++){
					if(firstChar[i] < secondChar[i]){
						return -1;
					}else if(firstChar[i] > secondChar[i]){
						return 1;
					}
				}
				return 0;
			}
		}
	}
}
