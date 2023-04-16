import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Josephus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        List<Integer> answer = new ArrayList<>();

        for (int i = 1; i <= N; i += 1) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {
            for (int i = 1; i < K; i += 1) {
                int number = queue.remove();
                queue.offer(number);
            }

            int number = queue.remove();
            answer.add(number);
        }

        for (int i = 0; i < answer.size(); i++) {
            if (i == 0) {
                System.out.print("<");
            }
            if (i == answer.size() - 1) {
                System.out.print(answer.get(i) + ">");
                break;
            }
            System.out.print(answer.get(i) + ", ");
        }
    }
}
