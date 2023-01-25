import java.util.LinkedList;
import java.util.Queue;

public class Truck {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        Queue<Integer> bridgeQueue = new LinkedList<>();

        int currentBridgeWeight = 0;

        for (Integer truckWeight : truck_weights) {
            while (true) {
                if (bridgeQueue.isEmpty()) {
                    bridgeQueue.offer(truckWeight);

                    currentBridgeWeight += truckWeight;

                    answer += 1;
                    break;
                }

                if(!bridgeQueue.isEmpty()) {
                    if (bridgeQueue.size() == bridge_length) {
                        currentBridgeWeight -= bridgeQueue.poll();
                        continue;
                    }

                    if(currentBridgeWeight + truckWeight > weight) {
                        bridgeQueue.offer(0);
                        answer += 1;

                        continue;
                    }

                    bridgeQueue.offer(truckWeight);

                    currentBridgeWeight += truckWeight;
                    answer += 1;

                    break;
                }

            }
        }

        return answer + bridge_length;
    }
}
