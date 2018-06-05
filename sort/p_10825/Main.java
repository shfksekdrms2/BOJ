package backjoon.BOJ.sort.p_10825;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/10825
 * 국영수
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		ArrayList<Pair> list = new ArrayList<>();

		for (int i = 0; i < cnt; i++) {
			list.add(new Pair(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
		}
		Collections.sort(list, new mySort());
		for (Pair pair : list) {
			System.out.println(pair.getName());
		}
	}
}

class mySort implements Comparator<Pair> {

	@Override
	public int compare(Pair o1, Pair o2) {
		if (o1.getLanguage() != o2.getLanguage()) {
			return o2.getLanguage() - o1.getLanguage();
		} else {
			if (o1.getEnglish() != o2.getEnglish()) {
				return o1.getEnglish() - o2.getEnglish();
			} else {
				if (o1.getMath() != o2.getMath()) {
					return o2.getMath() - o1.getMath();
				} else {
					int length = 0;
					if (o1.getName().length() < o2.getName().length()) {
						length = o1.getName().length();
					} else {
						length = o2.getName().length();
					}
					for(int i=0; i<length; i++){
						if(o1.getName().substring(i, i+1).equals(o2.getName().substring(i, i+1))){
							continue;
						}
						return o1.getName().charAt(i) - o2.getName().charAt(i);
					}
				}
			}
		}
		return 0;
	}
}

class Pair {
	private int language;
	private int english;
	private int math;
	private String name;

	Pair(String name, int language, int english, int math) {
		this.name = name;
		this.language = language;
		this.english = english;
		this.math = math;
	}

	public int getLanguage() {
		return language;
	}

	public int getEnglish() {
		return english;
	}

	public int getMath() {
		return math;
	}

	public String getName() {
		return name;
	}

}
