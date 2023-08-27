import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sheep {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[][] visited;
    static Character[][] map;
    static int row;
    static int column;

    static int totalSheepNumber;
    static int totalWolfNumber;
    static int wolf;
    static int sheep;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        row = Integer.parseInt(stringTokenizer.nextToken());
        column = Integer.parseInt(stringTokenizer.nextToken());

        map = new Character[row][column];
        visited = new boolean[row][column];

        for (int i = 0; i < row; i += 1) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String line = stringTokenizer.nextToken();

            for (int j = 0; j < column; j += 1) {
                char location = line.charAt(j);
                map[i][j]= location;
            }
        }

        for (int i = 0; i < row; i += 1) {
            for (int j = 0; j < column; j += 1) {
                char currentLocation = map[i][j];
                if (!visited[i][j] && map[i][j] != '#') {
                    wolf = 0;
                    sheep = 0;

                    dfs(currentLocation, i, j);
                    if (wolf != 0 && wolf >= sheep) {
                        totalWolfNumber += wolf;
                        wolf = 0;
                        continue;
                    }

                    if (sheep != 0 & wolf < sheep) {
                        totalSheepNumber += sheep;
                        sheep = 0;
                    }
                }
            }
        }


        System.out.print(totalSheepNumber + " " + totalWolfNumber);
    }

    private static void dfs(char currentLocation, int x, int y) {
        visited[x][y] = true;
        if (currentLocation == 'v') {
            wolf += 1;
        }

        if (currentLocation == 'o') {
            sheep += 1;
        }

        for (int i = 0; i < 4; i += 1) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if (nextX >= 0 && nextY >= 0 && nextX < row && nextY < column) {
                if (!visited[nextX][nextY] && map[nextX][nextY] != '#'){
                    dfs(map[nextX][nextY], nextX, nextY);
                }
            }
        }
    }
}
