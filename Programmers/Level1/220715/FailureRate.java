import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FailureRate {
  public int[] solution(int stageNumber, int[] stages) {
    int[] answer = new int[stageNumber];
    int failureUser = 0;
    double failureRate = 0;
    int reachedStageNumber = 0;

    Map<Integer, Double> stageFailureRate = new HashMap<>();

    List<Integer> list = Arrays.stream(stages).boxed().collect(Collectors.toList());

    for(int i = 1; i < stageNumber + 1; i += 1) {
      failureUser = Collections.frequency(list, i);
      if(failureUser != 0) {
        failureRate = (double) failureUser / (stages.length - reachedStageNumber);
      }

      if(failureUser == 0) {
        failureRate = 0;
      }

      reachedStageNumber += failureUser;
      stageFailureRate.put(i, failureRate);
    }

    List<Integer> keyList = new ArrayList<>(stageFailureRate.keySet());

    Collections.sort(keyList, (o1, o2) -> (stageFailureRate.get(o2).compareTo(stageFailureRate.get(o1))));

    int i = 0;
    for (Integer key : keyList) {
      answer[i] = key;
      i += 1;
    }
    return answer;
  }
}
