import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnFinishedRunnerTest {
    @Test
    void solution1() {
        UnFinishedRunner unFinishedRunner = new UnFinishedRunner();

        assertEquals("leo",
            unFinishedRunner.solution(
            new String[]{"leo", "kiki", "eden"},
            new String[]{"eden", "kiki"}));
    }

    @Test
    void solution2() {
        UnFinishedRunner unFinishedRunner = new UnFinishedRunner();

        assertEquals("mislav",
            unFinishedRunner.solution(
                new String[]{"ana", "mislav", "stanko", "mislav"},
                new String[]{"stanko", "ana", "mislav"}));
    }
}
