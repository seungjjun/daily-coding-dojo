import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LandGameTest {
    @Test
    void solution() {
        LandGame landGame = new LandGame();

        assertEquals(16, landGame.solution(new int[][]{{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}}));
    }
}
