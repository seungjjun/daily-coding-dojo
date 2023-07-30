import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindRemainderTest {
  @Test
  void find() {
    FindRemainder findRemainder = new FindRemainder();

    assertEquals(3, findRemainder.solution(10));
  }
}
