import java.util.Scanner;

public class Coin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int[] coins = new int[N];

        for (int i = 0; i < N; i += 1) {
            coins[i] = scanner.nextInt();
        }

        int count = 0;

        for (int i = coins.length - 1; i >= 0; i -= 1) {
            if(K >= coins[i]) {
                count += K / coins[i];
                K %= coins[i];
            }

            if(K == 0) {
                break;
            }
        }

        System.out.println(count);
    }
}
