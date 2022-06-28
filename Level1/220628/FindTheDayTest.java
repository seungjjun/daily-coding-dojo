import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheDayTest {
  @Test
  void January() {
    FindTheDay findTheDay = new FindTheDay();

    assertEquals("FRI", findTheDay.solution(1,1));
    assertEquals("FRI", findTheDay.solution(1,8));
    assertEquals("THU", findTheDay.solution(1,7));
    assertEquals("WED", findTheDay.solution(1,20));
  }

  @Test
  void otherMonth() {
    FindTheDay findTheDay = new FindTheDay();

    assertEquals("MON", findTheDay.solution(2,1));
    assertEquals("FRI", findTheDay.solution(2,26));
    assertEquals("WED", findTheDay.solution(4,13));
    assertEquals("THU", findTheDay.solution(6,30));
    assertEquals("SUN", findTheDay.solution(7,31));
    assertEquals("WED", findTheDay.solution(9,7));
    assertEquals("SUN", findTheDay.solution(12,11));

  }
}
