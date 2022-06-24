import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LottoTest {
  @Test
  void onlyResultFirstRank() {
    Lotto lotto = new Lotto();
    int[] answer = lotto.solution(new int[]{45, 4, 35, 20, 3, 9}, new int[]{20, 9, 3, 45, 4, 35});

    assertArrayEquals(new int[]{1,1}, answer);
  }

  @Test
  void otherResultRank() {
    Lotto lotto = new Lotto();
    int[] answer = lotto.solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19});

    assertArrayEquals(new int[]{3,5}, answer);
  }
}
