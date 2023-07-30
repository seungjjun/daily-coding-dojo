import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NqueenTest {
  @Test
  void board() {
    Nqueen nqueen = new Nqueen();

    assertArrayEquals(new int[]{-1, -1, -1, -1}, nqueen.makeBoard(4));
  }

  @Test
  void putQueen() {
    Nqueen nqueen = new Nqueen();

    assertEquals(2, nqueen.putQueen(new int[]{-1, -1, -1, -1}, 4, 1));
  }

  @Test
  void simple() {
    Nqueen nqueen = new Nqueen();

    assertEquals(2, nqueen.solution(4));
    assertEquals(4, nqueen.solution(6));
  }
}
