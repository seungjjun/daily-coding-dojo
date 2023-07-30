package average;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageTest {
  @Test
  void average() {
    Average average = new Average();

    assertEquals(2.5, average.average(new int[]{1, 2, 3, 4}));
    assertEquals(5, average.average(new int[]{5, 5}));

  }
}