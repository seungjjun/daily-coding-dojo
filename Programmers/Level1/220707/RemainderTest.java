import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemainderTest {
  @Test
  void Remainder() {
    Remainder remainder = new Remainder();

    assertEquals(3, remainder.solution1(10));
    assertEquals(11, remainder.solution1(12));
  }
}