package com.solution.boj.solution;

import java.util.Scanner;

//3613
public class javaVSc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.next().toCharArray();
        int i;
        String result = "";
        boolean error = false;
        int cnt[] = new int[2];
        //ó��, ��������  _ �� ���
        //ó���� �빮�ڷ� �����ϴ� ���
        if (input[0] == '_' ||
                input[input.length - 1] == '_' ||
                (input[0] >= 'A' && input[0] <= 'Z')) {
            System.out.println("Error!");
            return;
        }
        for (i = 0; i < input.length; i++) {
            if (input[i] == '_') {
                //�������� _ �� ��� ������쿡 ���� ����
                //_ ������ �ҹ��ڰ� ���� ���� ��쿡 ���� ����
                if (input[i + 1] != '_' &&
                        (input[i + 1] >= 'a' && input[i + 1] <= 'z')) {
                    i++;
                    input[i] -= 32;
                    cnt[0] = 1;
                } else {
                    error = true;
                    break;
                }
            } else if (input[i] >= 'A' && input[i] <= 'Z') {
                result += "_";
                input[i] += 32;
                cnt[1] = 1;
            }
            result += input[i];
        }
        //ȥ���� ��� üũ
        if (cnt[0] + cnt[1] == 2) {
            error = true;
        }
        if (error == false) {
            System.out.println(result);
        } else {
            System.out.println("Error!");
        }
    }
}
