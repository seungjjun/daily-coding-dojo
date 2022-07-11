// 문자열을 큰것부터 작은 순으로 정렬
// 대문자는 소문자보다 작은 것으로 간주

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StringDescendinOrder {
  public String solution1(String string) {
    String answer = "";

    List<String> stringArrays = new ArrayList<>();

    for(int i = 0; i < string.length(); i += 1) {
      stringArrays.add(String.valueOf(string.charAt(i)));
    }

    stringArrays.sort(Comparator.reverseOrder());

    for(String stringArray : stringArrays) {
      answer += stringArray;
    }

    return answer;
  }
}

public String solution2(String string) {
  String answer = "";

  char[] stringArray = string.toCharArray();

  Arrays.sort(stringArray);

  String sortString = new String(stringArray);

  for (int i = sortString.length() - 1; i >= 0; i -= 1) {
    answer += sortString.charAt(i);
  }

  return answer;
}
