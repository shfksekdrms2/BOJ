package com.solution.boj.solution;

import java.util.Scanner;

//5598
public class GaiusJuliusCaesarEncryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] arr = input.toCharArray();
        int i;
        for (i = 0; i < input.length(); i++) {
//			System.out.println("(int)arr[i]: "+ (int)arr[i]);
//			System.out.println("arr[i]: "+ arr[i]);
            if ((int) arr[i] - 3 - 65 < 0) {
//				System.out.println("(int)arr[i]-3-65 : "+((int)arr[i]-3-65));
                System.out.print((char) (arr[i] - 3 + 26));
            } else {
                System.out.print((char) (arr[i] - 3));
            }
        }
    }
}
