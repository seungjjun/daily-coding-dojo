import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TirednessTest {
    @Test
    void solution() {
        Tiredness tiredness = new Tiredness();

        assertEquals(3, tiredness.solution(80, new int[][]{{80,20}, {50, 40}, {30, 10}}));
    }
}
