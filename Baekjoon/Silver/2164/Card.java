import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Card {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i += 1) {
            queue.add(i);
        }

        while (queue.size() != 1) {
            queue.poll();
            int number = queue.remove();
            queue.add(number);
        }

        System.out.println(queue.remove());
    }
}
