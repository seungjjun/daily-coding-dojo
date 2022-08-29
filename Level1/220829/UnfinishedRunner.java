import java.util.Arrays;

public class UnfinishedRunner {
  public String solution(String[] participant, String[] completion) {
    String answer = "";

    // 효율성 0점

//    List<String> participants = new LinkedList<>(Arrays.asList(participant));

//    for (String value : completion) {
//      for (String s : participant) {
//        if (Objects.equals(value, s)) {
//          participants.remove(s);
//          break;
//        }
//      }
//    }

//    answer = participants.get(0);

    Arrays.sort(participant);
    Arrays.sort(completion);

    answer = participant[participant.length - 1];

    for (int i = 0; i < completion.length; i += 1) {
      if (!participant[i].equals(completion[i])) {
        answer = participant[i];
        break;
      }
    }

    return answer;
  }
}
