import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RightBracketTest {
  @Test
  void isMatch() {
    RightBracket rightBracket = new RightBracket();

    assertFalse(rightBracket.isMatch("((("));
    assertTrue(rightBracket.isMatch("(())"));
  }

  @Test
  void True() {
    RightBracket rightBracket = new RightBracket();

    assertTrue(rightBracket.solution("()()"));
    assertTrue(rightBracket.solution("(())()"));

    assertTrue(rightBracket.solution("(()())"));
  }

  @Test
  void False() {
    RightBracket rightBracket = new RightBracket();

    assertFalse(rightBracket.solution(")"));
    assertFalse(rightBracket.solution("("));

    assertFalse(rightBracket.solution("())"));
    assertFalse(rightBracket.solution(")()("));
    assertFalse(rightBracket.solution("()))"));
    assertFalse(rightBracket.solution("()("));
    assertFalse(rightBracket.solution("()(("));
    assertFalse(rightBracket.solution("))))()"));

    assertFalse(rightBracket.solution("())()(()"));
  }
}
