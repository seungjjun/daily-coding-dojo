import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Development {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < progresses.length; i += 1) {
            if ((100 - progresses[i]) % speeds[i] == 0) {
                queue.add((100 - progresses[i]) / speeds[i]);
            }

            if (!((100 - progresses[i]) % speeds[i] == 0)) {
                queue.add((100 - progresses[i]) / speeds[i] + 1);
            }
        }

        while (!queue.isEmpty()) {
            int count = 1;
            int day = queue.poll();


            while (!queue.isEmpty() && day >= queue.peek()) {
                count += 1;

                queue.poll();
            }

            list.add(count);
        }

        int[] answers = new int[list.size()];

        for (int i = 0; i < answers.length; i += 1) {
            answers[i] = list.get(i);
        }

        return answers;
    }
}
