import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveSmallestNumberTest {
  @Test
  void Array() {
    RemoveSmallestNumber removeSmallestNumber = new RemoveSmallestNumber();

    assertArrayEquals(new int[]{4,3,2},
        removeSmallestNumber.solution(new int[]{4,3,2,1}));
    assertArrayEquals(new int[]{4,2,3},
        removeSmallestNumber.solution(new int[]{4,1,2,3}));
  }

  @Test
  void BlankArray() {
    RemoveSmallestNumber removeSmallestNumber = new RemoveSmallestNumber();

    assertArrayEquals(new int[]{-1},
        removeSmallestNumber.solution(new int[]{10}));
  }
}
