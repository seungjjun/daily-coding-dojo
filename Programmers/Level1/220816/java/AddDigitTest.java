import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddDigitTest {
  @Test
  void add() {
    AddDigit addDigit = new AddDigit();

    assertEquals(6, addDigit.solution(123));
    assertEquals(24, addDigit.solution(987));
  }
}
