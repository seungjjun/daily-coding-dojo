import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PasteNumber {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int apartNumber = 1;
    static ArrayList<Integer> apartComplex;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        map = new int[N][N];
        visited = new boolean[N][N];
        apartComplex = new ArrayList<>();

        for (int i = 0; i < N; i += 1) {
            String line = scanner.next();
            for (int j = 0; j < N; j += 1) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        for (int i = 0; i < map.length; i += 1) {
            for (int j = 0; j < map.length; j += 1) {
                if (!visited[i][j] && map[i][j] == 1) {
                    dfs(map[i][j], i, j);

                    apartComplex.add(apartNumber);
                    apartNumber = 1;
                }
            }
        }

        Collections.sort(apartComplex);
        System.out.println(apartComplex.size());
        for (int i = 0; i < apartComplex.size(); i += 1) {
            System.out.println(apartComplex.get(i));
        }
    }

    private static void dfs(int currentNumber, int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i += 1) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if (nextX >= 0 && nextY >= 0 && nextX < N && nextY < N && currentNumber != 0) {
                if (!visited[nextX][nextY] && currentNumber == map[nextX][nextY]) {
                    apartNumber += 1;
                    dfs(currentNumber, nextX, nextY);
                }
            }
        }
    }
}
