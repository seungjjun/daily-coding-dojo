import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrangeCharactersTest {
  @Test
  void UpperCase() {
    StrangeCharacters strangeCharacters = new StrangeCharacters();

    assertEquals("TrY HeLlO WoRlD", strangeCharacters.solution("try hello world"));
    assertEquals("   A   A", strangeCharacters.solution("   A   a"));
  }

  @Test
  void LowerCase() {
    StrangeCharacters strangeCharacters = new StrangeCharacters();

    assertEquals("TrY HeLlO WoRlD", strangeCharacters.solution("tRy hElLo WOrLd"));
  }
}
