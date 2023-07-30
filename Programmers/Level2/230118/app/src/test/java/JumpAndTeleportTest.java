import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpAndTeleportTest {
    @Test
    void solution() {
        JumpAndTeleport jumpAndTeleport = new JumpAndTeleport();

        assertEquals(2, jumpAndTeleport.solution(5));
    }

    @Test
    void solution2() {
        JumpAndTeleport jumpAndTeleport = new JumpAndTeleport();

        assertEquals(5, jumpAndTeleport.solution(5000));
    }
}
