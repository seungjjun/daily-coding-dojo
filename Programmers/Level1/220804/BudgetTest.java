import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BudgetTest {
  @Test
  void sort() {
    Budget budget = new Budget();

    assertArrayEquals(new int[]{1, 2, 3, 4, 5}, budget.solution(new int[]{1, 3, 2, 5, 4}, 9));
    assertArrayEquals(new int[]{2, 2, 3, 3}, budget.solution(new int[]{2, 2, 3, 3}, 10));
  }

  @Test
  void solution() {
    Budget budget = new Budget();

    assertEquals(3, budget.solution(new int[]{1, 3, 2, 5, 4}, 9));
    assertEquals(4, budget.solution(new int[]{2, 2, 3, 3}, 10));
  }
}
