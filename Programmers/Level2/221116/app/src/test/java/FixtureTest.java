import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FixtureTest {
    @Test
    void solution() {
        Fixture fixture = new Fixture();

        assertEquals(3, fixture.solution(8, 4, 7));
    }

    @Test
    void solution2() {
        Fixture fixture = new Fixture();

        assertEquals(3, fixture.solution(8, 4, 5));
    }
}
