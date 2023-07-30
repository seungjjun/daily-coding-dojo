import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareRootTest {
  @Test
  void squareRoot() {
    SquareRoot squareRoot = new SquareRoot();

    assertEquals(11, squareRoot.solution(121));
    assertEquals(3, squareRoot.solution(9));
  }

  @Test
  void answer() {
    SquareRoot squareRoot = new SquareRoot();

    assertEquals(144, squareRoot.solution(121));
    assertEquals(-1, squareRoot.solution(3));
    assertEquals(169, squareRoot.solution(144));
  }

}