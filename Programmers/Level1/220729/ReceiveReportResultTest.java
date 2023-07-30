import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReceiveReportResultTest {
  @Test
  void solution() {
    ReceiveReportResult receiveReportResult = new ReceiveReportResult();

    assertArrayEquals(new int[]{2, 1, 1, 0},
        receiveReportResult.solution(new String[]{"muzi", "frodo", "apeach", "neo"}
            , new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}
            , 2));

    assertArrayEquals(new int[]{0, 0},
        receiveReportResult.solution(new String[]{"con", "ryan"}
            , new String[]{"ryan con", "ryan con", "ryan con", "ryan con"}
            , 3));
  }
}
