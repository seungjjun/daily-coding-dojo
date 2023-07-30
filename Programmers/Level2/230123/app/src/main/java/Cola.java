public class Cola {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            int giveCola = (n / a) * a;
            int receiveCola = giveCola / a * b;

            n = n - giveCola + receiveCola;

            answer += receiveCola;
        }

        return answer;
    }
}
