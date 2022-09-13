import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ReportResultTest {
  @Test
  void removeSameReporter() {
    ReportResult reportResult = new ReportResult();

    assertEquals(new HashMap<String,
                     HashSet<String>>(){{
                       put("ryan", new HashSet<>(List.of("con")));
    }},
        reportResult.removeSameReporter(
            new String[]{"ryan con", "ryan con", "ryan con", "ryan con"}));
  }

  @Test
  void removeSameReportee() {
    ReportResult reportResult = new ReportResult();

    assertEquals(new HashMap<String,
                     HashSet<String>>(){{
                   put("ryan", new HashSet<>(List.of("con")));
                 }},
        reportResult.removeSameReporter(
            new String[]{"ryan con", "ryan con", "ryan con", "ryan con"}));
  }

  @Test
  void solution() {
    ReportResult reportResult = new ReportResult();

    assertArrayEquals(new int[]{2, 1, 1, 0},
        reportResult.solution(new String[]{"muzi", "frodo", "apeach", "neo"},
            new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"},
            2));
  }
}
