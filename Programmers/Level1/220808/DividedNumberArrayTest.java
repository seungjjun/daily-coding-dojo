import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DividedNumberArrayTest {
  @Test
  void solution() {
    DividedNumberArray dividedNumberArray = new DividedNumberArray();
    
    assertArrayEquals(new int[]{5, 10},
        dividedNumberArray.solution(new int[]{5, 9, 10, 7}, 5));

    assertArrayEquals(new int[]{1, 2, 3, 36},
        dividedNumberArray.solution(new int[]{2, 36, 1, 3}, 1));

    assertArrayEquals(new int[]{-1},
        dividedNumberArray.solution(new int[]{3, 2, 6}, 10));
  }
}
