import java.util.Scanner;

public class DecimalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        int[] numbers = new int[N + 1];

        for (int i = 2; i <= N; i += 1) {
            numbers[i] = i;
        }

        for (int i = 2; i <= Math.sqrt(N); i += 1) {
            if(numbers[i] == 0) {
                continue;
            }

            for (int j = i + i; j <= N; j += i) {
                numbers[j] = 0;
            }
        }

        for (int i = M; i <= N; i += 1) {
            if(numbers[i] != 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
