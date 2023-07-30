import org.junit.jupiter.api.Test;

class CommonDivisorMultipleTest {
  @Test
  void MaximumCommonDivisor() {
    CommonDivisorMultiple commonDivisorMultiple = new CommonDivisorMultiple();

    assertArrayEquals(new int[]{2}, commonDivisorMultiple.solution(2, 4));
    assertArrayEquals(new int[]{3}, commonDivisorMultiple.solution(3, 12));
  }

  @Test
  void MinimumCommonMultiple() {
    CommonDivisorMultiple commonDivisorMultiple = new CommonDivisorMultiple();

    assertArrayEquals(new int[]{12}, commonDivisorMultiple.solution(3, 12));
    assertArrayEquals(new int[]{10}, commonDivisorMultiple.solution(2, 5));
    assertArrayEquals(new int[]{210}, commonDivisorMultiple.solution(30, 42));
  }

  @Test
  void solution() {
    CommonDivisorMultiple commonDivisorMultiple = new CommonDivisorMultiple();

    assertArrayEquals(new int[]{3, 12}, commonDivisorMultiple.solution(3, 12));
  }
}
