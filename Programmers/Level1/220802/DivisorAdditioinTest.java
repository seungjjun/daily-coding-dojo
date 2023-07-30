import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisorAdditioinTest {
  @Test
  void simple() {
    DivisorAdditioin divisorAdditioin = new DivisorAdditioin();

    assertEquals(4, divisorAdditioin.solution(1,3));
  }

  @Test
  void solution() {
    DivisorAdditioin divisorAdditioin = new DivisorAdditioin();

    assertEquals(43, divisorAdditioin.solution(13,17));
    assertEquals(52, divisorAdditioin.solution(24,27));
  }
}
