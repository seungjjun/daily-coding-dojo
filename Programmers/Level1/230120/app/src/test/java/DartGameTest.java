import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DartGameTest {
    @Test
    void solution1() {
        DartGame dartGame = new DartGame();

        assertEquals(1, dartGame.solution(new String[]{"aya", "yee", "u", "maa"}));
    }
}
