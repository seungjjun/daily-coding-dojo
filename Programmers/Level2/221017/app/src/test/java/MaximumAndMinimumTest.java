import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumAndMinimumTest {
  @Test
  void split() {
    MaximumAndMinimum maximumAndMinimum = new MaximumAndMinimum();

    String[] splited = maximumAndMinimum.split("1 2 3 4");

    assertArrayEquals(splited, new String[]{"1", "2", "3", "4"});
  }

  @Test
  void convertToNumber() {
    MaximumAndMinimum maximumAndMinimum = new MaximumAndMinimum();

    String[] splited = new String[]{"3", "2", "1", "5"};

    int[] numbers = maximumAndMinimum.convertToInt(splited);

    assertArrayEquals(numbers, new int[]{3, 2, 1, 5});
  }

  @Test
  void computeMaximumAndMinimumValue() {
    MaximumAndMinimum maximumAndMinimum = new MaximumAndMinimum();

    int[] numbers = new int[]{3, 2, 1, 5};

    String[] maximumAndMinimumValue =  maximumAndMinimum.compute(numbers);

    assertArrayEquals(maximumAndMinimumValue, new String[]{"1", "5"});
  }

  @Test
  void convertToString() {
    MaximumAndMinimum maximumAndMinimum = new MaximumAndMinimum();

    String[] maximumAndMinimumValue = new String[]{"1", "5"};

    String answer = maximumAndMinimum.arrayToString(maximumAndMinimumValue);

    assertEquals(answer, "1 5");
  }
}
