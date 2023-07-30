import java.util.Arrays;
import java.util.stream.IntStream;

public class NegativePositiveAdd {
  public int solution(int[] absolutes, boolean[] signs) {
    int answer = 0;

    int count = 0;

    while (count != absolutes.length) {
      if (!signs[count]) {
        answer -= absolutes[count];
      }

      if (signs[count]) {
        answer += absolutes[count];
      }

      count += 1;
    }

    return answer;
  }
}
