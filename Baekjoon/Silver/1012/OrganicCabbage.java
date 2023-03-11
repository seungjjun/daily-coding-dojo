import java.util.Scanner;

public class OrganicCabbage {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int M;
    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int bug;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i += 1) {
            bug = 0;
            M = scanner.nextInt();
            N = scanner.nextInt();
            int K = scanner.nextInt();

            map = new int[M][N];
            visited = new boolean[M][N];

            for (int j = 0; j < K; j += 1) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();

                map[x][y] = 1;
            }

            for (int j = 0; j < N; j += 1) {
                for (int k = 0; k < M; k += 1) {
                    if(!visited[k][j] && map[k][j] == 1) {
                        dfs(map[k][j], k, j);
                        bug += 1;
                    }
                }
            }

            System.out.println(bug);
        }
    }

    private static void dfs(int currentCabbage, int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i += 1) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if (nextX >= 0 && nextY >= 0 && nextX < M && nextY < N) {
                if (!visited[nextX][nextY] && currentCabbage != 0) {
                    dfs(map[nextX][nextY], nextX, nextY);
                }
            }
        }
    }
}
