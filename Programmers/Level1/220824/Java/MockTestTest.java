import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MockTestTest {
  @Test
  void firstCount() {
    MockTest mockTest = new MockTest();

    assertEquals(5, mockTest.gradingFirstAnswers(
        new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5}));
  }

  @Test
  void secondCount() {
    MockTest mockTest = new MockTest();

    assertEquals(2, mockTest.gradingSecondAnswers(
        new int[]{1, 3, 2, 4, 2}, new int[]{2, 1, 2, 3, 2, 4, 2, 5}));
  }

  @Test
  void thirdCount() {
    MockTest mockTest = new MockTest();

    assertEquals(2, mockTest.gradingThirdAnswers(
        new int[]{1, 3, 2, 4, 2}, new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}));
  }

  @Test
  void answer() {
    MockTest mockTest = new MockTest();

    assertArrayEquals(new int[]{1},
        mockTest.solution(new int[]{1, 2, 3, 4, 5}));

    assertArrayEquals(new int[]{1, 2, 3},
        mockTest.solution(new int[]{1, 3, 2, 4, 2}));
  }
}
