import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringDescendinOrderTest {
  @Test
  void sort() {
    StringDescendinOrder stringDescendinOrder = new StringDescendinOrder();

    assertEquals("aelpp", stringDescendinOrder.solution("apple"));
    assertEquals("Cabde", stringDescendinOrder.solution("bCaed"));
  }

  @Test
  void reversSort() {
    StringDescendinOrder stringDescendinOrder = new StringDescendinOrder();

    assertEquals("gfedcbZ", stringDescendinOrder.solution("Zbcdefg"));

  }

  @Test
  void arraySort() {
    StringDescendinOrder stringDescendinOrder = new StringDescendinOrder();

    assertEquals(new String[]{"c","b","A"}, stringDescendinOrder.solution("bcA"));
  }
}
