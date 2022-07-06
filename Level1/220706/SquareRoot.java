public class SquareRoot {
  public long solution2(long number) {
    long squareRoot = (long) Math.sqrt(number);

    if(Math.pow(squareRoot, 2) == number) {
      return (long) Math.pow(squareRoot+1, 2);
    }
    if(Math.pow(squareRoot, 2) != number) {
      return -1;
    }

    return squareRoot;
  }
}

/*
public double solution1(long number) {
    long answer = 0;
    double squareRoot = 0;
    int increasingNumber = 1;

    while (true) {
      squareRoot = Math.pow(increasingNumber, 2);
      if (number == squareRoot) {
        break;
      }

      if (squareRoot > number) {
        return -1;
      }
      increasingNumber += 1;
    }

    answer = (long) Math.pow(increasingNumber + 1, 2);

    return answer;
  }
 */