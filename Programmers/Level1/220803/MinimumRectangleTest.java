import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumRectangleTest {
  @Test
  void changeLength() {
    MinimumRectangle minimumRectangle = new MinimumRectangle();

    assertArrayEquals(new int[][]{{70, 30}},
        minimumRectangle.changeLength(new int[][]{{30, 70}}));
    assertArrayEquals(new int[][]{{70, 30}, {15, 3}},
        minimumRectangle.changeLength(new int[][]{{30, 70}, {3, 15}}));
  }

  @Test
  void findMaxRowLength() {
    MinimumRectangle minimumRectangle = new MinimumRectangle();

    assertEquals(80, minimumRectangle.findMaxRowLength(
        new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
  }

  @Test
  void findMaxColumnLength() {
    MinimumRectangle minimumRectangle = new MinimumRectangle();

    assertEquals(50, minimumRectangle.findMaxColumnLength(
        new int[][]{{60, 50}, {70, 30}, {60, 30}, {80, 40}}));
  }

  @Test
  void solution() {
    MinimumRectangle minimumRectangle = new MinimumRectangle();

    assertEquals(4000, minimumRectangle.solution(
        new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
  }
}
