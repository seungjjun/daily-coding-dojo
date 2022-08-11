import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsufficientAmountTest {
  @Test
  void computePrice() {
    InsufficientAmount insufficientAmount = new InsufficientAmount();

    assertEquals(30, insufficientAmount.solution(3, 20, 4));
  }

  @Test
  void amount() {
    InsufficientAmount insufficientAmount = new InsufficientAmount();

    assertEquals(10, insufficientAmount.solution(3, 20, 4));
    assertEquals(0, insufficientAmount.solution(5, 15, 2));
    assertEquals(0, insufficientAmount.solution(3, 50, 3));
  }
}
