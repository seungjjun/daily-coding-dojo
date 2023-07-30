import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecretMapTest {
  @Test
  void binary() {
    SecretMap secretMap = new SecretMap();

    assertEquals("01001", secretMap.solution(5, new int[]{9}, new int[]{30}));
    assertEquals("10100", secretMap.solution(5, new int[]{20}, new int[]{30}));
    assertEquals("11100", secretMap.solution(5, new int[]{28}, new int[]{30}));
    assertEquals("10010", secretMap.solution(5, new int[]{18}, new int[]{30}));
    assertEquals("01011", secretMap.solution(5, new int[]{11}, new int[]{30}));
  }

  @Test
  void totalMapBinary() {
    SecretMap secretMap = new SecretMap();

    assertEquals("11111", secretMap.solution(5, new int[]{9, 20, 28, 18, 11},
        new int[]{30, 1, 21, 17, 28}));
    assertEquals("10101", secretMap.solution(5, new int[]{9, 20, 28, 18, 11},
        new int[]{30, 1, 21, 17, 28}));
  }

  @Test
  void secretMap() {
    SecretMap secretMap = new SecretMap();

    assertArrayEquals(new String[]{"#####", "# # #", "### #", "#  ##", "#####"},
        secretMap.solution(5, new int[]{9, 20, 28, 18, 11},
            new int[]{30, 1, 21, 17, 28}));
  }
}