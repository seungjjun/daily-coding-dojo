import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArcheryTest {
  @Test
  void solution() {
    Archery archery = new Archery();

    assertArrayEquals(new int[]{0, 2, 2, 0, 1, 0, 0, 0, 0, 0, 0},
        archery.solution(5, new int[]{2, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0}));

    assertArrayEquals(new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        archery.solution(1, new int[]{-1}));
  }
}
