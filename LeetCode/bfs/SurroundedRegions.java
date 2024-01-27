package com.study.springadvanced;

import java.util.LinkedList;
import java.util.Queue;

public class SurroundedRegions {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    public static class State {
        private final int x;
        private final int y;

        public State(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public void solve(char[][] board) {
        int y = board.length;
        int x = board[0].length;

        for (int i = 0; i < y; i += 1) {
            if (board[i][0] == 'O') {
                bfs(i, 0, board);
            }

            if (board[i][x - 1] == 'O') {
                bfs(i, x - 1, board);
            }
        }

        for (int j = 1; j < x - 1; j += 1) {
            if (board[0][j] == 'O') {
                bfs(0, j, board);
            }

            if (board[y - 1][j] == 'O') {
                bfs(y - 1, j, board);
            }
        }

        for (int i = 0; i < board.length; i += 1) {
            for (int j = 0; j < board[0].length; j += 1) {
                if (board[i][j] == 'T') {
                    board[i][j] = 'O';
                }

                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }

    private void bfs(int y, int x, char[][] board) {
        Queue<State> queue = new LinkedList<>();
        queue.add(new State(x, y));
        board[y][x] = 'T';

        while (!queue.isEmpty()) {
            State state = queue.poll();

            for (int i = 0; i < dx.length; i += 1) {
                int nextX = state.x + dx[i];
                int nextY = state.y + dy[i];

                if (nextX < 0 || nextY < 0 || nextX >= board[0].length || nextY >= board.length || board[nextY][nextX] != 'O') {
                    continue;
                }

                queue.add(new State(nextX, nextY));
                board[nextY][nextX] = 'T';
            }
        }
    }
}


/*
public void solve(char[][] board) {
        for (int y = 0; y < board.length; y += 1) {
            for (int x = 0; x < board[0].length; x += 1) {
                if (x == 0 || x == board[0].length - 1 || y == 0 || y == board.length - 1) {
                    if (board[y][x] == 'O') {
                        dfs(x, y, board);
                    }
                }
            }
        }

        for (int y = 0; y < board.length; y += 1) {
            for (int x = 0; x < board[0].length; x += 1) {
                char region = board[y][x];
                if (region == 'O') {
                    board[y][x] = 'X';
                }

                if (region == 'T') {
                    board[y][x] = 'O';
                }
            }
        }
    }

    private void dfs(int nextX, int nextY, char[][] board) {
        if (nextX < 0 || nextY < 0 || nextX >= board[0].length || nextY >= board.length || board[nextY][nextX] != 'O') {
            return;
        }

        board[nextY][nextX] = 'T';
        dfs(nextX + 1, nextY, board);
        dfs(nextX - 1, nextY, board);
        dfs(nextX, nextY + 1, board);
        dfs(nextX, nextY - 1, board);
    }
 */