import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShiritoriTest {
  @Test
  void solution() {
    Shiritori shiritori = new Shiritori();

    assertArrayEquals(new int[]{3,3}, shiritori.solution(3,
        new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother",
        "robot", "tank"}));

    assertArrayEquals(new int[]{1, 3}, shiritori.solution(2,
        new String[]{"hello", "one", "even", "never", "now", "world", "draw"}));

    assertArrayEquals(new int[]{0, 0}, shiritori.solution(5,
        new String[]{"hello", "observe", "effect", "take", "either", "recognize",
            "encourage", "ensure", "establish", "hang", "gather", "refer",
            "reference", "estimate", "executive"}));
  }
}
