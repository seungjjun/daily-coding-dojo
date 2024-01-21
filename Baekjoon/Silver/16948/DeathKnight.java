package com.beside.wotd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DeathKnight {
    private static final int[] dx = {-2, -2, 0, 0, 2, 2};
    private static final int[] dy = {-1, 1, -2, 2, -1, 1};


    public static class State {
        private final int x;
        private final int y;
        private final int step;

        public State(int x, int y, int step) {
            this.x = x;
            this.y = y;
            this.step = step;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int r1 = Integer.parseInt(stringTokenizer.nextToken());
        int c1 = Integer.parseInt(stringTokenizer.nextToken());
        int r2 = Integer.parseInt(stringTokenizer.nextToken());
        int c2 = Integer.parseInt(stringTokenizer.nextToken());

        boolean[][] isVisited = new boolean[N][N];
        Queue<State> queue = new LinkedList<>();
        queue.add(new State(r1, c1, 0));

        while (!queue.isEmpty()) {
            State state = queue.poll();
            isVisited[state.y][state.x] = true;

            for (int i = 0; i < dx.length; i += 1) {
                int nextX = dx[i] + state.x;
                int nextY = dy[i] + state.y;

                if (nextX < 0 || nextX >= N || nextY < 0 || nextY >= N) {
                    continue;
                }

                if (nextX == r2 && nextY == c2) {
                    System.out.println(state.step + 1);
                    return;
                }

                if (isVisited[nextY][nextX]) {
                    continue;
                }

                isVisited[nextY][nextX] = true;
                queue.add(new State(nextX, nextY, state.step + 1));
            }
        }

        System.out.println(-1);
    }
}
