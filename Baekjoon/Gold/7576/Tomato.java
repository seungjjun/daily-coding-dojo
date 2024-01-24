package com.study.springadvanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Tomato {
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, -1, 0, 1};
    public static int N;
    public static int M;
    public static int count;

    public static class State {
        private final int x;
        private final int y;
        private final int depth;

        public State(int x, int y, int depth) {
            this.x = x;
            this.y = y;
            this.depth = depth;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());

        int[][] map = new int[M][N];
        Queue<State> queue = new LinkedList<>();

        for (int i = 0; i < M; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(stringTokenizer.nextToken());
                if (map[i][j] == 1) {
                    queue.add(new State(j, i, 0));
                }
            }
        }

        count = 0;
        bfs(queue, map);

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
            }
        }

        System.out.println(count);
    }

    private static void bfs(Queue<State> queue, int[][] map) {
        while (!queue.isEmpty()) {
            State state = queue.poll();
            count = Math.max(count, state.depth);

            for (int i = 0; i < 4; i++) {
                int nextX = state.x + dx[i];
                int nextY = state.y + dy[i];

                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M || map[nextY][nextX] != 0) {
                    continue;
                }

                map[nextY][nextX] = 1;
                queue.add(new State(nextX, nextY, state.depth + 1));
            }
        }
    }
}
