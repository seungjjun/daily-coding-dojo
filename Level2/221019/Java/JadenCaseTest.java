import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JadenCaseTest {
  @Test
  void split() {
    JadenCase jadenCase = new JadenCase();

    assertArrayEquals(new String[]{"for", "the", "last", "week"},
        jadenCase.split("for the last week"));
  }

  @Test
  void convertToUppearCase() {
    JadenCase jadenCase = new JadenCase();

    String[] sentences = new String[]{"for", "the", "last", "week"};

    assertEquals("For The Last Week", jadenCase.convert(sentences, "for the last week"));
  }

  @Test
  void convertToLowerCase() {
    JadenCase jadenCase = new JadenCase();

    String[] sentences = new String[]{"fOr", "tHE", "lAST", "week"};

    assertEquals("For The Last Week", jadenCase.convert(sentences, "fOr tHE lAST week"));
  }
  @Test
  void solution() {
    JadenCase jadenCase = new JadenCase();

    assertEquals("A Aa " ,jadenCase.solution("a aa "));
  }
}
