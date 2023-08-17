public class Paint {
    public int solution(int n, int m, int[] section) {
        int answer = 0;

        int wall = section[0];
        answer += 1;

        for (int wallNumber : section) {
            if (wall + m > wallNumber) {
                continue;
            }

            wall = wallNumber;
            answer += 1;
        }

        return answer;
    }
}
