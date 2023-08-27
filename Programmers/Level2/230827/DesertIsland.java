package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class DesertIsland {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int sum = 0;

    public int[] solution(String[] maps) {
        List<Integer> answer = new ArrayList<>();
        boolean[][] visited = new boolean[maps.length][maps[0].length()];

        for (int i = 0; i < maps.length; i += 1) {
            for (int j = 0; j < maps[i].length(); j += 1) {
                if (!visited[i][j] && maps[i].charAt(j) != 'X') {
                    dfs(visited, maps, i, j);
                    answer.add(sum);
                    sum = 0;
                }
            }
        }
        if (answer.size() == 0) {
            return new int[]{-1};
        }

        Collections.sort(answer);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    private void dfs(boolean[][] visited, String[] maps, int x, int y) {
        visited[x][y] = true;
        sum += maps[x].charAt(y) - '0';

        for (int i = 0; i < 4; i += 1) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if (nextX >= 0 && nextY >= 0 && nextX < maps.length && nextY < maps[nextX].length()) {
                if (!visited[nextX][nextY] && maps[nextX].charAt(nextY) != 'X') {
                    dfs(visited, maps, nextX, nextY);
                }
            }
        }
    }
}
