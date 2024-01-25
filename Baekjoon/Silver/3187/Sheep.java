import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Sheep {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int R;
    static int C;
    static int wolf;
    static int sheep;

    public static class State {
        private final int x;
        private final int y;

        public State(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        R = Integer.parseInt(stringTokenizer.nextToken());
        C = Integer.parseInt(stringTokenizer.nextToken());

        char[][] map = new char[R][C];
        boolean[][] isVisited = new boolean[R][C];

        for (int i = 0; i < R; i += 1) {
            String line = bufferedReader.readLine();

            for (int j = 0; j < C; j += 1) {
                map[i][j] = line.charAt(j);
            }
        }

        for (int i = 0; i < map.length; i += 1) {
            for (int j = 0; j < map[i].length; j += 1) {
                if (!isVisited[i][j] && map[i][j] != '#') {
                    int wolfCount = 0;
                    int sheepCount = 0;
                    dfs(i, j, map, isVisited, wolfCount, sheepCount);
                }
            }
        }

        System.out.println(sheep + " " + wolf);
    }

    private static void dfs(int y, int x, char[][] map, boolean[][] isVisited, int wolfCount, int sheepCount) {
        Stack<State> stack = new Stack<>();
        stack.add(new State(x, y));
        isVisited[y][x] = true;

        while (!stack.isEmpty()) {
            State state = stack.pop();

            if (map[state.y][state.x] == 'v') {
                wolfCount += 1;
            }

            if (map[state.y][state.x] == 'k') {
                sheepCount += 1;
            }

            for (int i = 0; i < 4; i += 1) {
                int nextX = state.x + dx[i];
                int nextY = state.y + dy[i];

                if (nextX < 0 || nextY < 0 || nextX >= C || nextY >= R || isVisited[nextY][nextX] || map[nextY][nextX] == '#') {
                    continue;
                }

                isVisited[nextY][nextX] = true;
                stack.add(new State(nextX, nextY));
            }
        }

        if (wolfCount >= sheepCount) {
            wolf += wolfCount;
        } else {
            sheep += sheepCount;
        }
    }
}
