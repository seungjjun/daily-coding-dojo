import java.util.Arrays;

public class Divisor {
  public int solution1(int number) {
    int[] numberArray = new int[number];

    for(int i = 1; i <= number; i += 1){
      numberArray[i-1] = i;
    }

    int answer = Arrays.stream(numberArray)
        .filter(i -> number % i == 0)
        .sum();

    return answer;
  }
}

/*
  public int solution2(int number) {
    int answer = 0;

    for(int i = 1; i <= number; i += 1) {
      if(number % i == 0) {
        answer += i;
      }
    }
    return answer;
  }
*/