import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LottoTest {
  @Test
  void assumeZeroNumberRightNumber() {
    Lotto lotto = new Lotto();

    assertEquals(4, lotto.hopeRaffle(
        new int[]{44, 1, 0, 0, 31, 25},
        new int[]{31, 10, 45, 1, 6, 19}));

    assertEquals(6, lotto.hopeRaffle(
        new int[]{0, 0, 0, 0, 0, 0},
        new int[]{38, 19, 20, 40, 15, 25}
    ));
  }

  @Test
  void assumeZeroNumberWrongNumber() {
    Lotto lotto = new Lotto();

    assertEquals(2, lotto.despairRaffle(
        new int[]{44, 1, 0, 0, 31, 25},
        new int[]{31, 10, 45, 1, 6, 19}));

    assertEquals(0, lotto.despairRaffle(
        new int[]{0, 0, 0, 0, 0, 0},
        new int[]{38, 19, 20, 40, 15, 25}
    ));
  }

  @Test
  void rank() {
    Lotto lotto = new Lotto();

    assertArrayEquals(new int[]{3, 5}, lotto.rank(4, 2));
  }
}
