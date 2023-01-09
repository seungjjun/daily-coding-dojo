import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class StockPrices {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        List<Integer> list = new ArrayList<>();

        Queue<Integer> queuePrices = new LinkedList<>();

        for(Integer price : prices) {
            queuePrices.add(price);
        }

        while (!queuePrices.isEmpty()) {
            int time = 0;

            for (int i = list.size(); i < prices.length; i += 1) {
                time += 1;

                if(queuePrices.peek() > prices[i]) {
                    list.add(time - 1);
                    queuePrices.poll();

                    break;
                }

                if(i == prices.length - 1) {
                    list.add(time - 1);
                    queuePrices.poll();

                    break;
                }
            }
        }

        for(int i = 0; i < list.size(); i += 1) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
