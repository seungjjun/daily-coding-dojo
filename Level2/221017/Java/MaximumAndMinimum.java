import java.util.Arrays;

public class MaximumAndMinimum {
  public String solution(String s) {
    String answer = "";

    String[] splited = split(s);

    int[] numbers = convert(splited);

    String[] maximumAndMinimum = compute(numbers);

    answer = arrayToString(maximumAndMinimum);

    return answer;
  }

  public String[] split(String number) {
    return number.split(" ");
  }

  public int[] convert(String[] splited) {
    int[] numbers = new int[splited.length];

    for(int i = 0; i < splited.length; i += 1) {
      numbers[i] = Integer.parseInt(splited[i]);
    }

    return numbers;
  }

  public String[] compute(int[] numbers) {
    String[] maximumAndMinimum = new String[2];

    Arrays.sort(numbers);

    maximumAndMinimum[0] = String.valueOf(numbers[0]);
    maximumAndMinimum[1] = String.valueOf(numbers[numbers.length - 1]);

    return maximumAndMinimum;
  }

  public String arrayToString(String[] maximumAndMinimumValue) {
    String answer = "";

    answer = String.join(" ", maximumAndMinimumValue);

    return answer;
  }
}
