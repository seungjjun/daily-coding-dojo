import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarCipherTest {
  @Test
  void lower() {
    CaesarCipher caesarCipher = new CaesarCipher();

    assertEquals("def", caesarCipher.solution("abc", 3));
    assertEquals("a", caesarCipher.solution("z", 1));
  }

  @Test
  void upper() {
    CaesarCipher caesarCipher = new CaesarCipher();

    assertEquals("BC", caesarCipher.solution("AB", 1));
  }

  @Test
  void upperWithBlank() {
    CaesarCipher caesarCipher = new CaesarCipher();

    assertEquals("H L", caesarCipher.solution("F J", 2));
  }
}
