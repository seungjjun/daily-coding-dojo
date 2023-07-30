public class ReverseNatureNumber {
  public int[] solution(long number) {
    int numberLength = getNumberLength(number);
    int[] answer = new int[numberLength];

    for(int i = 0; i < numberLength; i += 1) {
      int remainder = (int) (number % 10);
      int quotient = (int) (number / 10);

      answer[i] = remainder;

      number = quotient;
    }

    return answer;
  }

  public int getNumberLength(long number) {
    return (int)(Math.log10(number)+1);
  }
}
