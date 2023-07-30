import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConvertToNumberTest {
  @Test
  void replace() {
    ConvertToNumber convertToNumber = new ConvertToNumber();

    assertEquals(11, convertToNumber.solution("oneone"));
    assertEquals(21, convertToNumber.solution("twoone"));
    assertEquals(68, convertToNumber.solution("sixeight"));
  }

  @Test
  void solution() {
    ConvertToNumber convertToNumber = new ConvertToNumber();

    assertEquals(1478, convertToNumber.solution("one4seveneight"));
    assertEquals(123, convertToNumber.solution("123"));
  }
}
