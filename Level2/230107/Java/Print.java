import java.util.Collections;
import java.util.PriorityQueue;

public class Print {
    public int solution(int[] priorities, int location) {
        int count = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (Integer priority : priorities) {
            queue.add(priority);
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < priorities.length; i += 1) {
                if (queue.peek() == priorities[i]) {
                    queue.poll();
                    count += 1;

                    if (location == i) {
                        return count;
                    }
                }
            }
        }

        return count;
    }
}
