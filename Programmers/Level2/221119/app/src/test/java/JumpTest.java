import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpTest {
    @Test
    void solution() {
        Jump jump = new Jump();

        assertEquals(5, jump.solution(4));
    }
}
