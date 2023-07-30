package Interval;

public class IntervalNumber {
  public long[] solution(int x, int n) {
    long[] answer =  new long[n];

    long addNumber = x;
    for (int i = 0; i < n; i++) {
      answer[i] = addNumber;
      addNumber += x;
    }

    return answer;
  }
}
