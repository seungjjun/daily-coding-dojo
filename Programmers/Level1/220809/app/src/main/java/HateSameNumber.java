import java.util.ArrayList;
import java.util.List;

public class HateSameNumber {
  public int[] solution(int []arr) {
    List<Integer> array = new ArrayList<>();

    array.add(arr[0]);
    for(int i = 1; i < arr.length; i += 1) {
      if(arr[i] == arr[i - 1]) {
        continue;
      }
      array.add(arr[i]);
    }

    int[] answer = new int[array.size()];

    int count = 0;
    for(int answerNumber : array) {
      answer[count] = answerNumber;
      count += 1;
    }

    return answer;
  }
}
