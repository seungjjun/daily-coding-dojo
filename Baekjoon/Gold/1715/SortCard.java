import java.util.PriorityQueue;
import java.util.Scanner;

public class SortCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < N; i += 1) {
            queue.add(scanner.nextInt());
        }

        int count = 0;
        while (queue.size() != 1) {
            int card1 = queue.remove();
            int card2 = queue.remove();
            count += card1 + card2;
            queue.add(card1 + card2);
        }

        System.out.println(count);
    }
}
