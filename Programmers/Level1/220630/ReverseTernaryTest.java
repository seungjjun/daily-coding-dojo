import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTernaryTest {
  private ReverseTernary reverseTernary;

  @Test
  void ternary() {
    reverseTernary = new ReverseTernary();
    assertEquals("0021", reverseTernary.computeTernary(45));

    reverseTernary = new ReverseTernary();
    assertEquals("22111", reverseTernary.computeTernary(125));
  }

  @Test
  void decimalNumber() {
    reverseTernary = new ReverseTernary();
    assertEquals(7, reverseTernary.solution(45));

    reverseTernary = new ReverseTernary();
    assertEquals(229, reverseTernary.solution(125));
  }
}
