import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KeypadTest {
  @Test
  void pullWithLeftPad() {
    Keypad keypad = new Keypad();

    assertEquals("LLL", keypad.solution(new int[]{1, 4, 7}, "left"));
  }

  @Test
  void pullWithRightPad() {
    Keypad keypad = new Keypad();

    assertEquals("RRR", keypad.solution(new int[]{3, 6, 9}, "right"));
  }

  @Test
  void pullLeftAndRightPad() {
    Keypad keypad = new Keypad();

    assertEquals("LRLLRR",
        keypad.solution(new int[]{1, 3, 4, 7, 6, 9}, "right"));
  }

  @Test
  void pullCenterPad() {
    Keypad keypad = new Keypad();

    assertEquals("LLRRR", keypad.solution(new int[]{1, 2, 9, 8, 0}, "right"));
  }

  @Test
  void pullLeftHandZero() {
    Keypad keypad = new Keypad();

    assertEquals("L", keypad.solution(new int[]{0}, "left"));
  }

  @Test
  void pullRightHandZero() {
    Keypad keypad = new Keypad();

    assertEquals("R", keypad.solution(new int[]{0}, "right"));
  }

  @Test
  void solution() {
    Keypad keypad = new Keypad();

    assertEquals("LRLLLRLLRRL",
        keypad.solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right"));

    assertEquals("LRLLRRLLLRR",
        keypad.solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left"));
  }
}