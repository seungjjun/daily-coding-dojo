import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarCipherTest {
  @Test
  void ascii() {
    CaesarCipher caesarCipher = new CaesarCipher();

    assertEquals(65, caesarCipher.solution("A",1));
    assertEquals(66, caesarCipher.solution("B",1));
    assertEquals(97, caesarCipher.solution("a",1));
  }

  @Test
  void plusAscii() {
    CaesarCipher caesarCipher = new CaesarCipher();

    assertEquals(66, caesarCipher.solution("A",1));
    assertEquals(98, caesarCipher.solution("a",1));
  }

  @Test
  void asciiToString() {
    CaesarCipher caesarCipher = new CaesarCipher();

    assertEquals("B", caesarCipher.solution("A",1));
    assertEquals("BC", caesarCipher.solution("AB",1));
  }

  @Test
  void CaesarCipher() {
    CaesarCipher caesarCipher = new CaesarCipher();

    assertEquals("BC", caesarCipher.solution("AB", 1));
    assertEquals("a", caesarCipher.solution("z", 1));
    assertEquals("J", caesarCipher.solution("Z", 10));
    assertEquals("e F d", caesarCipher.solution("a B z", 4));
    assertEquals("ZzYy", caesarCipher.solution("AaZz", 25));
    assertEquals("b    c", caesarCipher.solution("a    b", 1));
    assertEquals("E", caesarCipher.solution("P", 15));
    assertEquals("B b t", caesarCipher.solution(". h z", 20));
  }
}
