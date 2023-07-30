import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DartGameTest {
  @Test
  void onlyNumber() {
    DartGame dartGame = new DartGame();

    assertEquals("123", dartGame.solution("1T*2#3"));
  }

  @Test
  void withoutNumber() {
    DartGame dartGame = new DartGame();

    assertEquals("T*#", dartGame.solution("1T*2#3"));
  }

  @Test
  void withoutOption() {
    DartGame dartGame = new DartGame();

    assertEquals(37, dartGame.solution("6S2D3T"));
    assertEquals(3, dartGame.solution("1D2S0T"));
  }
}