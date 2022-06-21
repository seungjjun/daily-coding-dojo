import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DotProductTest {
  @Test
  void solution() {
    DotProduct dotProduct = new DotProduct();

    assertEquals(3, dotProduct.solution(new int[]{1, 2, 3, 4}, new int[]{-3, -1, 0, 2}));
    assertEquals(-2, dotProduct.solution(new int[]{-1, 0, 1}, new int[]{1, 0, -1}));
  }
}
