import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddMissingNumber {
  public int solution1(int[] numbers) {
    int answer = 0;
    List<Integer> totalNumber = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

    totalNumber = findMissingNumber(numbers, totalNumber);

    for (int i = 0; i < totalNumber.size(); i += 1) {
      answer += totalNumber.get(i);
    }

    return answer;
  }

  public List<Integer> findMissingNumber(int[] numbers, List<Integer> totalNumber) {
    for (int i = 0; i < numbers.length; i += 1) {
      for (int j = 0; j < totalNumber.size(); j += 1) {
        if (numbers[i] == totalNumber.get(j)) {
          totalNumber.remove(j);
        }
      }
    }
    return totalNumber;
  }

  public int solution2(int[] numbers) {
    int totalSum = 45;
    int arraySum = 0;

    for(int sum : numbers) {
      arraySum += sum;
    }

    return totalSum - arraySum;
  }

  public int solution3(int[] numbers) {
    return 45 - Arrays.stream(numbers).sum();
  }
}
