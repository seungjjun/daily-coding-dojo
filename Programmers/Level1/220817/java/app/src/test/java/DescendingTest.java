import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DescendingTest {
  @Test
  void descending() {
    Descending descending = new Descending();

    assertArrayEquals(new long[]{8, 7, 3, 2, 1, 1},
        descending.descendingArray(118372, new long[6]));
  }

  @Test
  void solution() {
    Descending descending = new Descending();

    assertEquals(873211, descending.solution(118372));
  }
}
