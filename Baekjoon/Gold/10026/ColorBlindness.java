import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ColorBlindness {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static Character[][] colors;
    static boolean[][] visited;
    static int N;
    static int red;
    static int green;
    static int blue;
    static int redGreen;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        N = Integer.parseInt(stringTokenizer.nextToken());

        colors = new Character[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i += 1) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String line = stringTokenizer.nextToken();

            for (int j = 0; j < N; j += 1) {
                char color = line.charAt(j);
                colors[i][j] = color;
            }
        }

        for (int i = 0; i < N; i += 1) {
            for (int j = 0; j < N; j += 1) {
                if (!visited[i][j]) {
                    char currentColor = colors[i][j];

                    if (currentColor == 'R') {
                        dfs(currentColor, i, j);
                        red += 1;
                        continue;
                    }

                    if (currentColor == 'G') {
                        dfs(currentColor, i, j);
                        green += 1;
                        continue;
                    }

                    if (currentColor == 'B') {
                        dfs(currentColor, i, j);
                        blue += 1;
                    }
                }
            }
        }

        for (int i = 0; i < N; i += 1) {
            for (int j = 0; j < N; j += 1) {
                if (colors[i][j] == 'G') {
                    colors[i][j] = 'R';
                }
            }
        }

        visited = new boolean[N][N];
        blue = 0;

        for (int i = 0; i < N; i += 1) {
            for (int j = 0; j < N; j += 1) {
                if(!visited[i][j]) {
                    char currentColor = colors[i][j];

                    if (currentColor == 'R') {
                        dfs(currentColor, i, j);
                        redGreen += 1;
                        continue;
                    }

                    if (currentColor == 'B') {
                        dfs(currentColor, i, j);
                        blue += 1;
                    }
                }
            }
        }

        System.out.print(red + green + blue + " ");
        System.out.println(redGreen + blue);
    }

    private static void dfs(char currentColor, int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i += 1) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if (nextX >= 0 && nextY >= 0 && nextX < N && nextY < N && !visited[nextX][nextY]) {
                if (currentColor == colors[nextX][nextY]) {
                    dfs(colors[nextX][nextY], nextX, nextY);
                }
            }
        }
    }
}
