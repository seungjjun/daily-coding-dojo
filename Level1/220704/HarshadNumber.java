public class HarshadNumber {
  private int sumNumber;

  public boolean solution2(int number) {
    boolean answer = true;

    if (number % sumCompute(number) != 0) {
      answer = false;
    }
    return answer;
  }

  public int sumCompute(int number) {
    String stringNumber = Integer.toString(number);

    String[] splitNumberArray = stringNumber.split("");
    for (String splitNumber : splitNumberArray) {
      sumNumber += Integer.parseInt(splitNumber);
    }
    return sumNumber;
  }
}

/*
private int sumNumber;

  public boolean solution1(int number) {
    boolean answer = true;
    int sumNumber = sumCompute(number);

    if(number % sumNumber != 0) {
      answer = false;
    }
    return answer;
  }

  public int sumCompute(int number) {
    int quotient = number;

    while (quotient != 0) {
      sumNumber += quotient % 10;
      quotient /= 10;
    }
    return sumNumber;
  }
 */