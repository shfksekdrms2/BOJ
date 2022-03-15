package com.solution.boj.solution;

import java.util.Scanner;

//9933
public class minPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        int i, j;
        for (i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        if (n == 1) {
            System.out.println(str[0].length() + " " + str[0].substring(str[0].length() / 2, str[0].length() / 2 + 1));
            return;
        }
        boolean success = false;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                //���̰� ������ Ȯ��
                if (str[i].length() == str[j].length()) {
                    //����� ������ Ȯ��
                    if (str[i].substring(str[i].length() / 2, str[i].length() / 2 + 1).
                            equals(str[j].substring(str[j].length() / 2, str[j].length() / 2 + 1))) {
                        success = false;
                        for (int k = 0; k < str[i].length(); k++) {
                            if (str[i].substring(k, k + 1).equals(str[j].substring(str[i].length() - 1 - (k), str[i].length() - (k)))) {
                                success = true;
                            } else {
                                success = false;
                                break;
                            }
                        }
                    }
                }
                if (success == true) {
                    System.out.println(str[i].length() + " " + str[i].substring(str[i].length() / 2, str[i].length() / 2 + 1));
                    break;
                }
            }
            if (success == true) {
                break;
            }
        }
        if (success == false) {
            System.out.println(str[0].length() + " " + str[0].substring(str[0].length() / 2, str[0].length() / 2 + 1));
        }

    }
}
