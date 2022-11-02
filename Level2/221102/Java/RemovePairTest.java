import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemovePairTest {
  @Test
  void solution() {
    RemovePair removePair = new RemovePair();

    assertEquals(1, removePair.solution("baabaa"));
    assertEquals(0, removePair.solution("cdcd"));
  }
}
