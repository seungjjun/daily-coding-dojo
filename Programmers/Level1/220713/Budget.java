import java.util.Arrays;

public class Budget {
  public int solution2(int[] d, int budget) {
    int answer = 0;
    Arrays.sort(d);

    int sumAmount = 0;
    for (int i = 0; i < d.length; i += 1) {
      sumAmount += d[i];

      if (sumAmount >= budget) {
        break;
      }
      answer += 1;
    }

    if (sumAmount == budget) {
      answer += 1;
    }

    return answer;
  }
}

  public int solution1(int[] d, int budget) {
    int answer = 0;

    Arrays.sort(d);

    for (int i = 0; d.length > i; i += 1) {
      budget -= d[i];

      if (budget < 0) {
        break;
      }
      answer += 1;
    }

    return answer;
  }
