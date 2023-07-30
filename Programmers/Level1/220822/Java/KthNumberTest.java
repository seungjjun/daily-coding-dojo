import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class KthNumberTest {
  @Test
  void slice() {
    KthNumber kthNumber = new KthNumber();

    assertArrayEquals(new int[]{5, 2, 6, 3},
        kthNumber.slice(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[]{2, 5, 3}));
  }

  @Test
  void sort() {
    KthNumber kthNumber = new KthNumber();

    assertArrayEquals(new int[]{5},
        kthNumber.solution(
            new int[]{1, 5, 2, 6, 3, 7, 4},
            new int[][]{{2, 5, 3}})
    );
  }

  @Test
  void answer() {
    KthNumber kthNumber = new KthNumber();

    assertArrayEquals(new int[]{5, 6, 3},
        kthNumber.solution(
            new int[]{1, 5, 2, 6, 3, 7, 4},
            new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})
    );
  }
}
