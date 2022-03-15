package com.solution.boj.solution;

import java.util.Arrays;
import java.util.Scanner;

//10610
public class thirty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int arr[] = new int[str.length()];
        int i;
        int sum = 0;
        for (i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i) - 48;
            sum += arr[i];
        }
        Arrays.sort(arr);
        if (sum % 3 == 0 && arr[0] == 0) {
            for (i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i]);
            }
        } else {
            System.out.println("-1");
        }
    }
}
