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

/*
int count = 0;

    for(int i = 0; i < arr.length; i += 1) {
      i = count;
      for(int j = i; j < arr.length; j += 1) {
        if(arr[i] == arr[j]) {
          answer[i] = arr[i];
          count += 1;
        }
        if(arr[i] != arr[j]) {
          break;
        }
      }
    }
 */