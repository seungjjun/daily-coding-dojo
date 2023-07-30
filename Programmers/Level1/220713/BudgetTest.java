import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BudgetTest {
  @Test
  void budget() {
    Budget budget = new Budget();

    assertEquals(-2, budget.solution(new int[]{1, 3, 2, 5, 6}, 9));
    assertEquals(0, budget.solution(new int[]{2, 2, 3, 3}, 10));
  }

  @Test
  void result() {
    Budget budget = new Budget();

    assertEquals(3, budget.solution(new int[]{1, 3, 2, 5, 6}, 9));
    assertEquals(4, budget.solution(new int[]{2, 2, 3, 3}, 10));
    assertEquals(1, budget.solution(new int[]{2}, 10));
  }
}
