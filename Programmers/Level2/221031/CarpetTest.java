import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CarpetTest {
  @Test
  void sum() {
    Carpet carpet = new Carpet();

    assertEquals(48, carpet.sum(24, 24));
  }

  @Test
  void factorization() {
    Carpet carpet = new Carpet();

    assertArrayEquals(new int[]{8, 6}, carpet.factorization(48, 24));
  }

  @Test
  void solution() {
    Carpet carpet = new Carpet();

    assertArrayEquals(new int[]{4, 3}, carpet.solution(10, 2));
    assertArrayEquals(new int[]{3, 3}, carpet.solution(8, 1));
  }
}