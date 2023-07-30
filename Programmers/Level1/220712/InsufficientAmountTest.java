import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsufficientAmountTest {
  @Test
  void totalMoney() {
    InsufficientAmount insufficientAmount = new InsufficientAmount();

    assertEquals(600, insufficientAmount.solution(100, 200, 3));
    assertEquals(30, insufficientAmount.solution(3, 20, 4));
  }

  @Test
  void insufficientAmount() {
    InsufficientAmount insufficientAmount = new InsufficientAmount();

    assertEquals(400, insufficientAmount.solution(100, 200, 3));
    assertEquals(10, insufficientAmount.solution(3, 20, 4));
  }

  @Test
  void exception() {
    InsufficientAmount insufficientAmount = new InsufficientAmount();

    assertEquals(0, insufficientAmount.solution(3, 40, 4));
  }
}
