import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PhonekemonTest {
  @Test
  void selectNumber() {
    Phonekemon phonekemon = new Phonekemon();

    assertEquals(2, phonekemon.computeSelectingNumber(new int[]{3,1,2,3}));
  }

  @Test
  void DeleteRepetitionList() {
    Phonekemon phonekemon = new Phonekemon();

    assertArrayEquals(new int[]{3,1,2},
        phonekemon.solution(new int[]{3,1,2,3}));
  }

  @Test
  void selectMaxNumber() {
    Phonekemon phonekemon = new Phonekemon();

    assertEquals(3, phonekemon.solution(new int[]{1,2,3,4,5,6}));
    assertEquals(3, phonekemon.solution(new int[]{3,3,3,2,2,4}));
    assertEquals(2, phonekemon.solution(new int[]{3,3,3,2,2,2}));
  }
}
