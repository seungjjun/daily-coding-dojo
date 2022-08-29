import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UnfinishedRunnerTest {
  @Test
  void solution1() {
    UnfinishedRunner unfinishedRunner = new UnfinishedRunner();

    assertEquals("leo", unfinishedRunner.solution(
        new String[]{"leo", "kiki", "eden"},
        new String[]{"eden", "kiki"})
    );
  }

  @Test
  void solution2() {
    UnfinishedRunner unfinishedRunner = new UnfinishedRunner();

    assertEquals("vinko", unfinishedRunner.solution(
        new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},
        new String[]{"josipa", "filipa", "marina", "nikola"})
    );
  }

  @Test
  void solution3() {
    UnfinishedRunner unfinishedRunner = new UnfinishedRunner();

    assertEquals("jun", unfinishedRunner.solution(
            new String[]{"mislav", "stanko", "jun", "mislav", "ana", "mislav", "mislav"},
//                    "ana", "jun", "mislav", "mislav", "mislav", "mislav", "stanko"
            new String[]{"ana", "mislav", "mislav", "mislav", "mislav", "stanko"})
    );
  }

  @Test
  void solution4() {
    UnfinishedRunner unfinishedRunner = new UnfinishedRunner();

    assertEquals("mislav", unfinishedRunner.solution(
        new String[]{"mislav"},
        new String[]{})
    );
  }

//  @Test
//  void sort() {
//    UnfinishedRunner unfinishedRunner = new UnfinishedRunner();
//
//    assertArrayEquals(new String[]{"ana", "jun", "mislav", "mislav", "mislav", "mislav", "stanko"},
//        unfinishedRunner.solution(
//        new String[]{"mislav", "stanko", "jun", "mislav", "ana", "mislav", "mislav"},
//        new String[]{""})
//    );
//  }
}
