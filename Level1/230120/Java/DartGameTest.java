import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DartGameTest {
    @Test
    void solution1() {
        DartGame dartGame = new DartGame();

        assertEquals(37, dartGame.solution("1S2D*3T"));
    }

    @Test
    void solution2() {
        DartGame dartGame = new DartGame();

        assertEquals(9, dartGame.solution("1D2S#10S"));
    }

    @Test
    void solution3() {
        DartGame dartGame = new DartGame();

        assertEquals(23, dartGame.solution("1S*2T*3S"));
    }
}
