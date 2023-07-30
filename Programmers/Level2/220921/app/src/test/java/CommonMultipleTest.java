import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CommonMultipleTest {
  @Test
  void arrLengthTwo() {
    CommonMultiple commonMultiple = new CommonMultiple();

    assertEquals(2, commonMultiple.solution(new int[]{1, 2}));
    assertEquals(15, commonMultiple.solution(new int[]{3, 5}));
  }

  @Test
  void minimumCommonMultiple() {
    CommonMultiple commonMultiple = new CommonMultiple();

    assertEquals(10,commonMultiple.computeMinimum(5, 10));
    assertEquals(63,commonMultiple.computeMinimum(7, 9));
  }

  @Test
  void arrLengthThree() {
    CommonMultiple commonMultiple = new CommonMultiple();

    assertEquals(6, commonMultiple.solution(new int[]{1, 2, 3}));
    assertEquals(30, commonMultiple.solution(new int[]{3, 5, 10}));
  }

  @Test
  void solution() {
    CommonMultiple commonMultiple = new CommonMultiple();

    assertEquals(168, commonMultiple.solution(new int[]{2, 6, 8, 14}));
  }
}