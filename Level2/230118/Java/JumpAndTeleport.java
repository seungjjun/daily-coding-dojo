public class JumpAndTeleport {
    public int solution(int n) {
        int ans = 0;

        while (n != 0) {
            if(n % 2 > 0) {
                ans += n % 2;
                n -= n % 2;
            }

            if (n % 2 == 0) {
                n /= 2;
            }
        }

        return ans;
    }
}
