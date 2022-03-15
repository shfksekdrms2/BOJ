package com.solution.boj.섬의개수;

import java.util.Scanner;

public class P_4963 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int col = sc.nextInt();
            int row = sc.nextInt();
            if (row == 0 && col == 0) {
                break;
            }

            // 섬 초기화
            landSum = 0;
            int[][] arr = new int[row][col];
            moveArr = new int[row][col];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    arr[i][j] = sc.nextInt();
                    moveArr[i][j] = 0;
                }
            }

            // 섬의 개수 구하기
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (arr[i][j] == 1 && moveArr[i][j] == 0) {
                        land(i, j, arr);
                        landSum += 1;
                    }
                }
            }
            System.out.println(landSum);
        }
    }

    private static int[][] moveArr;
    private static int landSum;

    /**
     * 섬구하기
     *
     * @Author: jsj0828
     **/
    private static void land(int row, int col, int[][] arr) {
        // 이미 갔으면 리턴
        moveArr[row][col] = 1;

        if (arr[row][col] == 1) {
            // 위 방향
            int upPosition = row - 1;
            // 오른쪽 방향
            int rightPosition = col + 1;
            // 아래 방향
            int downPosition = row + 1;
            // 왼쪽 방향
            int leftPosition = col - 1;

            // 위
            if (upPosition >= 0 && arr[upPosition][col] == 1 && moveArr[upPosition][col] == 0) {
                land(upPosition, col, arr);
            }
            // 오른쪽 위
            if (upPosition >= 0 && rightPosition < arr[row].length
                    && arr[upPosition][rightPosition] == 1 && moveArr[upPosition][rightPosition] == 0) {
                land(upPosition, rightPosition, arr);
            }
            // 오른쪽
            if (rightPosition < arr[row].length && arr[row][rightPosition] == 1 && moveArr[row][rightPosition] == 0) {
                land(row, rightPosition, arr);
            }
            // 오른쪽 아래
            if (downPosition < arr.length && rightPosition < arr[row].length
                    && arr[downPosition][rightPosition] == 1 && moveArr[downPosition][rightPosition] == 0) {
                land(downPosition, rightPosition, arr);
            }
            // 아래
            if (downPosition < arr.length && arr[downPosition][col] == 1 && moveArr[downPosition][col] == 0) {
                land(downPosition, col, arr);
            }
            // 왼쪽 아래
            if (downPosition < arr.length && leftPosition >= 0 && arr[downPosition][leftPosition] == 1 && moveArr[downPosition][leftPosition] == 0) {
                land(downPosition, leftPosition, arr);
            }
            // 왼쪽
            if (leftPosition >= 0 && arr[row][leftPosition] == 1 && moveArr[row][leftPosition] == 0) {
                land(row, leftPosition, arr);
            }
            // 위 왼쪽
            if (upPosition >= 0 && leftPosition >= 0 && arr[upPosition][leftPosition] == 1 && moveArr[upPosition][leftPosition] == 0) {
                land(upPosition, leftPosition, arr);
            }
        }
    }
}
