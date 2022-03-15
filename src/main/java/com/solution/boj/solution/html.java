package com.solution.boj.solution;

import java.util.Scanner;

//6581
public class html {
    static String br = "<br>";
    static String hr = "<hr>";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputArr;
        String output = "";
        int i, j;
        while (sc.hasNextLine()) {
//		for(j=0; j<13; j++){
            inputArr = sc.nextLine().split(" ");
//			for(int k=0; k<inputArr.length; k++){
//				System.out.println("inputArr["+k+"]:"+ inputArr[k]);
//			}
            for (i = 0; i < inputArr.length; i++) {
                if (inputArr[i].equals("")) {
                    continue;
                }
                if (inputArr[i].equals(br)) {
                    System.out.println(output);
                    output = "";
                    continue;
                } else if (inputArr[i].equals(hr)) {
                    if (output.equals("")) {
                        System.out.print(output);
                    } else {
                        System.out.println(output);
                    }
                    System.out.println("--------------------------------------------------------------------------------");
                    output = "";
                    continue;
                }
                if ((output.length() + inputArr[i].length() + 1) >= 80) {
                    System.out.println(output);
                    output = inputArr[i];
                    continue;
                }
                if (!output.equals("")) {
                    output += " " + inputArr[i];
                } else {
                    output += inputArr[i];
                }
            }
//			System.out.println("end output :"+ output);
        }
        if (!output.equals("")) {
            if (output.length() < 80) {
                System.out.print(output + " ");
            } else {
                System.out.println(output);
            }
        }
    }
}
