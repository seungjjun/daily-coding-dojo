public class ReverseTernary {
  public int solution(int number) {
    int answer = 0;

    String ternary = "";

    int quotient = number;
    while (quotient / 3 > 0) {
      ternary = ternary + (quotient % 3);
      quotient /= 3;
    }

    ternary = ternary + quotient;

    for (int i = 0; i < ternary.length(); i += 1) {
      answer += (int) Math.pow(3, ternary.length() - i - 1) * (ternary.charAt(i)- 48);
    }

    return answer;
  }
}
