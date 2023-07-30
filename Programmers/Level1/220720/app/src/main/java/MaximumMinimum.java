public class MaximumMinimum {
  public int[] solution(int n, int m) {
    int[] answer = new int[2];

    int maximumDivisor = 0;
    for(int i = 2; i <= n; i += 1) {
      if (n % i == 0 && m % i == 0) {
        maximumDivisor = i;
      }
      if(!(n % i == 0 && m % i == 0)) {
        maximumDivisor = 1;
      }
      answer[0] = maximumDivisor;
    }

    answer[1] = n * m / maximumDivisor;

    return answer;
  }
}

/*
int minimumMultiple = 0;

    if(n < m) {
      for(int i = 1; i <= n; i += 1) {
        if((m * i) % n == 0) {
          minimumMultiple = m * i;
          answer[1] = minimumMultiple;
          break;
        }
      }
    }

    if(n > m) {
      for(int i = 1; i <= m; i += 1) {
        if((n * i) % m == 0) {
          minimumMultiple = n * i;
          answer[1] = minimumMultiple;
          break;
        }
      }
    }
 */