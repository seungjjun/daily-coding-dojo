public class ExpressionNumber {
  public int solution(int n) {
    return increase(n);
  }


  public int increase(int number) {
    int answerNumber = 0;
    int count = 0;

    for(int i = 0; i < number; i += 1) {
      answerNumber = 0;
      int increaseNumber = 1;

      increaseNumber += i;

      while (answerNumber != number) {
        if(answerNumber > number) {
          break;
        }
        answerNumber += increaseNumber;

        increaseNumber += 1;
      }

      if(answerNumber == number) {
        count += 1;
      }
    }

    return count;
  }
}
