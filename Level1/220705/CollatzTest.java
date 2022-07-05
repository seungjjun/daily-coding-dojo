import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollatzTest {
  private Collatz collatz;

  @Test
  void inputNumber1() {
    collatz = new Collatz();

    assertEquals(0, collatz.solution(1));
  }

  @Test
  void inputNumber() {
    collatz = new Collatz();

    assertEquals(4, collatz.solution(16));
    assertEquals(8, collatz.solution(6));
    assertEquals(-1, collatz.solution(626331));
  }
}