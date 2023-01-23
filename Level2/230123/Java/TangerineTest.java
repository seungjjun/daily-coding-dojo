import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TangerineTest {
    @Test
    void solution1() {
        Tangerine tangerine = new Tangerine();

        assertEquals(3, tangerine.solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
    }

    @Test
    void solution2() {
        Tangerine tangerine = new Tangerine();

        assertEquals(1, tangerine.solution(2, new int[]{1, 1, 1, 1, 2, 2, 2, 3}));
    }
}
