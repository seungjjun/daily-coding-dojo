import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tangerine {
    public int solution(int k, int[] tangerine) {
        int answer = 0;

        Map<Integer, Integer> tangerines = new HashMap<>();

        for (int i = 0; i < tangerine.length; i += 1) {
            tangerines.put(tangerine[i], tangerines.getOrDefault(tangerine[i], 0) + 1);
        }

        List<Integer> tangerineNumber = new ArrayList<>(tangerines.keySet());

        tangerineNumber.sort((value1, value2) -> tangerines.get(value2).compareTo(tangerines.get(value1)));

        for(Integer number : tangerineNumber) {
            if(tangerines.get(number) < k) {
                k -= tangerines.get(number);
                answer += 1;
                continue;
            }

            return answer + 1;
        }

        return answer;
    }
}
