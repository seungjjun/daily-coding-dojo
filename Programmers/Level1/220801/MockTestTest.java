import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MockTestTest {
  @Test
  void answerCountOne() {
    MockTest mockTest = new MockTest();

    assertEquals(7, mockTest.solution(new int[]{1, 2, 3, 4, 5, 1, 2}));
  }

  @Test
  void answerCountTwo() {
    MockTest mockTest = new MockTest();

    assertEquals(1, mockTest.solution(new int[]{1, 2, 3, 4, 5, 1, 2}));
  }

  @Test
  void answerCountThree() {
    MockTest mockTest = new MockTest();

    assertEquals(2, mockTest.solution(new int[]{1, 2, 1, 4, 4, 2}));
  }

  @Test
  void solution() {
    MockTest mockTest = new MockTest();

    assertArrayEquals(new int[]{1}, mockTest.solution(new int[]{1, 2, 3, 4, 5}));
    assertArrayEquals(new int[]{1, 2, 3}, mockTest.solution(new int[]{1, 3, 2, 4, 2}));
  }

  private void assertArrayEquals(int[] ints, ArrayList<Integer> solution) {
  }
}
