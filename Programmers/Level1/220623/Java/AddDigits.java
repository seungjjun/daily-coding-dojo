public int solution2(int n) {
  int answer = 0;

  String number = String.valueOf(n);
  String[] numberArray = number.split("");

  for (int i = 0; i < numberArray.length; i += 1) {
    answer += Integer.parseInt(numberArray[i]);
  }

  return answer;
}

public int solution2(int n) {
    int answer = 0;

    int quotient = n;
    while (quotient != 0) {
      answer += quotient % 10;
      quotient /= 10;
    }

    return answer;
}


