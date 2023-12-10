import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hanoi {
    static StringBuffer sb;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuffer();

        int N = Integer.parseInt(br.readLine());

        hanoi(N, 1, 3);

        System.out.println(count);
        System.out.println(sb);
    }

    private static void hanoi(int k, int from, int to) {
        if (k == 1) {
            count += 1;
            sb.append(from + " " + to).append("\n");
            return;
        }

        int empty = 6 - from - to;

        hanoi(k - 1, from, empty);
        hanoi(1, from, to);
        hanoi(k - 1, empty, to);
    }
}
