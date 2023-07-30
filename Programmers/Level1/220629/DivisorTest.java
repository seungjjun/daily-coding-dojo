import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisorTest {
  @Test
  void solution() {
    Divisor divisor = new Divisor();

    assertEquals(1, divisor.solution1(1));
    assertEquals(28, divisor.solution1(12));
    assertEquals(6, divisor.solution1(5));
  }
}
