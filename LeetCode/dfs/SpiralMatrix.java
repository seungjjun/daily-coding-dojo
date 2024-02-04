package com.study.springadvanced;

import java.util.Stack;

public class SpiralMatrix {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public class State {
        private int x;
        private int y;
        private int number;
        private String position;

        public State(int x, int y, int number, String position) {
            this.x = x;
            this.y = y;
            this.number = number;
            this.position = position;
        }
    }

    public int[][] generateMatrix(int n) {
        int[][] map = new int[n][n];
        boolean[][] isVisited = new boolean[n][n];

        Stack<State> stack = new Stack<>();
        stack.add(new State(0, 0, 1, "right"));

        while (!stack.isEmpty()) {
            State state = stack.pop();

            if (state.number > n * n) {
                break;
            }

            isVisited[state.y][state.x] = true;
            map[state.y][state.x] = state.number;

            if (state.position.equals("right")) {
                int nextX = state.x + dx[0];
                int nextY = state.y + dy[0];

                if (checkMap(nextX, nextY, map, isVisited)) {
                    stack.add(new State(state.x, state.y + 1, state.number + 1, "down"));
                    continue;
                }

                stack.add(new State(nextX, nextY, state.number + 1, "right"));
            }

            if (state.position.equals("down")) {
                int nextX = state.x + dx[1];
                int nextY = state.y + dy[1];

                if (checkMap(nextX, nextY, map, isVisited)) {
                    stack.add(new State(state.x - 1, state.y, state.number + 1, "left"));
                    continue;
                }

                stack.add(new State(nextX, nextY, state.number + 1, "down"));
            }

            if (state.position.equals("left")) {
                int nextX = state.x + dx[2];
                int nextY = state.y + dy[2];

                if (checkMap(nextX, nextY, map, isVisited)) {
                    stack.add(new State(state.x, state.y - 1, state.number + 1, "up"));
                    continue;
                }

                stack.add(new State(nextX, nextY, state.number + 1, "left"));
            }

            if (state.position.equals("up")) {
                int nextX = state.x + dx[3];
                int nextY = state.y + dy[3];

                if (checkMap(nextX, nextY, map, isVisited)) {
                    stack.add(new State(state.x + 1, state.y, state.number + 1, "right"));
                    continue;
                }

                stack.add(new State(nextX, nextY, state.number + 1, "up"));
            }
        }

        return map;
    }

    private static boolean checkMap(int nextX, int nextY, int[][] map, boolean[][] isVisited) {
        return nextX < 0 || nextY < 0 || nextX >= map[0].length || nextY >= map.length || isVisited[nextY][nextX];
    }
}
