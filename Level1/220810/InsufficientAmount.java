public class InsufficientAmount {
  public long solution(int price, long money, int count) {
    long answer = 0;

    long totalAmount = 0;
    for(int i = 1; i <= count; i += 1) {
      totalAmount += (long) price * i;
    }

    if(totalAmount <= money) {
      return 0;
    }

    answer = totalAmount - money;

    return answer;
  }
}
