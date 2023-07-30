package Interval;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntervalNumberTest {
  @Test
  void Solution() {
    IntervalNumber intervalNumber = new IntervalNumber();

    assertArrayEquals(new long[]{2, 4}, intervalNumber.solution(2, 2));
    assertArrayEquals(new long[]{4, 8, 12}, intervalNumber.solution(4, 3));
    assertArrayEquals(new long[]{-4, -8}, intervalNumber.solution(-4, 2));

  }
}
