package com.study.springadvanced;

import java.util.Stack;

public class MaxAreaOfIsland {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static class State {
        private final int x;
        private final int y;

        public State(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int maxAreaOfIsland(int[][] grid) {
        int y = grid.length;
        int x = grid[0].length;
        boolean[][] isVisited = new boolean[y][x];

        int island = 0;
        for (int i = 0; i < y; i += 1) {
            for (int j = 0; j < x; j += 1) {
                if (!isVisited[i][j] && grid[i][j] == 1) {
                    island = Math.max(island, dfs(i, j, grid, isVisited));
                }
            }
        }

        return island;
    }

    private int dfs(int y, int x, int[][] grid, boolean[][] isVisited) {
        Stack<State> stack = new Stack<>();
        stack.add(new State(x, y));
        isVisited[y][x] = true;
        int land = 1;

        while (!stack.isEmpty()) {
            State state = stack.pop();

            for (int i = 0; i < dx.length; i += 1) {
                int nextX = state.x + dx[i];
                int nextY = state.y + dy[i];

                if (nextX < 0 || nextY < 0 || nextX >= grid[0].length || nextY >= grid.length || isVisited[nextY][nextX]) {
                    continue;
                }

                if (grid[nextY][nextX] == 0) {
                    continue;
                }

                stack.add(new State(nextX, nextY));
                isVisited[nextY][nextX] = true;
                land += 1;
            }
        }

        return land;
    }
}
