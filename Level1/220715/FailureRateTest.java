import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FailureRateTest {
  @Test
  void failureUserNumber() {
    FailureRate failureRate = new FailureRate();

    assertEquals(1, failureRate.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3}));
    assertEquals(2, failureRate.solution(5, new int[]{2, 1, 3, 4, 0, 1, 3, 2}));
  }

  @Test
  void failureRate() {
    FailureRate failureRate = new FailureRate();

    assertArrayEquals(new int[]{3, 4, 2, 1, 5}, failureRate.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3}));
    assertArrayEquals(new int[]{4,1,2,3}, failureRate.solution(4, new int[]{4,4,4,4,4}));
    assertArrayEquals(new int[]{3,1,2,4,5}, failureRate.solution(5, new int[]{3, 3, 3, 3}));
  }
}
