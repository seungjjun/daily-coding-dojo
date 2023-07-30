import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressionNumberTest {
  @Test
  void count() {
    ExpressionNumber expressionNumber = new ExpressionNumber();

    assertEquals(2, expressionNumber.increase(5));
  }

  @Test
  void overIncrease() {
    ExpressionNumber expressionNumber = new ExpressionNumber();

    assertEquals(2, expressionNumber.increase(7));
  }

  @Test
  void solution() {
    ExpressionNumber expressionNumber = new ExpressionNumber();

    assertEquals(4, expressionNumber.solution(15));
  }
}
