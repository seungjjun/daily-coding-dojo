public class Tiredness {
    private static int answer;
    private static boolean[] visited;

    public int solution(int k, int[][] dungeons) {
        answer = 0;

        visited = new boolean[dungeons.length];

        dfs(k, dungeons, 0);

        return answer;
    }

    private void dfs(int k, int[][] dungeons, int depth) {
        answer = Math.max(answer, depth);

        for (int i = 0; i < dungeons.length; i += 1) {
            if (dungeons[i][0] <= k && !visited[i]) {
                visited[i] = true;
                k -= dungeons[i][1];

                dfs(k, dungeons, depth + 1);

                visited[i] = false;
                k += dungeons[i][1];
            }
        }
    }
}
