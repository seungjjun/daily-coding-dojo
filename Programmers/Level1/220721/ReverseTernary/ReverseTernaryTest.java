import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTernaryTest {
  @Test
  void ReverseTernary() {
    ReverseTernary reverseTernary = new ReverseTernary();

    assertEquals("0021", reverseTernary.solution(45));
    assertEquals("22111", reverseTernary.solution(125));
  }

  @Test
  void Decimal(){
    ReverseTernary reverseTernary = new ReverseTernary();

    assertEquals(7,reverseTernary.solution(45));
    assertEquals(229,reverseTernary.solution(125));
  }
}
