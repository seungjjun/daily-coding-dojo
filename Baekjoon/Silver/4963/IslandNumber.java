import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class IslandNumber {
    static int[] dx = {-1, 0, 1, 0, -1, 1, -1, 1};
    static int[] dy = {0, 1, 0, -1, 1, 1, -1, -1};
    static int count;
    static int W;
    static int H;

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

        while (true) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            W = Integer.parseInt(stringTokenizer.nextToken());
            H = Integer.parseInt(stringTokenizer.nextToken());

            if (W == 0 && H == 0) {
                break;
            }

            int[][] map = new int[H][W];

            for (int i = 0; i < H; i += 1) {
                stringTokenizer = new StringTokenizer(bufferedReader.readLine());

                for (int j = 0; j < W; j += 1) {
                    map[i][j] = Integer.parseInt(stringTokenizer.nextToken());
                }
            }

            boolean[][] isVisited = new boolean[H][W];

            count = 0;

            for (int i = 0; i < H; i += 1) {
                for (int j = 0; j < W; j += 1) {
                    if (!isVisited[i][j] && map[i][j] == 1) {
                        bfs(i, j, map, isVisited);
                        count += 1;
                    }
                }
            }

            System.out.println(count);
        }
    }

    private static void bfs(int y, int x, int[][] map, boolean[][] isVisited) {
        Queue<State> queue = new LinkedList<>();
        queue.add(new State(x, y));
        isVisited[y][x] = true;

        while (!queue.isEmpty()) {
            State state = queue.poll();

            for (int i = 0; i < dx.length; i += 1) {
                int nextX = state.x + dx[i];
                int nextY = state.y + dy[i];

                if (nextX < 0 || nextX >= W || nextY < 0 || nextY >= H) {
                    continue;
                }

                if (isVisited[nextY][nextX] || map[nextY][nextX] == 0) {
                    continue;
                }

                isVisited[nextY][nextX] = true;
                queue.add(new State(nextX, nextY));
            }
        }
    }
}
