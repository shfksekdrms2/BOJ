package backjoon.BOJ.print.p_9654;

/*
 * https://www.acmicpc.net/problem/9654
 * 나부 함대 데이터
 */
public class Main {
	public static void main(String[] args) {
		System.out.println(String.format("%-15s%-15s%-11s%-10s", "SHIP NAME", "CLASS", "DEPLOYMENT", "IN SERVICE"));
		System.out.println(String.format("%-15s%-15s%-11s%-10s", "N2 Bomber", "Heavy Fighter", "Limited", "21"));
		System.out.println(String.format("%-15s%-15s%-11s%-10s", "J-Type 327", "Light Combat", "Unlimited", "1"));
		System.out.println(String.format("%-15s%-15s%-11s%-10s", "NX Cruiser", "Medium Fighter", "Limited", "18"));
		System.out.println(String.format("%-15s%-15s%-11s%-10s", "N1 Starfighter", "Medium Fighter", "Unlimited", "25"));
		System.out.println(String.format("%-15s%-15s%-11s%-10s", "Royal Cruiser", "Light Combat", "Limited", "4"));
	}
}
