import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class War {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static Character[][] map;
    static boolean[][] visited;
    static int N;
    static int M;
    static int colorValue = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        M = Integer.parseInt(stringTokenizer.nextToken());
        N = Integer.parseInt(stringTokenizer.nextToken());

        map = new Character[N][M];
        visited = new boolean[N][M];

        int allySum = 0;
        int enemySum = 0;

        for (int i = 0; i < N; i += 1) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String line = stringTokenizer.nextToken();
            for (int j = 0; j < M; j += 1) {
                char color = line.charAt(j);
                map[i][j] = color;
            }
        }

        for (int i = 0; i < N; i += 1) {
            for (int j = 0; j < M; j += 1) {
                if (!visited[i][j]) {
                    char currentColor = map[i][j];
                    dfs(currentColor, i, j);

                    if (currentColor == 'W') {
                        allySum += Math.pow(colorValue, 2);
                        colorValue = 1;
                        continue;
                    }
                    if (currentColor == 'B') {
                        enemySum += Math.pow(colorValue, 2);
                        colorValue = 1;
                    }
                }
            }
        }

        System.out.println(allySum + " " + enemySum);
    }

    private static void dfs(char currentColor, int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i += 1) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if (nextX >= 0 && nextY >= 0 && nextX < N && nextY < M && !visited[nextX][nextY]) {
                if (currentColor == map[nextX][nextY]) {
                    colorValue += 1;
                    dfs(currentColor, nextX, nextY);
                }
            }
        }
    }
}
