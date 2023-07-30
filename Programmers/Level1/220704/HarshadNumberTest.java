import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HarshadNumberTest {
  private HarshadNumber harshadNumber;

  @Test
  void sumNumber() {
    harshadNumber = new HarshadNumber();
    assertEquals(9, harshadNumber.sumCompute(18));

    harshadNumber = new HarshadNumber();
    assertEquals(2, harshadNumber.sumCompute(11));

    harshadNumber = new HarshadNumber();
    assertEquals(6, harshadNumber.sumCompute(321));
  }

  @Test
  void harshadNumber() {
    harshadNumber = new HarshadNumber();
    assertEquals(true, harshadNumber.solution(18));

    harshadNumber = new HarshadNumber();
    assertEquals(true, harshadNumber.solution(10));
  }

}