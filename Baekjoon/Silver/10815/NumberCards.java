import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, Integer> cards = new HashMap();
        int N = scanner.nextInt();

        for (int i = 0; i < N; i += 1) {
            int number = scanner.nextInt();
            cards.put(number, number);
        }

        int M = scanner.nextInt();

        for (int i = 0; i < M; i += 1) {
            int number = scanner.nextInt();
            if (cards.containsKey(number)) {
                System.out.print(1 + " ");
            } else {
                System.out.print(0 + " ");
            }
        }
    }
}
