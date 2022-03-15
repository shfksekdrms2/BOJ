package com.solution.boj.solution;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//2178
public class mazeSearch {
    static int arr[][];
    static int visit[][];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int i, j;
        arr = new int[x][y];
        visit = new int[x][y];
        for (i = 0; i < arr.length; i++) {
            String[] str = sc.next().split("");
            for (j = 1; j <= arr[i].length; j++) {
                arr[i][j - 1] = Integer.parseInt(str[j]);
            }
        }
        int positionX = 0;
        int positionY = 0;
        dfs(positionX, positionY);
        System.out.println(visit[x - 1][y - 1]);
    }

    public static void dfs(int x, int y) {
        Queue<pair> queue = new LinkedList<>();
        mazeSearch maze = new mazeSearch();
        queue.add(maze.new pair(x, y));
        visit[x][y] = 1;
        while (!queue.isEmpty()) {
            x = queue.peek().getX();
            y = queue.peek().getY();
            queue.remove();
//			System.out.println("x: "+x+" y: "+y);
            //right
            if (x + 1 < arr.length) {
                if (arr[x + 1][y] == 1 && visit[x + 1][y] == 0) {
//					System.out.println("right");
                    visit[x + 1][y] = visit[x][y] + 1;
                    queue.add(maze.new pair(x + 1, y));
                }
            }
            //left
            if (x - 1 >= 0) {
                if (arr[x - 1][y] == 1 && visit[x - 1][y] == 0) {
//					System.out.println("left");
                    visit[x - 1][y] = visit[x][y] + 1;
                    queue.add(maze.new pair(x - 1, y));
                }
            }
            //up
            if (y - 1 >= 0) {
                if (arr[x][y - 1] == 1 && visit[x][y - 1] == 0) {
//					System.out.println("up");
                    visit[x][y - 1] = visit[x][y] + 1;
                    queue.add(maze.new pair(x, y - 1));
                }
            }
            //down
            if (y + 1 < arr[0].length) {
                if (arr[x][y + 1] == 1 && visit[x][y + 1] == 0) {
//					System.out.println("down");
                    visit[x][y + 1] = visit[x][y] + 1;
                    queue.add(maze.new pair(x, y + 1));
                }
            }
        }
    }

    class pair {
        private int x;
        private int y;

        public pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return this.x;
        }

        public int getY() {
            return this.y;
        }
    }
}
