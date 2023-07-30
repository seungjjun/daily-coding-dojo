package Java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddDigitsTest {
  @Test
  void solution() {
    AddDigits addDigits = new AddDigits();

    assertEquals(6, addDigits.solution(123));
    assertEquals(24, addDigits.solution(987));
  }
}