public class Carpet {
  public int[] solution(int brown, int yellow) {
    int sum = sum(brown, yellow);

    return factorization(sum, brown);
  }

  public int sum(int brown, int yellow) {
    return brown + yellow;
  }

  public int[] factorization(int sum, int brown) {
    int[] factorization = new int[2];
    for (int i = 2; i < sum; i += 1) {
      if (sum % i == 0) {
        int maximumNumber = sum / i;
        if ((i * 2 + maximumNumber * 2 - 4) == brown) {
          factorization[0] = i;
          factorization[1] = maximumNumber;
        }
      }
    }
    return factorization;
  }
}
