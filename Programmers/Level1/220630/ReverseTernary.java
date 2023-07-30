// 3진법 > 10진법
// 3진법의 제일 오른쪽에있는 숫자부터 3의 제곱을 높여가며 각 자리수를 곱하며 더한 값
// 0021 -> (3^0 * 1) + (3^1 * 2) + (3^2 * 0) + (3^3 * 0) = 7

public class ReverseTernary {
  private String ternary= "";
  private double decimalNumber;

  public double solution(int number) {
    int quotient = number;
    ternary = computeTernary(quotient);

    int count = 1;
    for(int i = 0; i < ternary.length(); i += 1) {
      int eachTernaryNumber = Integer.parseInt
          (String.valueOf(ternary.charAt(ternary.length() - count)));
      decimalNumber += Math.pow(3, i) * eachTernaryNumber;
      count += 1;
    }

    return decimalNumber;
  }

  public String computeTernary(int quotient) {
    while(quotient != 0) {
      ternary = ternary + quotient % 3;
      quotient /= 3;
    }

    return ternary;
  }
}
