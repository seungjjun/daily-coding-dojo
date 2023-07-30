// 6540

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BestSinger {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        List<Integer> scoreList = new ArrayList<>();

        for (int i = 0; i < score.length; i += 1) {
            if (i < k) {
                scoreList.add(score[i]);

                Collections.sort(scoreList);

                answer[i] = scoreList.get(0);

                continue;
            }

            if (scoreList.get(0) < score[i]) {
                scoreList.remove(0);

                scoreList.add(score[i]);

                Collections.sort(scoreList);

                answer[i] = scoreList.get(0);

                continue;
            }

            answer[i] = scoreList.get(0);
        }

        return answer;
    }
}
