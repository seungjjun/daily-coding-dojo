import java.util.LinkedList;
import java.util.Queue;

public class SumTwoQueue {
    public long solution(int[] queue1, int[] queue2) {
        long answer = 0;

        Queue<Integer> queueA = new LinkedList<>();
        Queue<Integer> queueB = new LinkedList<>();

        long sumA = 0;
        long sumB = 0;

        for (int i = 0; i < queue1.length; i += 1) {
            sumA += queue1[i];
            queueA.add(queue1[i]);

            sumB += queue2[i];
            queueB.add(queue2[i]);
        }

        if ((sumA + sumB) % 2 != 0) {
            return -1;
        }

        int end = (queueA.size() + queueB.size()) * 2;

        while (sumA != sumB) {
            answer += 1;

            if (answer > end) {
                return -1;
            }

            if (queueB.isEmpty() || queueA.isEmpty()) {
                return -1;
            }

            if (sumA <= sumB) {
                int number = queueB.poll();
                sumB -= number;
                sumA += number;
                queueA.add(number);

                continue;
            }

            int number = queueA.poll();
            sumA -= number;
            sumB += number;
            queueB.add(number);

        }

        return answer;
    }
}
