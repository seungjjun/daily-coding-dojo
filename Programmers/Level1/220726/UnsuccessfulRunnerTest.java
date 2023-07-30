import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnsuccessfulRunnerTest {
  @Test
  void solution() {
    UnsuccessfulRunner unsuccessfulRunner = new UnsuccessfulRunner();

    assertEquals("leo", unsuccessfulRunner.solution(
        new String[]{"leo", "kiki", "eden"},
        new String[]{"eden", "kiki"}));

    assertEquals("vinko", unsuccessfulRunner.solution(
        new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},
        new String[]{"josipa", "filipa", "marina", "nikola"}));

    assertEquals("mislav", unsuccessfulRunner.solution(
        new String[]{"mislav", "stanko", "mislav", "ana"},
        new String[]{"stanko", "ana", "mislav"}));
  }
}
