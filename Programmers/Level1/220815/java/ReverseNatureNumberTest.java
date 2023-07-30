import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseNatureNumberTest {
  @Test
  void numberLength() {
    ReverseNatureNumber reverseNatureNumber = new ReverseNatureNumber();

    assertEquals(5, reverseNatureNumber.getNumberLength(12345));
  }
  @Test
  void array() {
    ReverseNatureNumber reverseNatureNumber = new ReverseNatureNumber();

    assertArrayEquals(new int[]{5,4,3,2,1}, reverseNatureNumber.solution(12345));
  }
}
