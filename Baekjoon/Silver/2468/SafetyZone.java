import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class SafetyZone {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int N;

    static class State {
        private final int x;
        private final int y;

        public State(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;

        N = Integer.parseInt(bufferedReader.readLine());

        int[][] map = new int[N][N];

        int maxHeight = 0;
        for (int i = 0; i < N; i += 1) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            for (int j = 0; j < N; j += 1) {
                map[i][j] = Integer.parseInt(stringTokenizer.nextToken());
                if (maxHeight < map[i][j]) {
                    maxHeight = map[i][j];
                }
            }
        }

        int max = 0;
        for (int i = 0; i < maxHeight + 1; i += 1) {
            boolean[][] isVisited = new boolean[N][N];
            int count = 0;

            for (int j = 0; j < N; j += 1) {
                for (int k = 0; k < N; k += 1) {
                    if (map[j][k] > i && !isVisited[j][k]) {
                        dfs(i, j, k, map, isVisited);
                        count += 1;
                    }
                }
            }

            max = Math.max(max, count);
        }

        System.out.println(max);
    }

    private static void dfs(int height, int y, int x, int[][] map, boolean[][] isVisited) {
        Queue<State> queue = new LinkedList<>();
        queue.add(new State(x, y));
        isVisited[y][x] = true;

        while (!queue.isEmpty()) {
            State state = queue.poll();

            for (int j = 0; j < 4; j += 1) {
                int nextX = state.x + dx[j];
                int nextY = state.y + dy[j];

                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= N) {
                    continue;
                }

                if (map[nextY][nextX] <= height || isVisited[nextY][nextX]) {
                    continue;
                }

                isVisited[nextY][nextX] = true;
                queue.add(new State(nextX, nextY));
            }
        }
    }
}
