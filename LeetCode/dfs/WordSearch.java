public class WordSearch {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public boolean exist(char[][] board, String word) {
        char[] targets = word.toCharArray();
        boolean[][] isVisited = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(i, j, board, targets, 0, isVisited)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(int y, int x, char[][] board, char[] targets, int index, boolean[][] isVisited) {
        if (index == targets.length) {
            return true;
        }
        if (y < 0 || y >= board.length || x < 0 || x >= board[0].length) {
            return false;
        }
        if (isVisited[y][x] || board[y][x] != targets[index]) {
            return false;
        }

        isVisited[y][x] = true;

        for (int i = 0; i < dx.length; i += 1) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            if (dfs(nextY, nextX, board, targets, index + 1, isVisited)) {
                return true;
            }
        }

        isVisited[y][x] = false;
        return false;
    }
}
