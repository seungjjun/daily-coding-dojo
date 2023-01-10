import java.util.PriorityQueue;

public class Spicy {
    public int solution(int[] scovilles, int K) {
        int count = 0;

        PriorityQueue<Integer> scovilleQueue = new PriorityQueue<>();

        for (int scoville : scovilles) {
            scovilleQueue.add(scoville);
        }

        while (scovilleQueue.peek() < K) {
            if (scovilleQueue.size() == 1) {
                return -1;
            }

            int firstFood = scovilleQueue.poll();
            int secondFood = scovilleQueue.poll();

            scovilleQueue.add(firstFood + (secondFood * 2));

            count += 1;
        }

        return count;
    }
}
