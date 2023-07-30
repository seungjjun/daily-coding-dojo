public class NextNumber {
  public int solution(int n) {
    return nextBinary(n);
  }

  public int nextBinary(int number) {
    boolean repeatAdd = true;
    String initialBinary = Integer.toBinaryString(number);

    while (repeatAdd) {
      number += 1;
      String binary = Integer.toBinaryString(number);
      if(compute(binary, '1') == compute(initialBinary, '1')) {
        repeatAdd = false;
      }
    }
    return number;
  }

  public int compute(String binary, char number) {
    int count = 0;

    for(int i = 0; i < binary.length(); i += 1) {
      if(binary.charAt(i) == number) {
        count += 1;
      }
    }

    return count;
  }
}
