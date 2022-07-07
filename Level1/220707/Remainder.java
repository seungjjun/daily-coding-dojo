import java.util.ArrayList;
import java.util.Collections;

public class Remainder {
  public int solution1(int number) {
    ArrayList<Integer> remainders = new ArrayList<>();

    for(int i = 1; i < number; i += 1) {
      if(number % i == 1) {
        remainders.add(i);
      }
    }
    Collections.sort(remainders);

    return remainders.get(0);
  }
}

  public int solution2(int number) {
    int answer = 0;

    for (int i = 1; i < number; i += 1) {
      if (number % i == 1) {
        return i;
      }
    }
    return answer;
  }