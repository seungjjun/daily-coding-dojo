  import java.util.*;

public class HateSameNumber {
  public int[] solution(int []arr) {
    int[] answer = {};

    List<Integer> list = new ArrayList<>();

    int comparisonNumber = -1;
    for(int i = 0; i < arr.length - 1; i += 1) {
      if(arr[i] != comparisonNumber){
        list.add(arr[i]);
        comparisonNumber = arr[i];
      }
    }

    answer = new int[list.size()];

    for(int i = 0; i < list.size(); i += 1) {
      answer[i] = list.get(i);
    }

    return answer;
  }
}
