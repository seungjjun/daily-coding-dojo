// 참가자 중에는 동명이인이 있을 수 있습니다.

import java.util.Arrays;

public class UnsuccessfulRunner {
  public String solution(String[] participant, String[] completion) {
    String answer = "";

    Arrays.sort(participant);
    Arrays.sort(completion);

    for (int i = 0; i < completion.length; i += 1) {
      if (!participant[i].equals(completion[i])) {
        answer += participant[i];
        return answer;
      }
    }

    answer += participant[participant.length - 1];
    return answer;
  }
}
