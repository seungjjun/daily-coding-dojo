import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class ParkingFee {
    public int[] solution(int[] fees, String[] records) {
        int[] answer = {};

        Set<Integer> set = new HashSet<>();

        int[] times = new int[10000];

        for (int i = 0; i < records.length; i++) {
            StringTokenizer st = new StringTokenizer(records[i]);

            String time[] = st.nextToken().split(":");

            int num = Integer.parseInt(st.nextToken());
            String inout = st.nextToken();

            set.add(num);

            int minute = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);

            if (inout.equals("IN")) {
                times[num] -= minute;
            } else {
                times[num] += minute;
            }
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            int idx = list.get(i);
            if (times[idx] <= 0) {
                times[idx] += 1439;
            }

            answer[i] = fees[1];
            if (times[idx] > fees[0]) {
                answer[i] += Math.ceil((double) (times[idx] - fees[0]) / fees[2]) * fees[3];
            }

        }

        return answer;
    }
}
