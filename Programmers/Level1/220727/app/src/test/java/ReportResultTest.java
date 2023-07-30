import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReportResultTest {
  @Test
  void getReportedPerson() {
    ReportResult reportResult = new ReportResult();

    assertEquals(new String[]{"muzi","frodo"},
        reportResult.solution(new String[]{"muzi","apeach","frodo","neo"},
            new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"},
            2));
  }
}
