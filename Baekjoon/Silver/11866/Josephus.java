import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Josephus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> answer = new LinkedList<>();

        for (int i = 1; i <= N; i += 1) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < K - 1; i += 1) {
                int number = queue.remove();
                queue.add(number);
            }

            answer.add(queue.remove());
        }

        System.out.print("<");
        for (int i = 0; i < N; i += 1) {
            if(answer.size() == 1) {
                System.out.print(answer.remove());
                continue;
            }

            System.out.print(answer.remove() + ", ");
        }
        System.out.print(">");
    }
}
