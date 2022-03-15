package com.solution.boj.solution;

import java.util.Scanner;

public class anipang {
    static final int X = 5;
    static final int Y = 5;
    static int arr[][] = new int[X][Y];
    static int remove[][] = new int[X][Y];
    static int visit[][] = new int[X][Y];
    static int cnt = 1;
    static boolean exist = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        for (i = 0; i < X; i++) {
            for (j = 0; j < Y; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        while (true) {
            exist = false;
            findAnipang();
//			System.out.println("----------------start----------------");
//			for(i=0; i<X; i++){
//				for(j=0; j<Y; j++){
//					System.out.src.main.java.com.solution.boj.print(arr[i][j]+" ");
//				}
//				System.out.println();
//			}
//			System.out.println("----------------mid----------------");
            removeAnipang();
//			for(i=0; i<X; i++){
//				for(j=0; j<Y; j++){
//					System.out.src.main.java.com.solution.boj.print(arr[i][j]+" ");
//				}
//				System.out.println();
//			}
//			System.out.println("----------------end----------------");

            if (exist == false) {
                break;
            }
        }

        for (i = 0; i < X; i++) {
            for (j = 0; j < Y; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void removeAnipang() {
        int i, j;
        for (j = 0; j < Y; j++) {
            for (i = X - 1; i >= 0; i--) {
                if (arr[i][j] == 0) {
                    if (i - 1 >= 0) {
                        findNumberAndSwap(i, j);
                    }
                }
            }
        }
    }

    static void findNumberAndSwap(int x, int y) {
        int i;
        for (i = x; i >= 0; i--) {
            if (arr[i][y] != 0) {
                arr[x][y] = arr[i][y];
                arr[i][y] = 0;
                break;
            }
        }
    }

    static void findAnipang() {
        int i, j;
        int k = 0;    //������
        for (i = 0; i < X; i++) {
            for (j = 0; j < Y; j++) {
                cnt = 1;
                findRemoveAnipang(i, j, k);
            }
        }
        visit = new int[X][Y];
        k = 1;        //�Ʒ�
        for (i = 0; i < X; i++) {
            for (j = 0; j < Y; j++) {
                cnt = 1;
                findRemoveAnipang(i, j, k);
            }
        }
        visit = new int[X][Y];
        for (i = 0; i < X; i++) {
            for (j = 0; j < Y; j++) {
                if (remove[i][j] == 1) {
                    arr[i][j] = 0;
                }
            }
        }
        remove = new int[X][Y];
    }

    static void findRemoveAnipang(int x, int y, int k) {
        visit[x][y] = 1;
        //������
        if (k == 0) {
            if (y + 1 < Y) {
                if (arr[x][y] == arr[x][y + 1] && visit[x][y + 1] == 0 && arr[x][y] != 0) {
                    cnt++;
                    findRemoveAnipang(x, y + 1, k);
                }
            }
        }
        //�Ʒ�
        else if (k == 1) {
            if (x + 1 < X) {
                if (arr[x][y] == arr[x + 1][y] && visit[x + 1][y] == 0 && arr[x][y] != 0) {
                    cnt++;
                    findRemoveAnipang(x + 1, y, k);
                }
            }
        }

        if (cnt >= 3) {
            remove[x][y] = 1;
            exist = true;
        }
    }
}
